package fr.dawan.javabase;

import java.util.Scanner;

public class CastingAndWrappers {
    public static void main(String[] args) {

        int intNumber = 100;
        long myLong = intNumber;

        System.out.println("int to long " + myLong);

        float floatNumber = intNumber;
        System.out.println("int to float "+floatNumber);

        double doubleNumber = 99.99;
        int otherInt = (int) doubleNumber; // Cast explicite
        //int otherIntOfDouble = doubleNumber; Ne marche pas car il y a une perte de données, ont doit lui dire que l'on veut "perdre la donnée"
        System.out.println("double to int "+otherInt);

        long largeNumber = 1_000_000_000_000L;
        int longToInt = (int)largeNumber;
        System.out.println("long to int "+longToInt);

        char letter = 'A';
        int myValue = (int) letter;
        System.out.println("char to int (ASCII)" + myValue);

        int charToInt = 66;
        char charValue = (char) charToInt;
        System.out.println("int to char (ASCII) : "+charValue);

        //---------------------------------------
        //Wrappers

        System.out.println("------------ Wrappers -----------------");

        //Autoboxing : Conversion automatique de types primitifs en objets
        Integer boxedInt = 15;
        Double boxedDouble = doubleNumber;

        System.out.println("Boxed Integer : "+boxedInt);
        System.out.println("Boxed Double : "+boxedDouble);

        //Unboxing : Conversion automatique d'objets en types primitifs
        int unboxedInt = boxedInt;
        double unboxedDouble = boxedDouble;
        System.out.println("Unboxed int "+unboxedInt);
        System.out.println("Unboxed double "+unboxedDouble);

        String numberString = "42";
        int parsedInt = Integer.parseInt(numberString);
        System.out.println("Parsed Integer "+parsedInt);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Entrez un nombre : ");
        int userNumber = Integer.parseInt(scanner.next());
        //userNumber = scanner.nextInt(); Équivalent a la ligne du dessus
        System.out.println("Voici votre nombre : "+userNumber);

        System.out.println("Integer Max "+Integer.MAX_VALUE);
        System.out.println("Integer Min "+Integer.MIN_VALUE);

    }
}
