package fr.dawan.poo.interfaces.repository;

import fr.dawan.poo.interfaces.model.Utilisateur;

import java.util.List;

public class GestionUtilisateurImplV2 implements IGestionUtilisateur{
    @Override
    public void addUser(Utilisateur user) {
        System.out.println("MongoDB - Add user");
    }

    @Override
    public void deleteUser(Utilisateur user) {
        System.out.println("MongoDB - Delete user");

    }

    @Override
    public void updateUser(Utilisateur user) {

    }

    @Override
    public Utilisateur getUser(int id) {
        return null;
    }

    @Override
    public List<Utilisateur> getAllUsers() {
        System.out.println("MongoDB - Get all users");
        return List.of();
    }
}
