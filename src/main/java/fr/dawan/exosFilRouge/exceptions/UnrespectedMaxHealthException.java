package fr.dawan.exosFilRouge.exceptions;

public class UnrespectedMaxHealthException extends GameException{

    public UnrespectedMaxHealthException() {
        super("Too much health");
    }
}
