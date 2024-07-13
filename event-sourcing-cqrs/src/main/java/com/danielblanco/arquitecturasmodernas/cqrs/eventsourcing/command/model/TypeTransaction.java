package com.danielblanco.arquitecturasmodernas.cqrs.eventsourcing.command.model;

public enum TypeTransaction {
    INSERT("Insert"),
    UPDATE("Update"),
    DELETE("Delete");

    private final String type;

    TypeTransaction(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

}
