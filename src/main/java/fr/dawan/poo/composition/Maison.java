package fr.dawan.poo.composition;

import java.util.Objects;

public class Maison {
    private String nom;
    private Piece salon;
    private Piece cuisine;

    public Maison(String nom, String nomSalon, String nomCuisine) {
        this.nom = nom;
        this.salon = new Piece(nomSalon);
        this.cuisine = new Piece(nomCuisine);
    }

    public void afficher()
    {
        System.out.println(nom + " contient " + salon.getNom() + ", "+cuisine.getNom());
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Maison maison = (Maison) o;
        return Objects.equals(nom, maison.nom);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(nom);
    }
}
