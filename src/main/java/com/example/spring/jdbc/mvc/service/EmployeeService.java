 package com.example.spring.jdbc.mvc.service;

import java.util.ArrayList;
import java.util.List;

import com.example.spring.jdbc.mvc.bean.EmployeeBean;
import com.example.spring.jdbc.mvc.dao.EmployeeDAO;
import com.example.spring.jdbc.mvc.dto.EmployeeDTO;

public class EmployeeService {

	private EmployeeDAO employeeDAO;

	public void setEmployeeDAO(EmployeeDAO employeeDAO) {
		this.employeeDAO = employeeDAO;
	}

	public List<EmployeeDTO> getAllEmployeeRecord() {

		List<EmployeeBean> employeeBeansList = employeeDAO.retriveAllEmployee();

		List<EmployeeDTO> employeeDTOsList = new ArrayList<EmployeeDTO>();

		for (EmployeeBean employeeList : employeeBeansList) {

			EmployeeDTO dto = new EmployeeDTO(employeeList.getEmployee_id(), employeeList.getEmployee_name(),
					employeeList.getEmploye_job(), employeeList.getEmployee_salary());
			employeeDTOsList.add(dto);
		}

		return employeeDTOsList;

	}

	public List<EmployeeDTO> retriveid_nameEmployeeRecord() {

		List<EmployeeBean> employeeBeansList1 = employeeDAO.retriveid_nameEmployee();

		List<EmployeeDTO> employeeDTOsList1 = new ArrayList<EmployeeDTO>();

		for (EmployeeBean employeeList1 : employeeBeansList1) {

			EmployeeDTO dto1 = new EmployeeDTO(employeeList1.getEmployee_id(), employeeList1.getEmployee_name());
			employeeDTOsList1.add(dto1);
		}

		return employeeDTOsList1;

	}
	
	public List<EmployeeDTO> retrivejob_salaryEmployeeRecord() {

		List<EmployeeBean> employeeBeansList2 = employeeDAO.retrivejob_salaryEmployee();

		List<EmployeeDTO> employeeDTOsList2 = new ArrayList<EmployeeDTO>();

		for (EmployeeBean employeeList2 : employeeBeansList2) {

			EmployeeDTO dto2 = new EmployeeDTO(employeeList2.getEmploye_job(), employeeList2.getEmployee_salary());
			employeeDTOsList2.add(dto2);
		}

		return employeeDTOsList2;

	}

}
