package fr.dawan.javabase;

public class DataTypes {
    public static void main(String[] args) {

        boolean isTrue = true;

        System.out.println("Voici la valeur de la variable "+isTrue);

        int number = 33000;
        System.out.println("Voici la valeur de la variable number "+number);

        short medium = 3200;
        System.out.println("Voici la valeur de la variable "+medium);

        //Deux notations possible
        //1
        //long bddId = 10_000_000_000L;
        //2
        long bddId = 10000000000L;
        System.out.println("Voici la valeur de la variable "+bddId);

        float pi = 3.14f;

        double piDouble = 3.141;

        char initial = 'B';
    }
}
