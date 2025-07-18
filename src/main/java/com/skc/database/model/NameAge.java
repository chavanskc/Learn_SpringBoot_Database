package com.skc.database.model;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import org.springframework.boot.autoconfigure.domain.EntityScan;

import jakarta.persistence.Entity;
import jakarta.persistence.*;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import lombok.Getter;
import lombok.Setter;

//@Entity
@Table(name ="NameAgeTable")
//Getter
//@Setter
@Entity
public class NameAge {
    @Id
    @Column(name = "Name")
    private String name;
    @Column(name = "Age")
    private int age;
    @Column(name = "City")
    private String city;

    public String getName() {
        return name;
    }

    public void setName(String name1) {
        name = name1;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age1) {
        age = age1;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city1) {
        city = city1;
    }
}
