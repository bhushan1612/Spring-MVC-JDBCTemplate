package com.example.spring.jdbc.mvc.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

import com.example.spring.jdbc.mvc.dto.EmployeeDTO;
import com.example.spring.jdbc.mvc.service.EmployeeService;

public  class List_id_name_EmployeeController extends AbstractController{
	
private EmployeeService employeeService;
	
	
	public void setEmployeeService(EmployeeService employeeService) {
		this.employeeService = employeeService;
	}
	@Override
	protected ModelAndView handleRequestInternal(HttpServletRequest arg0, HttpServletResponse arg1) throws Exception {
		List<EmployeeDTO> employeesid_name = employeeService.retriveid_nameEmployeeRecord();
		
		return new ModelAndView("id_name","employee_list2", employeesid_name) ;
	}
	

	
}
