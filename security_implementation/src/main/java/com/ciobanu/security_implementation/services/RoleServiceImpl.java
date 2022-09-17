package com.ciobanu.security_implementation.services;

import com.ciobanu.security_implementation.models.Role;
import com.ciobanu.security_implementation.repositories.RoleRepo;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@RequiredArgsConstructor
@Transactional
@Slf4j
public class RoleServiceImpl implements RoleService{
    private final RoleRepo roleRepo;
    @Override
    public Role save(Role role) {
        return roleRepo.save(role);
    }
}
