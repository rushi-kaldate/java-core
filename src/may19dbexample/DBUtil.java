package may19dbexample;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class DBUtil {
	private Connection con=null;
	
	private static DBUtil dbutil=null;
	
	private DBUtil() {}
	
	public static DBUtil getInstance() {
		if(dbutil == null)
			dbutil = new DBUtil();
		return dbutil;
	}

	public Connection getConnection() throws ClassNotFoundException, SQLException {
		if(con == null) {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url = "jdbc:mysql://localhost:3306/dbbatch1246";
			String un = "root";
			String pwd = "root";
			con = DriverManager.getConnection(url, un, pwd);
					
		}
		return con;
	}

}
