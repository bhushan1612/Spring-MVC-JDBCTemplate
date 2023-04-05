package com.example.spring.jdbc.mvc.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

import com.example.spring.jdbc.mvc.dto.EmployeeDTO;
import com.example.spring.jdbc.mvc.service.EmployeeService;

public class ListEmployeeController extends AbstractController {

	
	private EmployeeService employeeService;
	
	
	public void setEmployeeService(EmployeeService employeeService) {
		this.employeeService = employeeService;
	}


	@Override
	protected ModelAndView handleRequestInternal(HttpServletRequest request, HttpServletResponse response) throws Exception {
		
		List<EmployeeDTO> employees = employeeService.getAllEmployeeRecord();
		
		return new ModelAndView("list_employees", "employee_list", employees);
	}

}
