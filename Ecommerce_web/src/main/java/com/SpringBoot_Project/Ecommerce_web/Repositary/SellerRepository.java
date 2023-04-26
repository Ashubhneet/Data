package com.SpringBoot_Project.Ecommerce_web.Repositary;

import com.SpringBoot_Project.Ecommerce_web.Model.User.Seller;
import com.SpringBoot_Project.Ecommerce_web.Model.User.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface SellerRepository extends JpaRepository<Seller, Long> {

    Boolean existsByEmail(String email);
    Boolean existsByGst(String gst);
    Boolean existsByCompanyNameIgnoreCase(String companyName);
}
