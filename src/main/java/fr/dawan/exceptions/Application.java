package fr.dawan.exceptions;

public class Application {
    public static void main(String[] args) {
        CompteBancaire cb1 = new CompteBancaire("AFD875", 25000);
        CompteBancaire cb2 = new CompteBancaire("YT8522", 100);

        CompteBancaire cb3 = null;

        try {
            cb2.retirer(-250);
        } catch (MontantInvalidException | SoldeInsuffisantException e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
        }

        try {
            cb1.virement(cb3, 5000);
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
        }

        try {
            cb1.virement(cb2, 5000);
        } catch (SoldeInsuffisantException | MontantInvalidException | CompteIntrouvableException |
                 VirementMemeCompteException e) {
            System.out.println(e.getMessage());
        }finally {
            System.out.println("Retour a l'acceuil");
        }
    }
}
