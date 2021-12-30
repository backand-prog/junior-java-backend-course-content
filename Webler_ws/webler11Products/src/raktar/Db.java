package raktar;

import java.sql.*;


public class Db {

	private Connection con;

	public Db() {	

		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection(
					"jdbc:mysql://localhost/webler_raktar",
					"root",
					""
					);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public Connection getCon() {

		return con;

	}
	
	public ResultSet lekerdez(String sql) {
		ResultSet rs = null;
		Statement stm = null;
		
		
		try {
			stm = con.createStatement();
			rs = stm.executeQuery(sql);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return rs;
		
	}

}
