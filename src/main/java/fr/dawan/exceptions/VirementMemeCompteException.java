package fr.dawan.exceptions;

public class VirementMemeCompteException extends Exception {
    public VirementMemeCompteException() {
        super("Virement impossible. Vous ne pouvez pas effectuer un virement sur le meme compte.");
    }
}
