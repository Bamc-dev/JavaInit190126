package fr.dawan.enumerator;

public enum Status {
    PENDING("En attente"),
    IN_PROGRESS("En cours"),
    COMPLETED("Terminé");

    private String description;

    //En privé càd que chaque valeur (PENDING, IN_PROGRESS, COMPLETED) l'appelera une seule et unique fois
    private Status(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        return description;
    }
}
