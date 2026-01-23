package fr.dawan.generics;

public class Roman extends Livre{

    private final String genre;


    public Roman(String titre, String auteur, int anneePublication, String genre) {
        super(titre, auteur, anneePublication);
        this.genre = genre;

    }

    public String getGenre() {
        return genre;
    }

    @Override
    public String toString() {
        return super.toString()+"Roman{" +
                "genre='" + genre + '\'' +
                "} ";
    }
}
