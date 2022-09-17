package com.ciobanu.security_implementation.services;

import com.ciobanu.security_implementation.models.Role;
import com.ciobanu.security_implementation.models.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UserService {
    User save(User user);
    void addRoleToUser(String userName, String roleName);
    User getUser(String userName);
    List<User> getUsers();

}
