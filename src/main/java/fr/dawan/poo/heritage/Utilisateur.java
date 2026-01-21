package fr.dawan.poo.heritage;

public class Utilisateur {

    //Variables d'instance
    private String nom;
    private String prenom;

    private int age;

    //Variable de classe :
    private static int nbrUtilisateur;

    public Utilisateur()
    {
        this.nom = "Inconnu";
        this.prenom = "Inconnu";
        this.setAge(0);
        nbrUtilisateur++;
    }

    public Utilisateur(String nom, String prenom) {
        this();
        this.nom = nom;
        this.prenom = prenom;
    }


    /**
     * Notre constructeur de la classe utilisateur
     * @param nom Nom de l'utilisateur
     * @param prenom Prenom de l'utilisateur
     * @param age
     */
    public Utilisateur(String nom, String prenom, int age) {
        this(nom, prenom);
        this.setAge(age);
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age >= 0)
            this.age = age;
        else
            System.out.println("Age invalide");
    }

    public static int getNbrUtilisateur() {
        return nbrUtilisateur;
    }


    public void afficherInformation(){
        System.out.println("Nom : " + this.nom);
        System.out.println("Prenom : " + this.prenom);
        System.out.println("Age : " + this.age);
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
        nbrUtilisateur--;
    }

    @Override
    public String toString() {
        return "Utilisateur{" +
                "nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", age=" + age +
                '}';
    }
}
