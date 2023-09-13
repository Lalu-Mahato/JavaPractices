package com.example.RestaurantApp.models;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "departments")
public class Department {
    @Id
    @GeneratedValue(generator = "department_gen", strategy = GenerationType.AUTO)
    @SequenceGenerator(name = "department_gen", sequenceName = "department_sequence", initialValue = 1, allocationSize = 1)
    private Integer Id;
    private String name;
    private String description;

    @OneToMany
    private List<Student> students;
}
