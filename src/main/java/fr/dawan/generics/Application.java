package fr.dawan.generics;

public class Application {
    public static void main(String[] args) {
        Bibliotheque maBibliotheque = new Bibliotheque();
        maBibliotheque.ajouterLivre(new Roman("1984", "George Orwell", 1949, "Dystopie"));

        System.out.println(maBibliotheque.chercherLivreParTitre("1984").get());

        Bibliotheque<Roman> romanBibliotheque = new Bibliotheque<>();
        romanBibliotheque.ajouterLivre(new Roman("1984", "George Orwell", 1949, "Dystopie"));

    }
}
