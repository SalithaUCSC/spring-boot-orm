package com.rest.orm.services.manytomany;

import com.rest.orm.entities.manytomany.Employee;
import com.rest.orm.respositories.manytomany.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    public List<Employee> getAllEmployees() {
        return employeeRepository.findAll();
    }

    public Employee getEmployeeById(Long id) {
        return employeeRepository.findById(id).orElseThrow(() -> new RuntimeException("Employee Not Found!"));
    }

    public Employee createEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }

}
