package fr.dawan.generics;

public class Encyclopedie extends Livre{

    private final String domaine;

    public Encyclopedie(String titre, String auteur, int anneePublication, String domaine) {
        super(titre, auteur, anneePublication);
        this.domaine = domaine;
    }

    public String getDomaine() {
        return domaine;
    }

    @Override
    public String toString() {
        return super.toString()+" Encyclopedie{" +
                "domaine='" + domaine + '\'' +
                '}';
    }
}
