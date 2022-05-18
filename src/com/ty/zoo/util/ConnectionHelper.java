package com.ty.zoo.util;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class ConnectionHelper 
{
    
    	static Connection connection = null;
    	static String url = "jdbc:mysql://localhost:3306/javabatch";
    	static String username = "root";
    	static String password = "root";
    	public static Connection getConnection()
    	{
        try {
        	Class.forName("com.mysql.cj.jdbc.Driver");   
        	connection = DriverManager.getConnection(url, username, password);
        	return connection;
        	}
        catch(ClassNotFoundException a)
        {
        	a.printStackTrace();
        }
        catch(SQLException e)
        {
        	e.printStackTrace();
        }
           return null;
    	
    }
}
