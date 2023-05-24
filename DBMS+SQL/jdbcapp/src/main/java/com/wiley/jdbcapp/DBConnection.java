package com.wiley.jdbcapp;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {

	static Connection conn;

	public static Connection createDBConnection() {
		try {
			String driver = "com.mysql.cj.jdbc.Driver";
			Class.forName(driver);
			// connection string
			String url = "jdbc:mysql://localhost:3306/empdb";
			String username = "root";
			String password = "1234";

			conn = DriverManager.getConnection(url, username, password);

			System.out.println("Connection Success");
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		
		return conn;
	}
	
/*try{
			 String driver="com.mysql.cj.jdbc.Driver";   
			 Class.forName(driver);
			 String url="jdbc:mysql://localhost:3306/wileyclassic";
			 String name="root";
			 String pwd="1234";
			 conn=DriverManager.getConnection(url,name,pwd);
	            System.out.println("Connection Successful");

	        }
	        catch(Exception e) {
	            e.printStackTrace();
	        }
		try{
           Class.forName("com.mysql.cj.jdbc.Driver");
           DriverManager.getConnection(
                   "jdbc:mysql://localhost:3306/wileyclassic",
                  "root", "1234");
           System.out.println("Connection Successful");

       }
       catch(Exception e) {
           e.printStackTrace();
}
       try(Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/wileyclassic?user=root&password=1234")){
           PreparedStatement statement = con.prepareStatement("select * from customers");
           ResultSet rs =statement.executeQuery();
           while ((rs.next())){
               System.out.println(rs.getString(1)+" "+rs.getString(2));
           }
       } catch (SQLException e) {

       }*/	 
	

}
