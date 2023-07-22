package com.example.personDemo.controller;


import com.example.personDemo.model.Person;
import com.example.personDemo.services.Persons;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
public class PersonController {
    @Autowired
    private Persons persons;

@PostMapping("/add")
  public  ResponseEntity<Person> createPerson(@RequestBody Person person){
        Person personAdd = persons.personAdd(person);
        return new ResponseEntity<>(personAdd,HttpStatus.CREATED);
    }
@GetMapping("/person/{id}")
public ResponseEntity<Person> getPesonById(@PathVariable int id){
    Person person = persons.findByid(id);
    if (person==null){
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }
    else {
        return new ResponseEntity<>(person,HttpStatus.OK);
    }
}
@GetMapping("/getAllPerson")
public ResponseEntity<List<Person>> getAllPerson(){
    List<Person> personList = persons.getAll();
    return new ResponseEntity<>(personList,HttpStatus.OK);
}

@DeleteMapping("/person/{id}")
public String deleteById(@PathVariable int id){
    String deletedById = persons.deleteById(id);
    return deletedById;
}


    }


