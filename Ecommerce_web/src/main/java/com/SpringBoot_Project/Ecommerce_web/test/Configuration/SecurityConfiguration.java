//package com.SpringBoot_Project.Ecommerce_web.Configuration;
//
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
//import org.springframework.security.web.util.matcher.AntPathRequestMatcher;
//
//@Configuration
//@EnableWebSecurity
//public class SecurityConfiguration extends WebSecurityConfigurerAdapter {
//    @Override
//    protected void configure(HttpSecurity http) throws Exception {
//        http
//                .authorizeHttpRequests()
//                .antMatchers("/","/register","/forgotpassword","/home","/h2-console/**").permitAll()
//                .antMatchers("/admin/**").hasRole("ADMIN")
//                .anyRequest()
//                .authenticated()
//                .and()
//                .formLogin()
//                .loginPage("login")
//                .permitAll()
//                .failureUrl("/login?error = true")
//                .defaultSuccessUrl("/")
//                .usernameParameter("email")
//                .passwordParameter("password")
//                .and()
//                .oauth2Login()
//                .loginPage("login")
////                .successHandler("googleoath2successerhandler")
//                .and()
//                .logout()
//                .logoutRequestMatcher(new AntPathRequestMatcher("/logout"))
//                .logoutSuccessUrl("login")
//                .invalidateHttpSession(true)
//                .deleteCookies("JSESSIONID")
//                .and()
//                .csrf()
//                .disable();
//        http.headers().frameOptions().disable();
//    }
//}
