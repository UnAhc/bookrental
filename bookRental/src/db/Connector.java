package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Connector {

	public static Connection makeConn() {
		String url = "jdbc:mysql://localhost/bookrental";

		Connection con = null;

		String id = "root";
		String pw = "";

		try {
			con = DriverManager.getConnection(url, id, pw);

		} catch (SQLException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		}
		return con;
	}

}
