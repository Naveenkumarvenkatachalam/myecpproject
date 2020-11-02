package com.connex;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.ResultSetImpl;
import com.mysql.jdbc.Statement;

public class Jdbc {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      
		
		try {
			Class.forName(" com.mysql.cj.jdbc.Driver");
            java.sql.Connection connect=	DriverManager.getConnection("jdbc:mysql://root@localhost/naveen");
			Statement statement=(Statement) connect.createStatement();
			ResultSet resultset=statement.executeQuery("select*from onboard");
			while(resultset.next())
			{
				System.out.println(resultset.getString("name"));
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	 catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}

}
