package koPapirOlloAblakosDb;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Db {

	private Connection con;
	

	public Db() {
		
		try {
			
			con = DriverManager.getConnection(
					"jdbc:mysql://localhost/ko_papir_ollo",
					"root",
					""
					);
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public Connection getCon() {
		return con;
	}
	
}
