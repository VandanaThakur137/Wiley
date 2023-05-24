package com.wiley.jdbcapp;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class EmployeeDaoImpl implements EmployeeDao{
	Connection conn;

	@Override
	public void createEmployee(Employee employee) throws Exception {
		// TODO Auto-generated method stub
		conn = DBConnection.createDBConnection();
        String query = "insert into employee values(?,?,?,?)";

        try {
            PreparedStatement ps = conn.prepareStatement(query);
            ps.setInt(1, employee.getId());
            ps.setString(2, employee.getName());
            ps.setDouble(3, employee.getSalary());
            ps.setInt(4, employee.getAge());
            int count = ps.executeUpdate();
            if(count > 0) {
                System.out.println("Employee created successfully");
            } else {
                System.out.println("Employee creation failed");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
		
	}

	@Override
	public void showAllEmployees() {
		// TODO Auto-generated method stub
		conn = DBConnection.createDBConnection();
        String query = "SELECT * FROM employee";
        System.out.println("-------------------------------------------");
        System.out.format("%s\t%s\t%s\t%s\t", "ID","Name","Salary","Age");
        System.out.println("-------------------------------------------");
        try {
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            while(rs.next()) {
                System.out.format("%d\t%s\t%.2f\t%d\t\n", rs.getInt(1), rs.getString(2), rs.getDouble(3), rs.getInt(4));
                System.out.println("-------------------------------------------");
            }
        } catch(Exception e) {
            e.printStackTrace();
        }
		
		
	}

	@Override
	public void getEmployeeById(int id) throws Exception{
		// TODO Auto-generated method stub
		conn = DBConnection.createDBConnection();

		  String query = "SELECT * FROM employee where id = "+id;

		  try {
		   Statement st = conn.createStatement();
		   ResultSet rs = st.executeQuery(query);

		   while(rs.next()) {
		    System.out.format("%d\t%s\t%f\t%d\\t",
		      rs.getInt(1),
		      rs.getString(2),
		      rs.getDouble(3),
		      rs.getInt(4));

		   }
		  } catch (Exception e) {
		   e.printStackTrace();  }
		
	}

	@Override
	public void updateEmployeeById(int id, String name) throws Exception {
		// TODO Auto-generated method stub
		conn = DBConnection.createDBConnection();
        String query = "update employee set name = ? where id = ?";
        try {
            PreparedStatement ps = conn.prepareStatement(query);
            ps.setString(1, name);
            ps.setInt(2, id);
            int count = ps.executeUpdate();
            if(count > 0) {
                System.out.println("Employee updated successfully");
            } else {
                System.out.println("Employee updation failed");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
		
	}

	@Override
	public void deleteEmployeeById(int id) {
		// TODO Auto-generated method stub
		conn = DBConnection.createDBConnection();
        String query = "delete from employee where id = ?";

        try {
            PreparedStatement ps = conn.prepareStatement(query);
            ps.setInt(1, id);
            int count = ps.executeUpdate();
            if(count > 0) {
                System.out.println("Employee deleted successfully");
            } else {
                System.out.println("Employee deletion failed");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
		
	}
	

}
