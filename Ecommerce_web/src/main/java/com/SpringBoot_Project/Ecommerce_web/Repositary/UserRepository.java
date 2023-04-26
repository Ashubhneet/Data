package com.SpringBoot_Project.Ecommerce_web.Repositary;

import com.SpringBoot_Project.Ecommerce_web.Model.User.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByEmail(String email);

}
