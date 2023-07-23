package com.example.personDemo.repository;

import com.example.personDemo.model.Person;
import org.springframework.data.jpa.repository.JpaRepository;


public interface PersonsRepo extends JpaRepository<Person,Integer> {

}
