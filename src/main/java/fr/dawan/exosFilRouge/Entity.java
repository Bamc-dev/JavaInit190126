package fr.dawan.exosFilRouge;

public abstract class Entity implements IUpdatable {
    private String nom;
    private double x, y;

    public Entity(String nom, double x, double y) {
        this.nom = nom;
        this.x = x;
        this.y = y;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    @Override
    public void update()
    {
        System.out.println(this.nom + " update!");
    }

    public void render()
    {
        System.out.println(" Nom : " + this.nom + ", Position ("+this.x+", "+y+")");
    }
}
