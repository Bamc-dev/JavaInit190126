package fr.dawan.poo.heritage;

public class Application {
    public static void main(String[] args) {
        Client cli1 = new Client("Otto", "Matique", 24, "RE5414", true);
        cli1.afficherInformation();
        System.out.println("=============================================");
        Vendeur vendeur1 = new Vendeur("Mouse", "Mickey", 70, 5412);
        vendeur1.afficherInformation();
        System.out.println(Utilisateur.getNbrUtilisateur());
    }
}
