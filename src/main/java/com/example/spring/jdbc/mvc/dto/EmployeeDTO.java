package com.example.spring.jdbc.mvc.dto;

import java.io.Serializable;

public class EmployeeDTO implements Serializable {
	
	private int employee_id;
	private String employee_name;
	private String employee_job;
	private float employee_salary;
	
	public EmployeeDTO() {
		System.out.println("0-arg constructor called from EmployeeDTO ... : ");
	}

	public EmployeeDTO(int employee_id, String employee_name, String employee_job, float employee_salary) {
		this.employee_id = employee_id;
		this.employee_name = employee_name;
		this.employee_job = employee_job;
		this.employee_salary = employee_salary;
		System.out.println("Paramerized constructor called from EmployeeDTO ... : ");
	}

	public EmployeeDTO(int employee_id, String employee_name) {
		this.employee_id = employee_id;
		this.employee_name = employee_name;
	}
	public EmployeeDTO(String employee_job, float employee_salary) {
		this.employee_job = employee_job;
		this.employee_salary = employee_salary;
	}
	public int getEmployee_id() {
		return employee_id;
	}

	public void setEmployee_id(int employee_id) {
		this.employee_id = employee_id;
	}

	public String getEmployee_name() {
		return employee_name;
	}

	public void setEmployee_name(String employee_name) {
		this.employee_name = employee_name;
	}

	public String getEmployee_job() {
		return employee_job;
	}

	public void setEmployee_job(String employee_job) {
		this.employee_job = employee_job;
	}

	public float getEmployee_salary() {
		return employee_salary;
	}

	public void setEmployee_salary(float employee_salary) {
		this.employee_salary = employee_salary;
	}

	@Override
	public String toString() {
		return "EmployeeDTO [employee_id=" + employee_id + ", employee_name=" + employee_name + ", employe_job="
				+ employee_job + ", employee_salary=" + employee_salary + "]";
	}
	
	
}
