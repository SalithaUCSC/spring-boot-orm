package com.rest.orm.respositories.manytomany;

import com.rest.orm.entities.manytomany.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
}
