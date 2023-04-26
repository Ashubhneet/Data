package com.SpringBoot_Project.Ecommerce_web.Repositary;

import com.SpringBoot_Project.Ecommerce_web.Model.Customer.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface CustomerRepository extends JpaRepository<Customer, Long> {

    Boolean existsByEmail(String email);

    Customer findByEmail(String email);
}
