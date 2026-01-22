package fr.dawan.collections;

import java.util.*;
import java.util.stream.Collectors;

public class Application {
    public static void main(String[] args) {
        Utilisateur user1 = new Utilisateur("Alex", "Andry", 38);
        Utilisateur user2 = new Utilisateur("Luc", "Harne", 55);
        Utilisateur user3 = new Utilisateur("Melanie", "Mal", 24);
        Utilisateur user4 = new Utilisateur("Didier", "Tétique", 18);
        Utilisateur user5 = new Utilisateur("Mickey", "Mouse", 24);
        Utilisateur user6 = new Utilisateur("Melanie", "Mal", 24);

        System.out.println("----------------- Interface List -- Classe ArrayList ----------------");
        List<Utilisateur> usersList = new ArrayList<>();
        usersList.add(user1);
        usersList.addAll(List.of(user2, user3, user4, user5, user6));

        //Affichage classique : for et foreach

        //Affichage "moderne"
        usersList.forEach(d->
        {
            System.out.println(d);
        });
        System.out.println("=============== Methode référence ==============");
        //Affichage + "moderne"
        usersList.forEach(System.out::println);

        System.out.println("================ Exemples d'utilisation des streams ==============");
        System.out.println("1. Trier les utilisateurs par age");
        usersList.stream()
                .sorted(Comparator.comparingInt(user -> -user.getAge()))
                .forEach(System.out::println);

        System.out.println("2. Obtenir les noms tous les utilisateurs dans une liste");
        List<String> noms = usersList.stream()
                .map(user -> user.getNom())
                .collect(Collectors.toList());
        noms.forEach(System.out::println);

        System.out.println("3. Filtrer les utilisateurs de plus de 30 ans");
        usersList.stream()
                .filter(user -> user.getAge() > 30)
                .forEach(System.out::println);

        System.out.println("4 . Vérifier si tous les utilisateurs sont majeurs");
        System.out.println("Tous majeurs ? " + usersList.stream()
                .allMatch(user -> user.getAge() >= 18));

        System.out.println("5. Au moins un utilisateur est majeur");
        System.out.println("Tous majeurs ? " + usersList.stream()
                .anyMatch(user -> user.getAge() >= 18));

        System.out.println("6. Obtenir la moyenne d'age des utilisateurs");
        System.out.println("Moyenne d'age : " + usersList.stream()
                .mapToInt(Utilisateur::getAge)
                .average()
                .orElse(0));

        System.out.println("7. Trouver l'utilisateur le plus jeune");
        usersList.stream()
                .min(Comparator.comparingInt(Utilisateur::getAge))
                .ifPresent(System.out::println);

        System.out.println("8. Grouper les utilisateurs par age");
        Map<Integer, List<Utilisateur>> usersByAge = usersList.stream()
                .collect(Collectors.groupingBy(Utilisateur::getAge));
        usersByAge.forEach((age, users) ->
        {
            System.out.println("Age : "+age);
            users.forEach(System.out::println);
        });

        System.out.println("9. Obtenir une chaine de noms séparés par une virgule");
        String nomsSepares = usersList.stream()
                .map(Utilisateur::getNom)
                .distinct()
                .collect(Collectors.joining(" , "));
        System.out.println(nomsSepares);

        System.out.println("10. Collecter les utilisateurs dans un Set pour éviter les doublons");
        //Les Sets ne permettent pas d'avoir des doublons
        Set<Utilisateur> uniqueUsers = new HashSet<>(usersList);

        System.out.println("------------ Interface Map -- Classe HashMap ---------------");
        Map<Utilisateur, Integer> mapUsers = new HashMap<>();
        mapUsers.put(user1, 1001);
        mapUsers.put(user2, 1002);
        mapUsers.put(user3, 1003);
        mapUsers.put(user4, 1004);
        mapUsers.put(user5, 1005);
        mapUsers.put(user6, 1006);

        System.out.println("11 . Parcourir Map avec Streams et valeur > 1003");
        mapUsers.entrySet().stream()
                .filter(entry -> entry.getValue() > 1003)
                .forEach(entry -> System.out.println(entry.getKey() + " - " + entry.getValue()));

        System.out.println("12. Extraire les clés de la Map");
        mapUsers.keySet().forEach(System.out::println);

        System.out.println("13. Trouver la clé associée à une valeur spécifique");
        mapUsers.entrySet().stream()
                .filter(entry -> entry.getValue() == 1005)
                .map(Map.Entry::getKey)
                .forEach(System.out::println);
    }
}
