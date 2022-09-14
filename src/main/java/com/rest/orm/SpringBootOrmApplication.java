package com.rest.orm;

import com.rest.orm.entities.manytomany.Employee;
import com.rest.orm.entities.manytomany.Role;
import com.rest.orm.entities.onetomany.Post;
import com.rest.orm.respositories.manytomany.EmployeeRepository;
import com.rest.orm.respositories.manytomany.RoleRepository;
import com.rest.orm.respositories.onetomany.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;
import java.util.Arrays;
import java.util.HashSet;

@SpringBootApplication
public class SpringBootOrmApplication {

	@Autowired
	private EmployeeRepository employeeRepository;

	@Autowired
	private RoleRepository roleRepository;

	public static void main(String[] args) {
		SpringApplication.run(SpringBootOrmApplication.class, args);
	}

	@PostConstruct
	public void setupData() {
		Role role1 = Role.builder().id(1L).name("ADMIN").build();
		Role role2 = Role.builder().id(2L).name("USER").build();
		roleRepository.saveAll(Arrays.asList(role1, role2));
		Employee employee = Employee.builder().id(1L).name("pool").email("pool@gmail.com").build();
		employee.getRoles().add(role1);
		employee.getRoles().add(role2);
		employeeRepository.save(employee);
	}

}
