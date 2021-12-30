package currencyConverter;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Db {
	
	Connection con;
	
	public Db() {
		
		try {
			con = DriverManager.getConnection(
					"jdbc:mysql://127.0.0.1/converter",
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
	
	public ResultSet query(String sql) {
		
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
