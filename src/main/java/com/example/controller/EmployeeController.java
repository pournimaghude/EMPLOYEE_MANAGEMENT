package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.example.dto.EmailDto;
import com.example.entity.Employee;
import com.example.service.EmailService;
import com.example.service.EmployeeService;

import jakarta.servlet.http.HttpServletRequest;



@Controller
public class EmployeeController {

	@Autowired
	private EmployeeService employeeService;
	
	@Autowired
	private EmailService emailService;

	@GetMapping("/")
	public ModelAndView regPage() {
		ModelAndView mv = new ModelAndView("register");
		mv.addObject("emp", new Employee());
		return mv;
	}

	@GetMapping("/login")
	public ModelAndView login() {
		ModelAndView mv = new ModelAndView("login");
		return mv;
	}

	@GetMapping("/home")
	public ModelAndView homePage() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("home");
		List<Employee> all = employeeService.getAll();
		mv.addObject("emps", all);
		return mv;
	}

	@PostMapping("/register")
	public ModelAndView register(Employee employee) {
		String register = employeeService.register(employee);
		ModelAndView mv = new ModelAndView("login");
		mv.addObject("msg", register);
		return mv;
	}

	@PostMapping("/login")
	public ModelAndView postMethodName(HttpServletRequest request) {
		String email = request.getParameter("email");
		String password = request.getParameter("password");

		boolean result = employeeService.login(email, password);
		System.out.println(result);
		ModelAndView mv = new ModelAndView();
		if (result) {
			mv.setViewName("home");
			List<Employee> all = employeeService.getAll();
			mv.addObject("emps", all);
			mv.addObject("msg", "Welcome to App");
			return mv;
		} else {
			mv.setViewName("login");
			mv.addObject("msg", "Invalid credentials");
			return mv;
		}
	}
	
	@GetMapping("/email")
	public ModelAndView getEmailPage() {
		ModelAndView mv=new ModelAndView("email");
		mv.addObject("mailDto", new EmailDto());
		return mv;
	}
	
	@PostMapping("/send")
	public ModelAndView sendEmail(EmailDto dto) {
		emailService.send(dto);
		ModelAndView mv=new ModelAndView("home");
		mv.addObject("emps", employeeService.getAll());
		return mv;
	}
	

	@GetMapping("/update")
	public ModelAndView dispUpdate(@RequestParam Integer eid) {
		ModelAndView mv=new ModelAndView("update");
		mv.addObject("emp", employeeService.getById(eid));
		return mv;
	}
	
	@PostMapping("/update")
	public ModelAndView updateEmployee(Employee employee) {
		employeeService.update(employee);
		ModelAndView mv=new ModelAndView("home");
		mv.addObject("emps", employeeService.getAll());
		return mv;
	}
	
}