package com.hibernate2.hibernate_2;

import RelationshipMapping.Customer;
import RelationshipMapping.CustomerRepo;
import RelationshipMapping.PhoneNo;
import jakarta.persistence.Table;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.HashSet;

@SpringBootTest
public class HibernateComponentMappingtests {
    @Autowired
    Emprepo emprepo;

    @Test
    public void contectLoads() {
    }

    @Test
    public void testCreate() {
        Employee employee = new Employee();
        employee.setId(123);
        employee.setName("abhuds");
        Address address = new Address();
        address.setAddress("sdfds");
        address.setCity("vffgs");
        address.setCountry("afdsv");
        address.setZipcode("fads");
        address.setState("fkasdvkdf");
       // emprepo.save(employee);
    }


}