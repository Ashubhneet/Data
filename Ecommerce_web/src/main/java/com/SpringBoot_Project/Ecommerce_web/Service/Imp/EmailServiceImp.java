package com.SpringBoot_Project.Ecommerce_web.Service.Imp;

import com.SpringBoot_Project.Ecommerce_web.Service.EmailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class EmailServiceImp implements EmailService {

    @Autowired
    JavaMailSender javaMailSender;

    public void sendMail(String receiver, String token, String userType){
        SimpleMailMessage simpleMailMessage =new SimpleMailMessage();
        simpleMailMessage.setFrom("shubhneet.aggrwal.tothenew.com");
        simpleMailMessage.setTo(receiver);
        simpleMailMessage.setSubject("Email Activation");
        if(userType.equals("customer"))
            simpleMailMessage.setText("Your account is registered please activate the account by"+ "clicking below link :http://localhost:8080/customer/register"+token);
        else
            simpleMailMessage.setText("Your account is registered please activate the account by"+ "clicking below link :http://localhost:8080/supplier/register"+token);
        javaMailSender.send(simpleMailMessage);
    }

}
