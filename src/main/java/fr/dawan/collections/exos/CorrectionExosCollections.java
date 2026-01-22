package fr.dawan.collections.exos;

import java.util.*;
import java.util.stream.Collectors;

public class CorrectionExosCollections {
    public static void main(String[] args) {
        List<Task> tasks = Arrays.asList(
                new Task("Develop Feature X", "In Progress", 1, 8),
                new Task("Fix Bug Y", "Pending", 2, 4),
                new Task("Write Documentation", "Completed", 3, 2),
                new Task("Code Review", "In Progress", 2, 6),
                new Task("Team Meeting", "Pending", 3, 1),
                new Task("Deploy Application", "Completed", 1, 3)
        );

        System.out.println("========= 1 ============");
        List<Task> completedTasks = tasks.stream()
                .filter(task -> task.getStatus().equals("Completed"))
                .collect(Collectors.toList());
        completedTasks.forEach(System.out::println);

        System.out.println("========= 2 ============");

        tasks.stream()
                .filter(task -> task.getPriority() == 1)
                .forEach(System.out::println);

        System.out.println("========= 3 ============");
        tasks.stream()
                .sorted(Comparator.comparingInt(Task::getDuration))
                .forEach(System.out::println);

        System.out.println("========= 4 ============");
        List<Task> bisortedTasks = tasks.stream()
                .sorted(Comparator.comparing(Task::getStatus).thenComparingInt(Task::getPriority))
                .collect(Collectors.toList());
        bisortedTasks.forEach(System.out::println);

        System.out.println("====== 5 =========");

        List<String> titles = tasks.stream()
                .map(Task::getTitle)
                .toList();
        titles.forEach(System.out::println);

        System.out.println("------------------ 6 -----------------");
        List<String> durationTitles = tasks.stream()
                .filter(task -> task.getDuration() > 5)
                .map(Task::getTitle)
                .toList();
        durationTitles.forEach(System.out::println);

        System.out.println("=============== 7 ==============");
        System.out.println("Durée total : " + tasks.stream()
                .mapToInt(Task::getDuration)
                .sum());

        System.out.println("=========== 8 ===============");
        tasks.stream()
                .filter(t -> t.getPriority() == 2)
                .mapToInt(Task::getDuration)
                .average()
                .ifPresent(avg -> System.out.println("Moyenne: " + avg));
        System.out.println("============== 9 ============");
        System.out.println(tasks
                .stream()
                .anyMatch(match -> Objects.equals("In Progress", match.getStatus())));

        //Alternative
        boolean inProgresTask = tasks.stream()
                .anyMatch(task -> task.getStatus().equals("In Progress"));

        System.out.println("============= 10 ===============");
        tasks.stream()
                .filter(t -> t.getDuration() < 3)
                .findFirst()
                .ifPresent(t -> System.out.println(t));

        System.out.println("============ 11 ==========");
        Map<String, List<Task>> taskByStatus = tasks.stream()
                .collect(Collectors.groupingBy(Task::getStatus));
        taskByStatus.forEach((status, task) -> {
            System.out.println("Statut : " + status);
            task.forEach(System.out::println);
        });

        System.out.println("============ 12 ===============");
        Map<Integer, Long> taskCountByPriority = tasks.stream()
                .collect(Collectors.groupingBy(
                        Task::getPriority,
                        Collectors.counting()
                ));
        taskCountByPriority.forEach((priority,nbr)->
        {
            System.out.println(priority + " " + nbr);
        });

        System.out.println("=============== 13 ================");
        List<Task> longTasks = tasks.stream()
                .filter(t -> t.getDuration() > 4)
                .collect(Collectors.toList());
        longTasks.forEach(System.out::println);
        System.out.println("============== 14 ============");
        System.out.println(tasks
                .stream()
                .map(Task::getTitle)
                .collect(Collectors.joining(", ")));

        System.out.println("============== 15 ===============");
        List<Task> shortTasks = tasks.stream()
                .sorted(Comparator.comparing(Task::getDuration))
                .limit(3)
                .collect(Collectors.toList());
        shortTasks.forEach(System.out::println);

        System.out.println("=========== 16 =============");

        List<Task> filteredTasks = tasks.stream()
                .filter(task -> task.getPriority() == 1)
                .filter(task -> task.getDuration() > 5)
                .toList();
        filteredTasks.forEach(System.out::println);

        System.out.println("=========== 17 ===========");
        tasks.stream()
                .max(Comparator.comparingInt(Task::getDuration))
                .ifPresent(System.out::println);

        System.out.println("======= 18 =========");
        Map<Boolean, List<Task>> partitionedTasks = tasks.stream()
                .collect(Collectors.partitioningBy(t -> t.getPriority() == 1));

        partitionedTasks.forEach((isPriorityOne, taskList) -> {
            System.out.println(isPriorityOne ? "Priorité 1 :" : "Autres :");
            taskList.forEach(t -> System.out.println("  " + t));
        });

        System.out.println("======== 19 ==========");
        System.out.println(tasks
                .stream()
                .collect(Collectors.toMap(
                        task -> task,
                        task -> task.getDuration() * task.getPriority()))
        );
        System.out.println("========= 20 ============");
        Map<String, Integer> titleToDuration = tasks.stream()
                .collect(Collectors.toMap(Task::getTitle, Task::getDuration));
        System.out.println(titleToDuration);
    }
}
