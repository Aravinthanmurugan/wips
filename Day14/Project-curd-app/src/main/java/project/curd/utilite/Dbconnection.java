package project.curd.utilite;

import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;

public class Dbconnection {

	public static Connection getDatabaseConnection() {
		// TODO Auto-generated method stub
		Connection con = null;
		Properties properties=new Properties();
		try {
			FileReader reader =new FileReader("C://data/db.properties");
			properties.load(reader);
			Class.forName(properties.getProperty("database.driver"));
			String url = properties.getProperty("database.url");
			String uid= properties.getProperty("database.username");
			String pwd= properties.getProperty("database.password");
			con = DriverManager.getConnection(url,uid,pwd);
		
		}
		catch(Exception e) {
			
		}
		return con;
	}

}
