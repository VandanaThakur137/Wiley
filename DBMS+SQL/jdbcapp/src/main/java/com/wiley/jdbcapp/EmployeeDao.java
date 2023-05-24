package com.wiley.jdbcapp;

public interface EmployeeDao {

	public void createEmployee(Employee employee) throws Exception;
    //Show all employees
    public void showAllEmployees() ;
    //Show employee based on id
    public void getEmployeeById(int id) throws Exception;
    //Update employee based on id
    public void updateEmployeeById(int id, String name) throws Exception;
    // Delete employee based on id
    public void deleteEmployeeById(int id);
	
}
