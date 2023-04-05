package com.example.spring.jdbc.mvc.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

import com.example.spring.jdbc.mvc.dto.EmployeeDTO;
import com.example.spring.jdbc.mvc.service.EmployeeService;

public class List_job_salary_EmployeeController extends AbstractController{
private EmployeeService employeeService;
	
	
	public void setEmployeeService(EmployeeService employeeService) {
		this.employeeService = employeeService;
	}
	
	protected ModelAndView handleRequestInternal(HttpServletRequest arg0, HttpServletResponse arg1) throws Exception {
		List<EmployeeDTO> employeejob_salary = employeeService.retrivejob_salaryEmployeeRecord();
		
		return new ModelAndView("job_salary","employee_list3", employeejob_salary) ;
	}
}
