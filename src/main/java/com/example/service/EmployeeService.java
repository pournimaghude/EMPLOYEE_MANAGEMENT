package com.example.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entity.Employee;
import com.example.repository.EmployeeRepository;

@Service
public class EmployeeService {

	@Autowired
	private EmployeeRepository employeeRepository;

	public String register(Employee employee) {
		Optional<Employee> opt = employeeRepository.findByEmail(employee.getEmail());

		if (opt.isPresent()) {
			return "employee with " + employee.getEmail() + " is already registered";
		} else {
			employeeRepository.save(employee);
			return "Registration is successfull";
		}
	}

	public boolean login(String email, String password) {
		Optional<Employee> opt = employeeRepository.findByEmail(email);
		if (opt.isPresent()) {
			Employee employee = opt.get();
			if (employee.getPassword().equals(password)) {
				return true;
			}
			return false;
		}
		return false;
	}

	public List<Employee> getAll() {
		return employeeRepository.findAll();
	}

	public Employee getById(Integer eid) {
		return employeeRepository.findById(eid).get();
	}
	
	public void update(Employee employee) {
		employeeRepository.save(employee);
	}
}
