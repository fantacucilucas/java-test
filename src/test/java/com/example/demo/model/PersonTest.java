package com.example.demo.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {

    @Test
    public void givenANewUser_whenCreatingWithValidInputs_thenShouldExecuteSuccessfully(){
        Person person = new Person("Lucas");
    }

    @Test
    public void givenANewUser_whenCreatingWithoutAValidName_thenShouldThrownIllegalArgumentException(){
        assertThrows(IllegalArgumentException.class, () -> {
            Person person = new Person("");
        });
    }
}
