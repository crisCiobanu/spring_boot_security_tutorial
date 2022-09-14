package com.ciobanu.security_implementation.repositories;

import com.ciobanu.security_implementation.models.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepo extends JpaRepository<Role, Long> {
    Role finByName(String roleName);
}
