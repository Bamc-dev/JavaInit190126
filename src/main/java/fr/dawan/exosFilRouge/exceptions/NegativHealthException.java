package fr.dawan.exosFilRouge.exceptions;

public class NegativHealthException extends GameException {
    public NegativHealthException() {
        super("Health negativ");
    }
}
