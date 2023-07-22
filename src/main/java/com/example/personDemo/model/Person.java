package com.example.personDemo.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "person")

public class Person {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private  int id;
    private String personName;
    private String cityName;


}
