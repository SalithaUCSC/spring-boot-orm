package com.rest.orm.respositories.manytomany;

import com.rest.orm.entities.manytomany.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
