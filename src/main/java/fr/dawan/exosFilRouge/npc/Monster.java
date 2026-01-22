package fr.dawan.exosFilRouge.npc;

import fr.dawan.exosFilRouge.NPC;
import fr.dawan.exosFilRouge.Player;
import fr.dawan.exosFilRouge.exceptions.NegativHealthException;
import fr.dawan.exosFilRouge.exceptions.UnrespectedMaxHealthException;

public class Monster extends NPC {

    private int damage;

    public Monster(String nom, double x, double y, int damage) {
        super(nom, x, y);
        this.damage = damage;
    }

    public void attack(Player player)
    {
        System.out.println(this.getNom() + " attacks " + player.getNom() + " for " + this.damage + " damage!");
        try {
            player.takeDamage(this.damage);
        } catch (NegativHealthException | UnrespectedMaxHealthException e) {
            System.out.println(e.getMessage());
        }
    }

    @Override
    public void interact() {
        System.out.println(this.getNom() + " fait un bruit de monstre");
    }

    @Override
    public void update() {
        super.update();
        this.wander();
        this.render();
    }
}
