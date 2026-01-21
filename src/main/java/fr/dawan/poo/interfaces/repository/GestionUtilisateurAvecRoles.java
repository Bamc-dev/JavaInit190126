package fr.dawan.poo.interfaces.repository;

import fr.dawan.poo.interfaces.model.Utilisateur;

import java.util.List;

public class GestionUtilisateurAvecRoles implements IGestionUtilisateur, IGestionRoles{

    @Override
    public void addRole(Utilisateur user, String role) {

    }

    @Override
    public void removeRole(Utilisateur user, String role) {

    }

    @Override
    public List<String> getRoles(Utilisateur user) {
        return List.of();
    }

    @Override
    public void addUser(Utilisateur user) {

    }

    @Override
    public void deleteUser(Utilisateur user) {

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
        return List.of();
    }
}
