package fr.dawan.exosFilRouge.npc;

import fr.dawan.exosFilRouge.NPC;
import fr.dawan.exosFilRouge.Player;

public class Monster extends NPC {

    private int damage;

    public Monster(String nom, double x, double y, int damage) {
        super(nom, x, y);
        this.damage = damage;
    }

    public void attack(Player player)
    {
        System.out.println(this.getNom() + " attacks " + player.getNom() + " for " + this.damage + " damage!");
        player.takeDamage(this.damage);
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
