package fr.dawan.serialization;

import java.io.*;
import java.util.HashSet;
import java.util.Set;

public class SerializationToolsWithoutJackson {

    public static void serializeToCSV(Set<Task> taskSet, String path, String separator)
    {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(path))){
            writer.write("Title"+separator+"Status"+separator+"Completed"+separator+"Priority");
            writer.newLine();

            for (Task task : taskSet)
            {
                writer.write(task.getTitle()+separator
                        +task.getStatus()+separator
                        +task.isCompleted()+separator
                        +task.getPriority());
                writer.newLine();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static Set<Task> deserializeFromCSV(String path, String separator) throws IOException {
        Set<Task> taskSet = new HashSet<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(path))){
            String line;
            boolean isHeader = true;
            while ((line = reader.readLine()) != null)
            {
                if(isHeader)
                {
                    isHeader = false;
                    continue;
                }

                String[] data = line.split(separator);
                if(data.length != 4)
                {
                    throw new IllegalArgumentException("Format incorrect dans le fichier csv : "+line);
                }
                String title = data[0].trim();
                String description = data[1].trim();
                boolean isCompleted = Boolean.parseBoolean(data[2].trim());
                int priority = Integer.parseInt(data[3].trim());

                taskSet.add(new Task(title, description, isCompleted, priority));
            }
        }

        return taskSet;
    }
}
