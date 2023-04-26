package org.Hibernate;

import jakarta.persistence.*;

@Entity
@Table(name="employee")
public class Employee {
    @Id
    int Id;
    String name;
    int age;
    String Location;

    public Employee() {
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getLocation() {
        return Location;
    }

    public void setLocation(String location) {
        Location = location;
    }

    public Employee(int id, String name, int age, String location) {
        this.Id = id;
        this.name = name;
        this.age = age;
        this.Location = location;
    }


}
