package com.SpringBoot_Project.Ecommerce_web.Service.Imp;

import com.SpringBoot_Project.Ecommerce_web.Dto.SellerRegisterDto;
import com.SpringBoot_Project.Ecommerce_web.Model.User.Role;
import com.SpringBoot_Project.Ecommerce_web.Model.User.Seller;
import com.SpringBoot_Project.Ecommerce_web.Repositary.RoleRepository;
import com.SpringBoot_Project.Ecommerce_web.Repositary.SellerRepository;
import com.SpringBoot_Project.Ecommerce_web.Repositary.UserRepository;
import com.SpringBoot_Project.Ecommerce_web.Security.JwtTokenGenerator;
import com.SpringBoot_Project.Ecommerce_web.Service.EmailService;
import com.SpringBoot_Project.Ecommerce_web.Service.SellerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Collections;

@Service
public class SellerServiceImp implements SellerService {
    @Autowired
    private AuthenticationManager authenticationManager;
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private RoleRepository roleRepository;
    @Autowired
    private PasswordEncoder passwordEncoder;
    @Autowired
    private JwtTokenGenerator jwtTokenGenerator;
    @Autowired
    private EmailService emailService;
    @Autowired
    private SellerRepository sellerRepository;

    @Override
    public void createSeller(SellerRegisterDto sellerRegisterDto) {

        Seller seller = new Seller();
        seller.setEmail(sellerRegisterDto.getEmail());
        seller.setPassword(sellerRegisterDto.getPassword());
        seller.setFirstName(sellerRegisterDto.getFirstName());
        seller.setMiddleName(sellerRegisterDto.getMiddleName());
        seller.setLastName(sellerRegisterDto.getLastname());
        seller.setGst(sellerRegisterDto.getGst());
        seller.setCompanyName(sellerRegisterDto.getCompanyName());
        seller.setCompanyContact(sellerRegisterDto.getCompanyContact());
        seller.setAddress(Collections.singletonList(sellerRegisterDto.getAddress()));
        Role role = new Role();
        seller.setRole(Collections.singletonList(role));
        userRepository.save(seller);

    }

    @Override
    public boolean checkForEmail(String email,SellerRegisterDto sellerRegisterDto) {

        return sellerRepository.existsByEmail(sellerRegisterDto.getEmail());
    }

    @Override
    public boolean checkForGst(SellerRegisterDto sellerRegisterDto) {
        return sellerRepository.existsByGst(sellerRegisterDto.getGst());
    }

    @Override
    public boolean checkForCompanyName(SellerRegisterDto sellerRegisterDto) {
        return sellerRepository.existsByCompanyNameIgnoreCase(sellerRegisterDto.getCompanyName());
    }
}
