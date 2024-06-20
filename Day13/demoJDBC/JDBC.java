package demoJDBC;
import java.sql.*;

public class JDBC {

	
	public static void main(String[] args) throws ClassNotFoundException , SQLException {
		// TODO Auto-generated method stub
		Class.forName("oracle.jdbc.driver.OracleDriver");//load the Driver
		String url="jdbc:oracle:thin:@localhost:1521:orcl";
		String userid="system";
		String pass="orcl";
		Connection con=DriverManager.getConnection(url,userid,pass);//connection
		Statement st=con.createStatement();//create statement obj
		//st.executeUpdate("insert into stu values(1005,'Aravinthan','Chennai,TamilNadu')");
		//st.executeUpdate("delete from stu where htno=1002");
		String query = "select * from stu";//write a query
		ResultSet rs = st.executeQuery(query);
		while(rs.next()) {//Fetch the Result
			System.out.println(rs.getInt(1)+"||"+rs.getString(2)+"||"+rs.getString(3));
		}
		rs.close();//close the all connection 
		st.close();
		con.close();
	}

}
