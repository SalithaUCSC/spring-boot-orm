package com.rest.orm.entities.manytomany;

import lombok.*;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "roles")
public class Role {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String name;
    @ManyToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinTable(
        name = "employee_roles",
        joinColumns = @JoinColumn(
                name = "employee_id", referencedColumnName = "id"
        ),
        inverseJoinColumns = @JoinColumn(
                name = "role_id", referencedColumnName = "id"
        )
    )
    Set<Employee> employees = new HashSet<>();

}
