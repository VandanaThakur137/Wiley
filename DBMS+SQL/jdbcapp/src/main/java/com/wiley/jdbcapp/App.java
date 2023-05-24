package com.wiley.jdbcapp;
import java.sql.*;
import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    
	public static void main( String[] args )throws Exception
	
    {
		
		EmployeeDaoImpl e = new EmployeeDaoImpl();
	     
	     Scanner sc = new Scanner(System.in);
	     
	     while(true)
	     {
	      
	      
	      System.out.println("1 : Add Employee");
	         System.out.println("2 : Show all employees");
	         System.out.println("3 : Show employee based on id");
	         System.out.println("4 : Update employee");
	         System.out.println("5 : delete employee");
	         System.out.println("6 : Exit");
	         
	         int n = sc.nextInt();
	      
	      if(n==1)
	      {
	       System.out.println("Enter employee id");
	       
	                int id = sc.nextInt();
	                
	                System.out.println("Enter employee name");
	                
	                
	                String name = sc.next();
	                
	                System.out.println("Enter employee salary");
	                int salary = sc.nextInt();
	                System.out.println("Enter employee age");
	                int age = sc.nextInt();
	                
	                Employee emp = new Employee(id,name,salary,age);
	                
	                e.createEmployee(emp);
	                
	                
	                
	      }
	      else if(n==2)
	      {
	       
	       
	       e.showAllEmployees();
	      }
	      else if(n==3)
	      {
	       System.out.println("Enter Employee Id");
	       
	       int id = sc.nextInt();
	       
	       e.getEmployeeById(id);
	       
	      }
	      else if(n==4)
	      {
	System.out.println("Enter Employee Id");
	       
	       int id = sc.nextInt();
	       
	       System.out.println("Enter Employee name");
	       
	       String name = sc.next();
	       
	       e.updateEmployeeById(id, name);
	      }
	      else if(n==5)
	      {
	       System.out.println("Enter Id");
	        int id = sc.nextInt();
	        
	        e.deleteEmployeeById(id);
	      }
	      else if(n==6)
	      {
	       System.out.println("Exit");
	       System.exit(0);
	      }
	      else
	      {
	       System.out.println("Invalid Choice");
	      }
	     }
		/*try {
			DBConnection dbcon = new DBConnection();
			Connection conn = dbcon.createDBConnection();
			
			
			Statement stmt = conn.createStatement();
			
			
			String sql = "SELECT id, name, salary, age FROM employee";
			
			ResultSet rs = stmt.executeQuery(sql);
			
			while(rs.next()) {
				System.out.println(
						rs.getString("id") + "\t" + rs.getString("name") + "\t" + rs.getString("salary")+ "\t" + rs.getString("age")
						);
			}
			
			try {
				rs.close();
				stmt.close();
			} catch (SQLException e) {
				System.out.println(e.getMessage());
			}
			
		} catch (Exception e) { 
			e.printStackTrace();
		}*/
		
    }
	
}
