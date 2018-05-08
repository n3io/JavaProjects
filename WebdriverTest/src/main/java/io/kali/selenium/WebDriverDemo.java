package io.kali.selenium;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class WebDriverDemo {

	public static void main(String[] args) {
		
		Connection con;
		Statement st;
		ResultSet re;
		
		try {
		//	Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
			con = DriverManager.getConnection("jdbc:ucanaccess://c:///temp//Books2010.accdb");
			st=con.createStatement();
			re= st.executeQuery("select * from tbstudent");
			System.out.println("success");
			
		}catch(Exception e) {
			System.out.println(e);
			
		}
		
		
		

	}

}
