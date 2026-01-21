package fr.dawan.poo.abstraction;

public class Application {

    public static void main(String[] args) {

        Utilisateur cli2 = new Client("Henry", "Pierre", 24, "7829", true);

        Client cli = new Client("Henry", "Pierre", 24, "7829", true);
        cli.afficherInformation();
        cli.buy(250);
        cli.buy(150);
        System.out.println(cli.calculerPoint());
        
    }
}
