package com.javarun.web.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.javarun.web.models.Role;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long>{
    
}
