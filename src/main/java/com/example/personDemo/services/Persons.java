package com.example.personDemo.services;

import com.example.personDemo.model.Person;

import java.util.List;

public interface Persons {
  Person personAdd(Person persons);
  Person findByid(int id);

  List<Person> getAll();
  String deleteById(int id);


}
