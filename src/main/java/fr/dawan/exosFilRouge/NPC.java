package fr.dawan.exosFilRouge;

public abstract class NPC extends Entity{

    public NPC(String nom, double x, double y) {
        super(nom, x, y);
    }

    public void wander()
    {
        System.out.println(super.getNom() + " erre de manière aléatoire");
        double dx = Math.random() * 2 - 1;
        double dy = Math.random() * 2 -1;
        double newX = getX() + dx;
        double newY = getY() + dy;
        System.out.println("Nouvelle position après errance : ("+newX+", "+newY+")");

    }

    @Override
    public void update() {
        super.update();
        this.wander();
    }

    public abstract void interact();
}