package com.rest.orm.services.manytomany;

import com.rest.orm.entities.manytomany.Role;
import com.rest.orm.respositories.manytomany.RoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoleService {

    @Autowired
    private RoleRepository roleRepository;

    public List<Role> getAllRoles() {
        return roleRepository.findAll();
    }

    public Role getRoleById(Long id) {
        return roleRepository.findById(id).orElseThrow(() -> new RuntimeException("Role Not Found!"));
    }

    public Role createRole(Role role) {
        return roleRepository.save(role);
    }

}
