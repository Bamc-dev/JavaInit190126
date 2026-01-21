package fr.dawan.poo.aggregation;

public class Joueur {
    private String nom;
    private Arme arme;

    public Joueur(String nom, Arme arme) {
        this.nom = nom;
        this.arme = arme;
    }

    public void setArme(Arme arme) {
        this.arme = arme;
    }

    public void attaquer()
    {
        System.out.println(this.nom + " attaque avec : " + arme.getNom());
    }
}
