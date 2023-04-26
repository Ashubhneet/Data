package com.SpringBoot_Project.Ecommerce_web.Service.Imp;

import com.SpringBoot_Project.Ecommerce_web.Dto.CustomerRegisterDto;
import com.SpringBoot_Project.Ecommerce_web.Model.Customer.Customer;
import com.SpringBoot_Project.Ecommerce_web.Model.User.Role;
import com.SpringBoot_Project.Ecommerce_web.Repositary.CustomerRepository;
import com.SpringBoot_Project.Ecommerce_web.Repositary.RoleRepository;
import com.SpringBoot_Project.Ecommerce_web.Repositary.UserRepository;
import com.SpringBoot_Project.Ecommerce_web.Security.JwtTokenGenerator;
import com.SpringBoot_Project.Ecommerce_web.Service.CustomerService;
import com.SpringBoot_Project.Ecommerce_web.Service.EmailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Collections;

@Service
public class CustomerServiceImp implements CustomerService {
    @Autowired
    private AuthenticationManager authenticationManager;
    @Autowired
    private RoleRepository roleRepository;
    @Autowired
    private PasswordEncoder passwordEncoder;
    @Autowired
    private JwtTokenGenerator jwtTokenGenerator;
    @Autowired
    private EmailService emailService;
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private CustomerRepository customerRepository;
    @Override
    public void createCustomer(CustomerRegisterDto customerRegisterDto){
        Customer customer = new Customer();
        customer.setEmail(customerRegisterDto.getEmail());
        customer.setPassword(passwordEncoder.encode(customerRegisterDto.getPassword()));
        customer.setFirstName(customerRegisterDto.getFirstName());
        customer.setMiddleName(customerRegisterDto.getMiddleName());
        customer.setLastName(customerRegisterDto.getLastname());
        customer.setContact(customerRegisterDto.getContact());
        customer.setAddress(customerRegisterDto.getAddress());
        Role role =roleRepository.findByAuthority("CUSTOMER").orElse(null);
        customer.setRole(Collections.singletonList(role));
        userRepository.save(customer);

        Authentication authentication = authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(customerRegisterDto.getEmail(),customerRegisterDto.getPassword()));
        SecurityContextHolder.getContext().setAuthentication(authentication);
        String token = jwtTokenGenerator.generateToken(authentication);
        emailService.sendMail(customer.getEmail(),token,"TOKEN");
    }

    @Override
    public boolean checkForMail(CustomerRegisterDto customerRegisterDto) {
        return customerRepository.existsByEmail(customerRegisterDto.getEmail());
    }

    @Override
    public Boolean checkForValidToken(String token) {
        if(jwtTokenGenerator.validateToken(token)){
            String email = jwtTokenGenerator.getEmailFromJWT(token);
            Customer customer = customerRepository.findByEmail(email);
            if(customer != null){
                customer.setIsActive(true);
                customerRepository.save(customer);
            }return true;
        }return false;
    }
}
