package com.ciobanu.security_implementation.services;

import com.ciobanu.security_implementation.models.Role;
import com.ciobanu.security_implementation.models.User;
import com.ciobanu.security_implementation.repositories.RoleRepo;
import com.ciobanu.security_implementation.repositories.UserRepo;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service @RequiredArgsConstructor @Transactional @Slf4j
public class UserServiceImpl implements UserService{
    private final UserRepo userRepo;
    private final RoleRepo roleRepo;

    @Override
    public User save(User user) {
        return userRepo.save(user);
    }

    @Override
    public void addRoleToUser(String userName, String roleName) {
        User user = this.userRepo.findByUserName(userName);
        Role role = this.roleRepo.findByName(roleName);
        user.getRoles().add(role);
    }

    @Override
    public User getUser(String userName) {
        return this.userRepo.findByUserName(userName);
    }

    @Override
    public List<User> getUsers() {
        return this.userRepo.findAll();
    }
}
