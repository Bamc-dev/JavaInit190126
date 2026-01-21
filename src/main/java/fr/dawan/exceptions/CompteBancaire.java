package fr.dawan.exceptions;

public class CompteBancaire {
    private String numero;
    private double solde;

    private static int nbComptes;

    public CompteBancaire(String numero, double solde) {
        this.numero = numero;
        this.solde = solde;
        nbComptes++;
    }

    public String getNumero() {
        return numero;
    }

    public void retirer(double montant) throws MontantInvalidException, SoldeInsuffisantException
    {
        if(montant < 0)
        {
            //System.out.println("Montant invalid, il doit etre positif");
            throw new MontantInvalidException("Montant invalid, il doit etre positif");
        } else if (montant > solde)
        {
            //System.out.println("Montant invalid, solide insuffisant");
            throw new SoldeInsuffisantException("Montant invalid, solide insuffisant");
        }else
        {
            this.solde -= montant;
            System.out.println("Retrait de "+montant+" effectué. Nouveau solde : "+this.solde);
        }
    }

    public void verser(double montant) throws MontantInvalidException
    {
        if(montant < 0)
        {
            throw new MontantInvalidException("Montant invalid. Le montant doit etre positif");
        }
        else
        {
            this.solde += montant;
            System.out.println("Versement de "+montant+" effectué. Nouveau solde : "+this.solde);
        }
    }

    public void virement(CompteBancaire compteDestinataire, double montant)
            throws SoldeInsuffisantException,
            MontantInvalidException,
            CompteIntrouvableException,
            VirementMemeCompteException
    {
        if(compteDestinataire == null)
        {
            throw new CompteIntrouvableException("Virement impossible : Le compte destinataire n'existe pas");
        }
        if(montant > this.solde)
        {
            throw new SoldeInsuffisantException("Solde insuffisant pour le retrait actuel : "+this.solde);
        }
        if(montant<0)
        {
            throw new MontantInvalidException("Montant invalid. Le montant doit etre psotifi");
        }
        if(this.equals(compteDestinataire))
        {
            throw new VirementMemeCompteException();
        }
        this.retirer(montant);
        compteDestinataire.verser(montant);
    }
}
