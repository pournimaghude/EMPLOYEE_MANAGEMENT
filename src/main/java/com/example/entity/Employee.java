package com.example.entity;


import java.time.LocalDateTime;

import org.hibernate.annotations.CreationTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "employee_info")
//@Getter
//@Setter
//@AllArgsConstructor
//@NoArgsConstructor
@Data
public class Employee {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer eid;

	private String name;

	@Column(unique = true)
	private String email;

	private Double salary;

	private Long phone;
	
	private String password;
	
	@CreationTimestamp
	private LocalDateTime joinDate;

}