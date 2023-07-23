package com.example.personDemo.services;

import com.example.personDemo.model.Person;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class PersonsTest {
    @Autowired
    private Persons persons;

    @Test
    void findByid() {
        int id=153;
        Person expectedPerson=new Person(153,"shruti","bengluru");
        Person result=persons.findByid(id);
       Assert.assertEquals(expectedPerson,result);


    }
@Test
    void getAll(){

    List<Person> result=persons.getAll();
    Assert.assertNotNull(result);
    Assert.assertFalse(result.isEmpty());
    Assert.assertEquals(3,result.size());

    for (Person person:result){
        System.out.println(person);
    }
}

}