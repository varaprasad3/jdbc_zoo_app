package com.ty.zoo.dao;
import com.ty.zoo.dto.*;
import com.ty.zoo.util.*;
import static com.ty.zoo.util.AppConstraints.SECRET_KEY;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
public class VisitorDao 
{
    public int saveVisitor(Visitor visitor)
    {
    	Connection connection = ConnectionHelper.getConnection();
    	String sql = "INSERT INTO jdbc_zoo.visitor VALUES(?,?,?,?,?,?)";
    	try {
    	PreparedStatement preparedStatement = connection.prepareStatement(sql);
    	preparedStatement.setInt(1, visitor.getId());
    	preparedStatement.setString(2, visitor.getName());
    	preparedStatement.setString(3, visitor.getEmail());
    	preparedStatement.setString(4, visitor.getPhone());
    	preparedStatement.setString(5, visitor.getGender());
    	preparedStatement.setString(6, visitor.getAge());
    	System.out.println("Data inserted");
    	return preparedStatement.executeUpdate();
    	
    	} 
    	catch(SQLException e)
    	{
    		e.printStackTrace();
    	}
    	return 0 ;
    	}
     public static void main(String[] args) {
    	 VisitorDao visitorDao = new VisitorDao();
    	 visitorDao.saveVisitor(new Visitor(1,"prasad","prasad@gmail.com","6309326176","male","23"));
		
	}
    }

