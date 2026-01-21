package fr.dawan.poo.composition;

public class Application {
    public static void main(String[] args) {
        Maison maison = new Maison("Maison de Vincent", "Salon", "Cuisine");
        maison.afficher();
        System.out.println(maison);
    }
}
