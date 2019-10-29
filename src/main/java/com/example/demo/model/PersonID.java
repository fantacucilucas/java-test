package com.example.demo.model;

import java.util.UUID;

public class PersonID {

    private UUID personID;

    public PersonID(){
        this.personID = UUID.randomUUID();
    }

    public PersonID(String id){
        this.personID = UUID.fromString(id);
    }

    public UUID getPersonID() {
        return personID;
    }
}
