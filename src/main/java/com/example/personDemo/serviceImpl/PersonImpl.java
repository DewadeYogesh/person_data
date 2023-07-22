package com.example.personDemo.serviceImpl;

import com.example.personDemo.model.Person;
import com.example.personDemo.repository.PersonsRepo;
import com.example.personDemo.services.Persons;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class PersonImpl implements Persons {
    @Autowired
    private PersonsRepo personsRepo;


    @Override
    public Person personAdd(Person persons) {
        return personsRepo.save(persons);


    }

    @Override
    public Person findByid(int id) {
        for (Person person: personsRepo.findAll()){
                 if (person.getId()==id){
                     return person;
                 }

        }
        return null;

    }


        @Override
        public List<Person> getAll () {
            List<Person> personList = personsRepo.findAll();
            return personList;
        }

    @Override
    public String deleteById(int id) {
        personsRepo.deleteById(id);

        return "deleted";
    }
}

