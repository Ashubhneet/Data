package com.SpringBoot_Project.Ecommerce_web.Service;

import com.SpringBoot_Project.Ecommerce_web.Dto.CustomerRegisterDto;
import org.springframework.stereotype.Service;

@Service
public interface CustomerService {
    void createCustomer(CustomerRegisterDto customerRegisterDto);

    boolean checkForMail(CustomerRegisterDto customerRegisterDto);

    Boolean checkForValidToken(String token);
}
