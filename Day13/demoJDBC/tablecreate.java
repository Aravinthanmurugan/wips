package demoJDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class tablecreate {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		Class.forName("oracle.jdbc.driver.OracleDriver");//load the Driver
		String url="jdbc:oracle:thin:@localhost:1521:orcl";
		String userid="system";
		String pass="orcl";
		Connection con=DriverManager.getConnection(url,userid,pass);//connection
		Statement st=con.createStatement();
		String query = "CREATE TABLE PRODUCT("
				+ "PROID NUMBER(4) PRIMARY KEY,"
				+ "PRONAME VARCHAR(20),"
				+ "PROPRICE NUMBER(6,2))";//write a query
		st.execute(query);
		System.out.println("Table Created");
	}

}
