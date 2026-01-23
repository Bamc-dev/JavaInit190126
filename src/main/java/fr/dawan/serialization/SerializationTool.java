package fr.dawan.serialization;

import com.fasterxml.jackson.databind.ObjectMapper;
import tools.jackson.dataformat.xml.XmlMapper;

import java.io.*;
import java.util.Set;

public class SerializationTool {

    public static void serializeToBin(Set<Task> taskSet, String path) throws IOException {
        try (ObjectOutputStream oos = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream(path)))){
            oos.writeObject(taskSet);
        }
    }

    public static Set<Task> deserializeFromBin(String path) throws IOException, ClassNotFoundException {
        try (ObjectInputStream ois = new ObjectInputStream(new BufferedInputStream(new FileInputStream(path)))){
            return (Set<Task>) ois.readObject();
        }
    }

    public static void serializeToJSON(Set<Task> taskSet, String path) throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        mapper.writeValue(new File(path), taskSet);
    }

    public static Set<Task> deserializeFromJson(String path) throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        return mapper.readValue(new File(path), mapper.getTypeFactory().constructCollectionType(Set.class, Task.class));
    }

    //serializeToXML et deserializeFromXML
    public static void serializeToXML(Set<Task> taskSet, String path)
    {
        XmlMapper xmlMapper = new XmlMapper();
        xmlMapper.writeValue(new File(path), taskSet);
    }

    public static Set<Task> deserializeFromXML(String path)
    {
        XmlMapper xmlMapper = new XmlMapper();
        return xmlMapper.readValue(new File(path), Set.class);
    }
}
