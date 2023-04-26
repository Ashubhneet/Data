package com.security.Security;

import jakarta.servlet.FilterChain;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfiguration;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SecurityConfig {
    @Bean
    protected void configurationAdapter(AuthenticationManagerBuilder authenticationManagerBuilder) throws Exception{

    }
    @Bean
    protected FilterChain configurationAdapter(HttpSecurity httpSecurity) throws Exception{
        httpSecurity.httpBasic();
        httpSecurity.authorizeRequests().anyRequest().authenticated();
        return null;
    }
}
