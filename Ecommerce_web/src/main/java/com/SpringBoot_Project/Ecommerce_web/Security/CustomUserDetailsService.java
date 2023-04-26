package com.SpringBoot_Project.Ecommerce_web.Security;

import com.SpringBoot_Project.Ecommerce_web.Model.User.Role;
import com.SpringBoot_Project.Ecommerce_web.Repositary.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class CustomUserDetailsService implements UserDetailsService {
    private UserRepository userRepository;

    @Autowired
    public CustomUserDetailsService(UserRepository userRepository){
        this.userRepository = userRepository;
    }

    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
        com.SpringBoot_Project.Ecommerce_web.Model.User.User user = userRepository.findByEmail(email).orElseThrow(()->new UsernameNotFoundException("Email not found"));
        return new User(user.getEmail(),user.getPassword(),mapRolesToAuthorities(user.getRole()));
    }
    private List<GrantedAuthority> mapRolesToAuthorities(List<Role> roles){
        return roles.stream().map(role -> new SimpleGrantedAuthority(role.getAuthority())).collect(Collectors.toList());
    }
}
