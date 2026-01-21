package fr.dawan.poo.interfaces.repository;

import fr.dawan.poo.interfaces.model.Utilisateur;

import java.util.List;

public class GestionUtilisateurImplV1 implements IGestionUtilisateur {
    @Override
    public void addUser(Utilisateur user) {
        System.out.println("SQL - Insert success user : "+user);
    }

    @Override
    public void deleteUser(Utilisateur user) {
        System.out.println("SQL - Delete success user : "+user);

    }

    @Override
    public void updateUser(Utilisateur user) {
        System.out.println("SQL - Update success user : "+user);
    }

    @Override
    public Utilisateur getUser(int id) {
        System.out.println("SQL - Get user with id "+id);
        return null;
    }

    @Override
    public List<Utilisateur> getAllUsers() {
        System.out.println("SQL - Get all users");
        return List.of();
    }
}
