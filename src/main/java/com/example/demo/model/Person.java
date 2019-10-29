package com.example.demo.model;

import org.springframework.util.StringUtils;

public final class Person {

    private PersonID personID;
    private String name;

    public Person(String name) {
        this.personID = new PersonID();
        this.setName(name);
    }

    public Person(PersonID personID, String name) {
        this.personID= personID;
        this.setName(name);
    }

    private void setName(String name){
        if(StringUtils.isEmpty(name)){
            throw new IllegalArgumentException("Name vazio ou nulo");
        }
        this.name = name;
    }

    public PersonID getPersonID() {
        return personID;
    }

    public String getName() {
        return name;
    }
}