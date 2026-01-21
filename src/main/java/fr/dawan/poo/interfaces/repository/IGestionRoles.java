package fr.dawan.poo.interfaces.repository;

import fr.dawan.poo.interfaces.model.Utilisateur;

import java.util.List;

public interface IGestionRoles {

    void addRole(Utilisateur user, String role);
    void removeRole(Utilisateur user, String role);
    List<String> getRoles(Utilisateur user);
}
