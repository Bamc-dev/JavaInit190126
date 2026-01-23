package fr.dawan.generics;

public abstract class Livre {
    private final String titre;
    private final String auteur;
    private final int anneePublication;

    public Livre(String titre, String auteur, int anneePublication) {
        this.titre = titre;
        this.auteur = auteur;
        this.anneePublication = anneePublication;
    }

    public String getTitre() {
        return titre;
    }

    public String getAuteur() {
        return auteur;
    }

    public int getAnneePublication() {
        return anneePublication;
    }

    @Override
    public String toString() {
        return "Livre{" +
                "titre='" + titre + '\'' +
                ", auteur='" + auteur + '\'' +
                ", anneePublication=" + anneePublication +
                '}';
    }
}
