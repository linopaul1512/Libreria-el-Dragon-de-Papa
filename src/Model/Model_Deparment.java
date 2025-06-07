package Model;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import Controller.ConnectionBD;




public class Model_Deparment {

	String sqlStatement;
	Statement st;
	ResultSet rs;
	Deparment found;
	ConnectionBD conn;
	
	public Model_Deparment() {
		conn = new ConnectionBD();
	}
	
	public Deparment Search(String cod) {
		found = null;     
		st = conn.connectBD();
		sqlStatement = "Select * from deparment where CodeDeparment = '" +cod + "'";
		try {
			rs = st.executeQuery(sqlStatement);
			if(rs.next())
				found = new Deparment(cod, 
							rs.getString(2),
							rs.getString(3),
							rs.getString(4));
			}catch(SQLException e) {
			e.printStackTrace();
		}
		
		return  found;
	}
	
	public Boolean Include (Deparment dep) {
		Boolean ready = false;
		if(Search(dep.getCodeDep())== null)
		{
			sqlStatement = "insert into deparment values('"+
					                                        dep.getCodeDep()+"','"+
					                                        dep.getName()+"','"+				                                       
					                                        dep.getType()+"','A')"; 
			try {
				st.executeUpdate(sqlStatement);
				ready = true;
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
		return ready;
	}
	
	
	public Boolean Modify(Deparment dep)
    {
        Boolean ready = false;
        if (Search(dep.getCodeDep()) != null)
        {
            sqlStatement= "Update deparment set Name = '"
                                           + dep.getName() + "', Type='"
                                           + dep.getType() 
                                           + "' Where CodeDeparment ='" + dep.getCodeDep() + "' and Status='A'";
			try {
				st.executeUpdate(sqlStatement);
				ready = true;
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		return ready;
    }
	
	
    public Boolean Delete(String cod)
    {
        Boolean ready = false;
  
        sqlStatement = "Update deparment set Status='I' where CodeDeparment='" +
                  cod + "'";
        try {
			st.executeUpdate(sqlStatement);
			ready = true;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        return ready;
        
    }	
	
    public Boolean Reactive(String cod)
    {
        Boolean ready = false;
  
        sqlStatement = "Update deparment set Status='A' where CodeDeparment='" +
                  cod + "'";
        try {
			st.executeUpdate(sqlStatement);
			ready = true;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        return ready;
        
    }       
	
	
	
}
	
	
	
