package com.SpringBoot_Project.Ecommerce_web.Dto;

import com.SpringBoot_Project.Ecommerce_web.Model.User.Address;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.Data;

import java.util.List;

@Data
public class CustomerRegisterDto {
    private String email;

    @Pattern(regexp = "^(?=.*[A-Z])(?=.*\\d)(?=.*[@!$%*#?&])[A-Za-z\\d@!$%*#?&]{8,15}$",
            message = "Password must be at least 8 characters long,contain at least 1 letter," +
                    "1 digit,1 Special Character,1 Lower case, 1 Upper case and 1 Special Character")
    private String password;
    private String conformPassword;
    private String firstName;
    private String middleName;
    private String lastname;
    @Size(min = 10, max = 10)
    private Long contact;
    private List<Address> address;
}
