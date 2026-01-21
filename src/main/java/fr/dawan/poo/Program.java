package fr.dawan.poo;

public class Program {
    public static void main(String[] args) {
        Utilisateur user1 = new Utilisateur();
        System.out.println(user1.getPrenom());
        user1.setAge(-4);
        System.out.println(user1.getAge());

        System.out.println("Age de "+ user1.getPrenom() + " "+user1.getAge() + " ans");
        System.out.println(user1);

        Utilisateur user2 = new Utilisateur("Jean", "Luc", 28);
        System.out.println(user2);
        System.out.println(Utilisateur.getNbrUtilisateur());

        Utilisateur user3 = new Utilisateur("Donald", "Dingo", -5);
        System.out.println(user3);
    }
}
