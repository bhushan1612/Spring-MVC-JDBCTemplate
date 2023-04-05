 package com.example.spring.jdbc.mvc.bean;

public class EmployeeBean {

	private int employee_id;
	private String employee_name;
	private String employe_job;
	private float employee_salary;
	
	public EmployeeBean(int employee_id, String employee_name, String employe_job, float employee_salary) {
		super();
		this.employee_id = employee_id;
		this.employee_name = employee_name;
		this.employe_job = employe_job;
		this.employee_salary = employee_salary;
	}
	
	public EmployeeBean(int employee_id, String employee_name) {
		super();
		this.employee_id = employee_id;
		this.employee_name = employee_name;
	}
	
	public EmployeeBean(String employe_job, float employee_salary) {
		super();
		this.employe_job = employe_job;
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
	public String getEmploye_job() {
		return employe_job;
	}
	public void setEmploye_job(String employe_job) {
		this.employe_job = employe_job;
	}
	public float getEmployee_salary() {
		return employee_salary;
	}
	public void setEmployee_salary(float employee_salary) {
		this.employee_salary = employee_salary;
	}
	
	@Override
	public String toString() {
		return "EmployeeBean [employee_id=" + employee_id + ", employee_name=" + employee_name + ", employe_job="
				+ employe_job + ", employee_salary=" + employee_salary + "]";
	}

}
