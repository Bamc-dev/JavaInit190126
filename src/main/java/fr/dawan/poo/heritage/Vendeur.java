package fr.dawan.poo.heritage;

public class Vendeur extends Utilisateur {

    private int numeroVendeur;


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
}
