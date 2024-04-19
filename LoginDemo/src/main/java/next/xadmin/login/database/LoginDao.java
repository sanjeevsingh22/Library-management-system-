package next.xadmin.login.database;

import java.sql.Connection;
import java.sql.SQLException;

import next.xadmin.login.bean.LoginBean;

public class LoginDao {
	
	private String dbUrl = "jdbc://localhost:3306/userdb";
	private String dbUname = "root";
	private String dbPassword = "root";
	private String dbDriver ="com.mysql.cj.jdbc.Driver";
	
	public void loadDriver(String dbDriver) 
	{
		try {
			
		
		Class.forName(dbDriver);
	}catch (ClassNotFoundException e) {
		
		e.printStackTrace();
	}
 }
	public Connection getConnection()
	{
		Connection con = null;
		con= DriveManager.getConnection(dbUrl, dbUname,dbPassword);
	}catch (SQLException e)	 {
		//TODO Auto-generated catch block
		e.printStackTrace();
				
	}
	
	
	public boolean validate(LoginBean loginBean) {
		loadDriver(dbDriver);
		
		
		
		return false;
		
	}
	

}
;