package fr.dawan.exosFilRouge;

import fr.dawan.exosFilRouge.exceptions.InvalidMovementException;
import fr.dawan.exosFilRouge.exceptions.NegativHealthException;
import fr.dawan.exosFilRouge.exceptions.UnrespectedMaxHealthException;

public class Player extends Entity{

    private int health;

    private static final int MAX_HEALTH = 100;

    public Player(String nom, double x, double y, int health) throws NegativHealthException, UnrespectedMaxHealthException {
        super(nom, x, y);
        this.setHealth(health);
    }

    public void move(double dx, double dy) throws InvalidMovementException {
        if((super.getX() + dx < -10 || super.getX() + dx > 10)
        || (super.getY() + dy < -10 || super.getY() + dy > 10))
        {
            throw new InvalidMovementException();
        }
        System.out.println(super.getNom() + " se déplace de ("+dx+" , "+dy+")");
        setX(super.getX() + dx);
        setY(super.getY() + dy);
        System.out.println("Nouvelle position : ("+super.getX()+", "+super.getY()+")");
    }

    public void takeDamage(int damage) throws NegativHealthException, UnrespectedMaxHealthException {
        setHealth(this.health-damage);
    }

    @Override
    public void update() {
        super.update();
        System.out.println(super.getNom() + " est en train de jouer avec "+this.health+"points de vie");
    }

    public void setHealth(int health) throws UnrespectedMaxHealthException, NegativHealthException {
        if (this.health > MAX_HEALTH)
        {
            throw new UnrespectedMaxHealthException();
        }
        if (health<0)
        {
            throw new NegativHealthException();
        }
        this.health = health;
    }
}