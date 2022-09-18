package com.rest.orm.respositories.onetoone;

import com.rest.orm.entities.onetoone.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
