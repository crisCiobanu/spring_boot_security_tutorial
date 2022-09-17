package com.ciobanu.security_implementation.repositories;

import com.ciobanu.security_implementation.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User,Long> {
    User findByUserName(String userName);
}
