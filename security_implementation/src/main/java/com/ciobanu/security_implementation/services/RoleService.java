package com.ciobanu.security_implementation.services;

import com.ciobanu.security_implementation.models.Role;
import org.springframework.stereotype.Service;

@Service
public interface RoleService {
    Role save(Role role);
}
