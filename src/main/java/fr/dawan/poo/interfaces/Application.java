package fr.dawan.poo.interfaces;

import fr.dawan.poo.interfaces.model.Client;
import fr.dawan.poo.interfaces.repository.*;

import java.util.ArrayList;
import java.util.List;

public class Application {

    public static void main(String[] args) {

        //V1 qui est l'implémentation
        GestionUtilisateurImplV1 v1 = new GestionUtilisateurImplV1();
        v1.addUser(new Client());
        IGestionUtilisateur v2 = new GestionUtilisateurImplV2();
        List<IGestionUtilisateur> allServices = new ArrayList<>();
        allServices.addAll(List.of(v1, v2));
        allServices.forEach(v->
        {
            v.getAllUsers();
        });

        IGestionUtilisateur v3 = new GestionUtilisateurAvecRoles();
        IGestionRoles v3withRoles = new GestionUtilisateurAvecRoles();
        v3.getAllUsers();
        //v3withRoles.addRole();

    }
}
