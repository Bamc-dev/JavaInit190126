package fr.dawan.poo.abstraction;


public class Vendeur extends Utilisateur {

    private int numeroVendeur;
    private double ventesTotals;

    private final double POURCENT_VENDEUR = 0.3;


    public Vendeur() {
        super();
    }

    public Vendeur(String nom, String prenom, int age, int numeroVendeur) {
        super(nom, prenom, age);
        this.numeroVendeur = numeroVendeur;
    }

    public int getNumeroVendeur() {
        return numeroVendeur;
    }

    public void setNumeroVendeur(int numeroVendeur) {
        this.numeroVendeur = numeroVendeur;
    }

    @Override
    public void afficherInformation() {
        super.afficherInformation();
        System.out.println("Numero du vendeur : "+this.numeroVendeur);
    }

    @Override
    public double calculerPoint() {
        return this.ventesTotals * POURCENT_VENDEUR;
    }

    public void sells(double montant)
    {
        if(montant > 0)
        {
            this.ventesTotals += montant;
        }
        else {
            System.out.println("Montant invalide");
        }
    }
}
