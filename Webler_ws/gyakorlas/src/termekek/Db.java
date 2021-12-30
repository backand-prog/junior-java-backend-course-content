package termekek;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Db {

	private Connection con;

	public Db() {
		try {
			con = DriverManager.getConnection(
					"jdbc:mysql://127.0.0.1/webler_hsz_java_db2",
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