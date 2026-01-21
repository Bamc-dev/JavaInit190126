package fr.dawan.poo.interfaces.model;

public class Client extends Utilisateur {

    private String numClient;
    private boolean subscribe;

    private double achatsTotal;

    private final double POURCENT_CLIENT = 0.2;

    public Client() {
        super();
    }

    public Client(String nom, String prenom, int age, String numClient, boolean subscribe) {
        super(nom, prenom, age);
        this.numClient = numClient;
        this.subscribe = subscribe;
    }

    public String getNumClient() {
        return numClient;
    }

    public void setNumClient(String numClient) {
        this.numClient = numClient;
    }

    public boolean isSubscribe() {
        return subscribe;
    }

    public void setSubscribe(boolean subscribe) {
        this.subscribe = subscribe;
    }

    @Override
    public void afficherInformation() {
        super.afficherInformation();
        System.out.println("Numero du client : " + this.numClient);
        System.out.println("Subscribe : " + (this.subscribe ? "Oui" : "Non"));
    }

    @Override
    public double calculerPoint() {
        return achatsTotal * POURCENT_CLIENT;
    }

    public void buy(double montant)
    {
        if (montant > 0)
        {
            this.achatsTotal += montant;
        }
        else {
            System.out.println("Le montant est invalide");
        }
    }
}
