package com.xwokrz.newspaper;

import java.sql.*;

public class Tester {
	static String url="jdbc:mysql://localhost:3306/newspaper";
	static String userName="root";
	static String password="SQL123456789";
	static String sqlStatement="insert into newspaper values(5,'marathi','tarun Bharat',12,20)";

	public static void main(String[] args) throws Exception {
		Connection connection=DriverManager.getConnection(url, userName, password);	
	
	Statement statement=connection.createStatement();
		statement.executeUpdate(sqlStatement);
		
		
		System.out.println(connection + url);
	}

}
