package fr.dawan.exosFilRouge;

import fr.dawan.exosFilRouge.npc.Monster;
import fr.dawan.exosFilRouge.npc.Seller;

import java.util.List;

public class Game {
    public static void main(String[] args) {
        Player player = new Player("Hero", 0, 0, 100);
        NPC seller = new Seller("Goblin", 5, 5, List.of("Epee", "Bouclier", "Arc"));
        Monster monster = new Monster("Orc", -3, 2, 10);
        Scene scene = new Scene(List.of(player, seller, monster));
        scene.renderAllEntity();

        System.out.println("\n--- Interactions ---");
        seller.interact();
        monster.interact();
        monster.attack(player);


        System.out.println("\n--- Déplacement du joueur ---");
        player.move(2, 3);
        System.out.println("Player movement X : "+player.getX()+ ", Y : "+player.getY());
        player.update();

        scene.renderAllEntity();
        player.update();
    }
}