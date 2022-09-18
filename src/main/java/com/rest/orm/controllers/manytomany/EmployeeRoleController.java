package com.rest.orm.controllers.manytomany;

import com.rest.orm.entities.manytomany.Employee;
import com.rest.orm.entities.manytomany.Role;
import com.rest.orm.services.manytomany.EmployeeService;
import com.rest.orm.services.manytomany.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api")
public class EmployeeRoleController {

    @Autowired
    private EmployeeService employeeService;

    @Autowired
    private RoleService roleService;

    @GetMapping(path = "/employees")
    public ResponseEntity<List<Employee>> getEmployees() {
        return ResponseEntity.ok().body(employeeService.getAllEmployees());
    }

    @GetMapping(path = "/employees/{id}")
    public ResponseEntity<Employee> getEmployee(@PathVariable("id") Long id) {
        return ResponseEntity.ok().body(employeeService.getEmployeeById(id));
    }

    @PostMapping(path = "/employees")
    public ResponseEntity<Employee> createEmployee(@RequestBody Employee employee) {
        return new ResponseEntity<>(employeeService.createEmployee(employee), HttpStatus.CREATED);
    }

    @GetMapping(path = "/roles")
    public ResponseEntity<List<Role>> getRoles() {
        return ResponseEntity.ok().body(roleService.getAllRoles());
    }

    @GetMapping(path = "/roles/{id}")
    public ResponseEntity<Role> getRole(@PathVariable("id") Long id) {
        return ResponseEntity.ok().body(roleService.getRoleById(id));
    }

    @PostMapping(path = "/roles")
    public ResponseEntity<Role> createRole(@RequestBody Role role) {
        return new ResponseEntity<>(roleService.createRole(role), HttpStatus.CREATED);
    }

}
