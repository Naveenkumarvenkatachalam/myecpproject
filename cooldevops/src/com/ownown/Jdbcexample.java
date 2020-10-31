package com.ownown;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.jdbc.Driver;

public class Jdbcexample {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/kumar","root","");
		Statement statemennt=connection.createStatement();
		int count=statemennt.executeUpdate("insert into onboard(id,name,role,address)values(8,'sachin','client','mumbai')");
		if(count>0)
		{
		System.out.println("inserted");	
		}
	}

}


