package Controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ConnectionBD {

	private Statement st;
	private ResultSet rs;
    private Connection conn;
    
    
    private String url, user, password, driver;
	
    
    public ConnectionBD () {
    	driver = "com.mysql.cj.jdbc.Driver";
		password = "Lino#00";
		user = "root";
		url = "jdbc:mysql://localhost/librery";
    }
    
    public Statement connectBD() {
		conn=null;
		try { 
			Class.forName(driver);
			conn = DriverManager.getConnection(url, user, password);
			st = conn.createStatement();
		} catch (SQLException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();	
		}	return st;
    }
    
}
