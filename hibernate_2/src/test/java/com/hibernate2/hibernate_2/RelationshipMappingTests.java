package com.hibernate2.hibernate_2;


import RelationshipMapping.Customer;
import RelationshipMapping.CustomerRepo;
import RelationshipMapping.PhoneNo;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.HashSet;
import java.util.Set;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = {RelationshipMapping.RelationshipMappingApplication.class})
public class RelationshipMappingTests {
    @Autowired
    CustomerRepo customerRepo;

    @Test
    public void contextLoads() {
    }

    @Test
    public void testCreateCustomrt() {
        Customer customer = new Customer();
        customer.setName("patanhi");
        //HashSet<PhoneNo> nos =new HashSet<PhoneNo>();
        PhoneNo phoneNo1 =new PhoneNo();
        phoneNo1.setNo("1223456789");
        phoneNo1.setType("meragahr");
        //phoneNo1.setCustomer(customer);
        //nos.add(phoneNo1);

        PhoneNo phoneNo2 =new PhoneNo();
        phoneNo2.setNo("9876543211");
        phoneNo2.setType("dusragharmera");
       // phoneNo2.setCustomer(customer);
       // nos.add(phoneNo2);

        customer.addPhoneNo(phoneNo1);
        customer.addPhoneNo(phoneNo2);

        customerRepo.save(customer);
    }
    @Test
    public void testLoadCustomer(){
        Customer customer = customerRepo.findById(102l).get();
        System.out.println(customer.getName());

        Set<PhoneNo> nos =customer.getNos();
        nos.forEach(no -> System.out.println(no.getNo()));
    }

    @Test
    public void testDelete(){
        customerRepo.deleteById(1l);
    }
}