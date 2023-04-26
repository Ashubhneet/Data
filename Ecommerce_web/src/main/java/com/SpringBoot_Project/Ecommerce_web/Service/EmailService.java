package com.SpringBoot_Project.Ecommerce_web.Service;

import org.springframework.stereotype.Service;

@Service
public interface EmailService {

    public void sendMail(String receiver, String token, String userType);
}
