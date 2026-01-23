package fr.dawan.serialization;

import java.io.IOException;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CSVExample {
    public static void main(String[] args) {
        Set<Task> taskSet = new HashSet<>();
        taskSet.addAll(List.of(new Task("Manger", "Se préparer un bon repas ", false, 2),
                new Task("Révision Java", "Etudier les streams et les collections", false, 1),
                new Task("Faire du sport", "Course a pied", false, 1)));

        String csvFilePath = "tasks.csv";
        String separator = ",";

        SerializationToolsWithoutJackson.serializeToCSV(taskSet, csvFilePath, separator);

        try {
            Set<Task> loadedTasks = SerializationToolsWithoutJackson.deserializeFromCSV(csvFilePath, separator);
            System.out.println(loadedTasks);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
