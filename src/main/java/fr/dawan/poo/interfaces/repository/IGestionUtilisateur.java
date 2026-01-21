package fr.dawan.poo.interfaces.repository;

import fr.dawan.poo.interfaces.model.Utilisateur;

import java.util.List;

public interface IGestionUtilisateur {

    void addUser(Utilisateur user);
    void deleteUser(Utilisateur user);
    void updateUser(Utilisateur user);
    Utilisateur getUser(int id);
    List<Utilisateur> getAllUsers();

    default void printMyFunction()
    {
        System.out.println("From default function");
    }
}
