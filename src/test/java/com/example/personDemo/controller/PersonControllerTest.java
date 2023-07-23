package com.example.personDemo.controller;

import com.example.personDemo.model.Person;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class PersonControllerTest {
    @Autowired
    private PersonController personController;
    @Test
    void testGetPersonById(){
        int expectedid=52;

        ResponseEntity<Person> responseEntity=personController.getPesonById(expectedid);
        assertEquals(HttpStatus.OK,responseEntity.getStatusCode());
        assertNotNull(responseEntity.getBody());



    }



}