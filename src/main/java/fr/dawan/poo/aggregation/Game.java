package fr.dawan.poo.aggregation;

public class Game {
    public static void main(String[] args) {
        Arme masterSword = new Arme("Master Sword");

        Joueur joueur = new Joueur("Link", masterSword);

        joueur.attaquer();
    }
}
