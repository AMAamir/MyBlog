package com.myblog.helper;

import java.sql.*;

public class MyConnection {
	public static  Connection con;
	public static Connection getConnection() {
		try {
			if(con==null)
			{
				System.out.print("working....A");
				Class.forName("com.mysql.cj.jdbc.Driver");
			
				System.out.print("working....B"); 
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/myblog","root","");
			
			}
			
		} catch (Exception e) {
			 
			e.printStackTrace();
		}
		return con;
	}
}
