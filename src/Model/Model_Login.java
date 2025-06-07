package Model;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import Controller.ConnectionBD;


public class Model_Login {

	String sqlStatement;
	Statement st;
	ResultSet rs;
	ConnectionBD conn;
	Login found;
	
	public Model_Login() {
		conn =new ConnectionBD ();
	}
	
	
	public Login Enter(String username, String password) {
		found = null;     
		st = conn.connectBD();
		//sqlStatement ="Select * from user where Username='"+username+"' and Password='"+password+"'";
		//JOIN 
		sqlStatement = "Select Username, Password, Description From user, roles Where user.CodeRole = roles.CodeRole and Username='"+username+"' and Password='"+password+"'";
		
		try {
			rs = st.executeQuery(sqlStatement);
			if(rs.next())
				found = new Login( 
							rs.getString(1),
							rs.getString(2) 
						    );
			}catch(SQLException e) {
			e.printStackTrace();
		}
		return found;
	}
	
	



	
	
	
}
