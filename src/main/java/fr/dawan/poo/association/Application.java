package fr.dawan.poo.association;

public class Application {
    public static void main(String[] args) {
        Adresse adresse = new Adresse("1 rue du Capitol", "Toulouse", "31000");
        Utilisateur user = new Utilisateur("Otto", "Matique", 52, adresse);
        user.afficherInformation();
    }
}
