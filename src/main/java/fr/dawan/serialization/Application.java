package fr.dawan.serialization;

import java.io.IOException;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Application {
    public static void main(String[] args) {
        Set<Task> taskSet = new HashSet<>();
        taskSet.addAll(List.of(new Task("Manger", "Se préparer un bon repas ", false, 2),
                new Task("Révision Java", "Etudier les streams et les collections", false, 1),
                new Task("Faire du sport", "Course a pied", false, 1)));

        String binPath = "tasks.bin";
        String jsonPath = "tasks.json";
        String xmlPath = "tasks.xml";

        try {
            SerializationTool.serializeToBin(taskSet, binPath);
            System.out.println("Serialization binaire");

            Set<Task> loadedTasksFromBin = SerializationTool.deserializeFromBin(binPath);
            System.out.println("Taches chargés depuis le fichier binaire : "+loadedTasksFromBin);

            SerializationTool.serializeToJSON(taskSet, jsonPath);
            System.out.println("Sérialization JSON");

            Set<Task> loadedTasksFromJson = SerializationTool.deserializeFromJson(jsonPath);
            System.out.println("Taches chargés depuis le fichier binaire : "+loadedTasksFromJson);

            SerializationTool.serializeToXML(taskSet, xmlPath);
            System.out.println("Serialization XML");

            Set<Task> loadedTasksFromXML = SerializationTool.deserializeFromXML(xmlPath);
            System.out.println("XML : "+loadedTasksFromXML);

        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
