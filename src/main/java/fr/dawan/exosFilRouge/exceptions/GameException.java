package fr.dawan.exosFilRouge.exceptions;

public class GameException extends Exception{

    public GameException(String message) {
        super("ERREUR : "+message);
    }


}
