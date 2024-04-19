package myPackage;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String url = "jdbc:mysql://localhost:3306/sonu";
		String dbName = "sonu";
		String driver ="com.mysql.jdbc.Driver";
		String userName = "root";
		String password = "root";
		
		try {
//			Class.forName(driver);
			Connection con=DriverManager.getConnection(url,userName,password);
			Statement stmt=con.createStatement();
			int result = stmt.executeUpdate("insert into Employee values('1','Sonu','500000')");
			if(result > 0)
				System.out.println("Successfully inserted");
			else
				System.out.println("unsucessfull insertion");
			con.close();
					
		}
          catch(Exception e){
        	  System.out.println(e);
          }



 
	}

}
;