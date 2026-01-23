package fr.dawan.enumerator;

public class Application {
    public static void main(String[] args) {
        Task tache = new Task("Courir", Status.COMPLETED, false, 2);
        System.out.println(tache.getStatus().getDescription());

        for (Status status : Status.values())
        {
            System.out.println(status + " " + status.getDescription());
        }
    }
}
