package Emp.project.from;

import java.sql.*;

public class DB {
	  Connection conn;
	  Statement s;
		public  DB() {
			try {Class.forName("com.mysql.cj.jdbc.Driver");
//				String url="jdbc:mysql://localhost:3306/libraryManagementSystem";
//				String userName="root";
//				String password="1234";
//				
				conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/libraryManagementSystem","root","Koila@2020");
			s= conn.createStatement();
			}
			catch(Exception e) {
				e.printStackTrace();
			}}}
