package fr.dawan.collections;

import java.util.Objects;

public class Utilisateur {
    /* ATTRIBUTS */

    //Variables d'instance

    //Ici, elle seront null, tant qu'il y a aucune instance qui les modifies
    private String nom;
    private String prenom;

    private int age; //0

    //Variable de classe :
    private static int nbrUtilisateur;

    /*CONSTRUCTEURS*/
    //Constructeur par defaut (sans paramètre)
    public Utilisateur()
    {
        //this : référence à l'objet en lui même
        this.nom = "Inconnu";
        this.prenom = "Inconnu";
        this.setAge(0);
        nbrUtilisateur++;
    }

    public Utilisateur(String nom, String prenom, int age) {
        //this.nom = nom;
        //this.prenom = prenom;
        //this(...) : permet d'appeler un constructeur de la même classe
        //L'appel à this(...) permet de réduire la duplication de code lors de
        //la création de plusieurs et garantit que tous les constructeurs
        //partagent la même logique d'initialisation
        this(nom, prenom);
        this.setAge(age);
    }

    public Utilisateur(String nom, String prenom) {
        this();
        this.nom = nom;
        this.prenom = prenom;
    }

    /* GETTERS - SETTERS*/
    //Getter : getNomAttribut
    public int getAge()
    {
        return age;
    }

    //Setter : setNomAttribut
    public void setAge(int age)
    {
        if(age >= 0)
        {
            this.age = age;
        } else {
            System.out.println("Age invalide");
        }
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public static int getNbrUtilisateur() {
        return nbrUtilisateur;
    }

    @Override
    public String toString() {
        return "Utilisateur{" +
                "nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public int hashCode() {
        return Objects.hash(age, nom, prenom);
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj)
            return true;
        if(obj == null)
            return false;
        if(this.getClass() != obj.getClass())
            return false;
        Utilisateur other = (Utilisateur) obj;
        return this.age == other.age && Objects.equals(this.nom, other.nom) && Objects.equals(this.prenom, other.prenom);
    }
}