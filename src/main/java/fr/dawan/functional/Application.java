package fr.dawan.functional;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class Application {
    public static void main(String[] args) {
        /*
        Programmation fonctionelle :

        Paradigme de programmation qui :

        1.Traite le calcul comme l'évaluation de fonctions mathématiques
            - Une fonction prend des entrées et produit une sortie
            - Pas d'effets de bord (side effects) dans les fonctions pures

        2. Évite les données mutables
            - Les objets ne changent pas après leur création (immutabilité)
            - Les modifications créent de nouveaux objets

        3. Utilise des fonctions comme valeurs de premiere classe
            - Les fonctions peuvent etre passées en parametres
            - Les fonctions peuvent etre retournées
            - Les fonctions peuvent etre sotckées dans des variables

        Programmation fonctionnel : Depuis Java 8 (2014)
         */


        System.out.println("=========== Comparaison : Approche impérative vs fonctionnelle ==========");

        List<Integer> nombres = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        List<Integer> pairsImperatif = new ArrayList<>();
        for (Integer n : nombres)
        {
            if (n % 2 == 0)
            {
                pairsImperatif.add(n);
            }
        }

        System.out.println("Impératif : " + pairsImperatif);

        System.out.println("======= Approche Fonctionnelle ===========");
        //On dit "QUOI" faire, pas "COMMENT"
        List<Integer> pairsFonctionnel = nombres
                .stream()
                .filter(n -> n % 2 == 0)
                .toList();
        System.out.println("Fonctionnel : "+pairsFonctionnel);

        /*
        ================
        Immutabilité
        ================

        L'immutabilité signifie qu'un objet ne peut pas etre modifié après
        sa création. C'est un concept fondamental de la programmation fonctionnelle.

        AVANTAGES :
            - Moins de bugs : Pas de modifications inattendues
            - Thread-safe : pas besoin de synchronisation
            - Plus facile à tester et déboguer
            - Comportement prévisible

        En Java :
            - String est immuable
            - Les collections peuvent etre rendues immuables avec Collections.unmodifiableList()
            - Les streams créent de nouvelles collections, ne modifient pas les originales
         */

        String texte = "Hello";
        String texteModifie = texte.toUpperCase();
        System.out.println("Original : " + texte);
        System.out.println("Modifié : " + texteModifie);
        System.out.println();

        /*
        ================================
        Fonctions pures
        ================================

        Une fonction pure est une fonction qui :

        1. Est déterministe
            - Meme entrée -> toujours la meme sortie
            - Pas de dépendance a l'etat externe
        2. N'as pas d'effets de bord
            - Ne modifie pas l'etat global
            - Ne modifie pas ses paremetres
            - Ne fait pas d'I/O (sauf si c'est le but)

        Exemple de fonction pure :
            - Math.sqrt(x) : toujours le meme résultat pour le meme x
            - String.length() : Toujours la meme longueur pour la meme chaine
        Exemple de fonction non pure :
            - System.currentTimeMillis() : résultat différent a chaque appel
            - Random.nextInt() : résultat aléatoire
         */

        System.out.println("======================== Interfaces Fonctionnelles =========================");
        /* Qu'est ce qu'une interface fonctionelle ?

        Une interface qui contient EXACTEMENT UNE méthode abstraite. Elle peut avoir des méthodes
        par défaut et statiques, mais une seule méthode abstraite.

        L'annotation @FunctionalInterface n'est pas obligatoire mais est recommandé pour la clarté
        et pour que le compilateur vérifie.

        Elles se trouvent la plupart java.util.function.
         */


        System.out.println("---- 1. FUNCTION<T, R> : Transformer une valeur");
        /*
        Méthode : R apply(T t)
         */

        Function<Integer, String> convertirEnString = nombre -> {
            System.out.println(nombre);
            return "Nombre : " + nombre;
        };
        System.out.println("Function : "+convertirEnString.apply(42));

        Function<Integer, Integer> doublerInt = nombre -> nombre * 2;
        System.out.println("Resultat "+doublerInt.apply(3));

        System.out.println("------------ Chainages de functions");

        Function<Integer, Integer> multiplerParTrois = x-> x * 3;
        Function<Integer, Integer> ajouterDix = x-> x +10;

        //andThen : D'abord multiplerPar3 puis ajouter10
        Function<Integer, Integer> chaineAndThen = multiplerParTrois.andThen(ajouterDix);
        System.out.println("5 * 3 + 10 = " + chaineAndThen.apply(5));

        // compose : D'abord ajouterDix, puis multiplierParTrois
        Function<Integer, Integer> chaineCompose = multiplerParTrois.compose(ajouterDix);
        System.out.println("(5 + 10) * 3 = " + chaineCompose.apply(5));

        System.out.println("---------- 2. PREDICATE<T> : Tester une condition");
        Predicate<Integer> estPair = n -> n % 2 == 0;
        System.out.println("4 est pair ? " + estPair.test(4));

        /*
        Methodes en plus pour Predicate :
        - and()
        - or()
        - negate()
        - isEqual()
         */
        Predicate<Integer> estPositif = n -> n > 0;
        Predicate<Integer> estPairEtPositif = estPair.and(estPositif);
        System.out.println("4 est pair et positif ? " + estPairEtPositif.test(4));
        System.out.println("-2 est pair et positif ? " + estPairEtPositif.test(-2));

        System.out.println("----------- CONSUMER<T> Effectuer une action avec une valeur");

        Consumer<String> afficher = message -> System.out.println(">>>>>>> "+message);
        afficher.accept("Hello World");

        Consumer<String> afficherEnMajuscule = s -> System.out.println(s.toUpperCase());
        Consumer<String> afficherPuisMajuscule = afficher.andThen(afficherEnMajuscule);
        afficherPuisMajuscule.accept("test");

        System.out.println("----- 4. SUPPLIER<T> : Fournir une valeur -----");
        Supplier<Integer> nombreAleatoire = () -> new Random().nextInt(100);
        System.out.println("Nombre aléatoire : " + nombreAleatoire.get());

        /*
         * ========================================================================
         * AUTRES INTERFACES FONCTIONNELLES UTILES
         * ========================================================================
         *
         * UNARYOPERATOR<T> : Function<T, T> spécialisée (même type entrée/sortie)
         * - T apply(T t)
         *
         * BINARYOPERATOR<T> : BiFunction<T, T, T> spécialisée
         * - T apply(T t1, T t2)
         *
         * BIFUNCTION<T, U, R> : Function avec 2 paramètres
         * - R apply(T t, U u)
         *
         * BIPREDICATE<T, U> : Predicate avec 2 paramètres
         * - boolean test(T t, U u)
         *
         * BICONSUMER<T, U> : Consumer avec 2 paramètres
         * - void accept(T t, U u)
         *
         * ========================================================================
         */
    }
}
