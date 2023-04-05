package com.example.spring.jdbc.mvc.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.example.spring.jdbc.mvc.bean.EmployeeBean;

public class EmployeeDAO {

	private static final String GET_ALL_EMPLOYEE_DETAILS = "SELECT EMP_ID,EMP_NAME,EMP_JOB,EMP_SALARY  FROM EMPLOYEE_JDBC";
	private static final String GET_ID_NAME_EMPLOYEE_DETAILS = "SELECT EMP_ID,EMP_NAME FROM EMPLOYEE_JDBC";
	private static final String GET_JOB_SALARY_EMPLOYEE_DETAILS = "SELECT EMP_JOB,EMP_SALARY FROM EMPLOYEE_JDBC";
	
	private JdbcTemplate jdbcTemplate;

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	public List<EmployeeBean> retriveAllEmployee() {

		List<EmployeeBean> employeeBeansList = (List<EmployeeBean>) jdbcTemplate.query(GET_ALL_EMPLOYEE_DETAILS,
				new EmployeeRowMapper());

		return employeeBeansList;
	}

	private class EmployeeRowMapper implements RowMapper<EmployeeBean> {

		@Override
		public EmployeeBean mapRow(ResultSet resultSet, int position) throws SQLException {

			EmployeeBean employeeBean = new EmployeeBean(resultSet.getInt(1), resultSet.getString(2),
					resultSet.getString(3), resultSet.getFloat(4));

			return employeeBean;
		}

	}
	
	/*List of Id _ Name Employees*/
	public List<EmployeeBean> retriveid_nameEmployee() {

		List<EmployeeBean> employeeBeansList1 = (List<EmployeeBean>) jdbcTemplate.query(GET_ID_NAME_EMPLOYEE_DETAILS,
				new EmployeeRowMapper1());

		return employeeBeansList1;

	}

	private class EmployeeRowMapper1 implements RowMapper<EmployeeBean> {

		@Override
		public EmployeeBean mapRow(ResultSet resultSet1, int position1) throws SQLException {

			EmployeeBean employeeBean1 = new EmployeeBean(resultSet1.getInt(1), resultSet1.getString(2));

			return employeeBean1;
		}
	}

	/*List of Job _ Salary Employees*/
	public List<EmployeeBean> retrivejob_salaryEmployee() {

		List<EmployeeBean> employeeBeansList2 = (List<EmployeeBean>) jdbcTemplate.query(GET_JOB_SALARY_EMPLOYEE_DETAILS,new EmployeeRowMapper2());

		return employeeBeansList2;

	}
	private class EmployeeRowMapper2 implements RowMapper<EmployeeBean> {

		@Override
		public EmployeeBean mapRow(ResultSet resultSet2, int position2) throws SQLException {

			EmployeeBean employeeBean2 = new EmployeeBean(resultSet2.getString("EMP_JOB"), resultSet2.getFloat("EMP_SALARY"));

			return employeeBean2;
		}
	}



}

 