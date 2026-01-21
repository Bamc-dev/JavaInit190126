package fr.dawan.javabase;

public class OperatorsAndConditions {
    public static void main(String[] args) {
        // **** Operators ****
        int a = 10, b = 3;

        float c = 10.0F;
        System.out.println("------------- Operateurs Arithmetiques --------------------");
        System.out.println("Addition : " + (a + b));
        System.out.println("Soustraction : " + (a - b));
        System.out.println("Division : " + ((float) a / b)); // Uniquement l'entier si il n'y a pas le casting
        System.out.println("Division : " + (c / b));
        System.out.println("Multiplication : " + (a * b));
        System.out.println("Modulo : " + (a % b));

        System.out.println("----------------- Operateurs comparaisons -------------------");
        System.out.println("Is a equal to b ? " + (a == b));
        System.out.println("Is a not equal to b ? "+(a != b));
        System.out.println("Is a greater than b ? " + (a > b));
        System.out.println("Is a less than or equal to b "+ (a <= b));

        System.out.println("----------------- Operateurs Logiques -------------------");
        boolean x = true, y = false;
        System.out.println("x AND y "+ (x && y)); //Return false
        System.out.println("x OR y "+ (x || y)); // Return true
        System.out.println("NOT x : " + (!x));

        //4. Bitwise Operators
        // Le binaire base de deux valeurs : 0,1
        //Pour 5 on va avoir : 0101 -> 0 x 2^3 + 1 x 2^2 + 0 x 2^1 + 2^0 ( = 1)
        // 11111 = 31
        System.out.println("----------------- Bitwise Operators -------------------");
        int o = 5, d = 7;
        System.out.println("Bitwise AND : "+ (o & d)); // 0101 & 0111 = 0101 (5)
        System.out.println("Bitwise OR : "+ (o | d)); // 0101 | 0111 = 0111 (7)
        System.out.println("Bitwise XOR : "+ (o ^ d)); // 0101 ^ 0111 = 0010 (2)

        System.out.println("----------------- Operateurs d'Assignements -------------------");
        int e = 10;
        e += 5; //On reprend la valeur initial, on lui ajoute la valeur de droite. (Peut se faire avec + - * /)
        System.out.println("After += 5 | "+e);
        int f = 10;
        f /= 2;
        System.out.println("After /= f : "+f);

        System.out.println("----------------- Operateurs Incrémentations -------------------");
        int i = 10;
        System.out.println("Post-increment : "+(i++)+" After "+i++);
        System.out.println("After : "+(i));
        System.out.println("Pre-Increment : "+(++i));

        System.out.println("Decrement : "+(--i));

        System.out.println("----------------- -------------------");
        System.out.println("----------------- Conditions -------------------");
        System.out.println("-----------------  -------------------");

        int number = 20;

        if(number > 0)
            System.out.println("Number is positive"); // Syntaxe une seule ligne (pas besoin d'accolade)
        else if (number < 0)
        {
            System.out.println("Number is negative");
        }
        else {
            System.out.println("Number is Zero");
        }
        
        //Exercice interval
        //Saisir = Entrée utilisateur
        //Saisir un nombre et dire s'il fait parti de l'interval -4 (exclus) et 9 (inclus) ==>

        System.out.println("----------- SWITCH CASE ---------------");
        int jour = 4;
        switch (jour)
        {
            case 1:
                System.out.println("Lundi");
                break;
            case 2:
                System.out.println("Mardi");
                break;
            case 3:
                System.out.println("Mercredi");
                break;
            case 4:
                System.out.println("Jeudi");
                break;
            case 5:
                System.out.println("Vendredi");
                break;
            case 6:
                System.out.println("Samedi");
                break;
            case 7:
                System.out.println("Dimanche");
                break;
        }

        switch (jour)
        {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("Jour de travail");
                break;
            case 6:
            case 7:
                System.out.println("Weekend");
                break;
            default:
                System.out.println("Nombre introuvable");

        }

        //Nouvelle syntaxe (java 14)
        switch (jour)
        {
            case 1 -> {
                System.out.println("Lundi");
                System.out.println("Début de la semaine");
            }
            case 2 -> {
                System.out.println("Mardi");
            }
            case 3 -> {
                System.out.println("Mercredi");
            }
            case 4 -> {
                System.out.println("Jeudi");
            }
            case 5 -> System.out.println("Vendredi");
            case 6 -> System.out.println("Samedi");
            case 7 -> System.out.println("Dimanche");
            default -> System.out.println("Nombre du jour incorrect");
        }

        switch (jour)
        {
            case 1,2,3,4,5 -> System.out.println("Jour de travail");
            case 6,7 -> System.out.println("Weekend");
            default -> System.out.println("Jour de travail introuvable");
        }

        System.out.println("============Operateur ternaire============");
        int age = 19;
        String message;
        char genre = 'F';

        message = (age >= 18) ? "majeur" : "mineur";

        message = (age >= 18)
                ? ((genre == 'F') ? "majeur et une femme" : "majeur et un homme")
                : ((genre == 'F') ? "mineur et une fille" : "mineur et un garcon");
        System.out.println(message);
    }
}
