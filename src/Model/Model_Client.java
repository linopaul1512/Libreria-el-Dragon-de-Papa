package Model;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import Controller.ConnectionBD;

public class Model_Client {

	String sqlStatement;
	Statement st;
	ResultSet rs;
	ConnectionBD conn;
	Client found;
	
	
	
	public Model_Client() {
		conn = new ConnectionBD();
	}
	
	public Client Search(String cod) {
		found = null;     
		st = conn.connectBD();
		sqlStatement = "Select * from client where CodeClient = '" +cod + "'";
		try {
			rs = st.executeQuery(sqlStatement);
			if(rs.next())
				found = new Client(cod, 
							rs.getString(2),
							rs.getString(3),
							rs.getString(4),
							rs.getString(5),
							rs.getString(6),
							rs.getString(7)
							);
			}catch(SQLException e) {
			e.printStackTrace();
		}
		
		return  found;
	}
	
	public Boolean Include (Client cli) {
		Boolean ready = false;
		if(Search(cli.getCodeClient())== null)
		{
			sqlStatement = "insert into client values('"+
					                                        cli.getCodeClient()+"','"+
					                                        cli.getName()+"','"+
					                                        cli.getLastname()+"','"+
					                                        cli.getSex()+"','"+
					                                        cli.getAdress()+"','"+
					                                        cli.getID()+"','A')"; 
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
	
	
	
	public Boolean Modify(Client cli)
    {
        Boolean ready = false;
        if (Search(cli.getCodeClient()) != null)
        {
            sqlStatement= "Update client set Name = '"
                                           + cli.getName() + "', Lastname='"
                                           + cli.getLastname() + "', Sex='"  
                                           + cli.getSex() + "', Adress='" 
                                           + cli.getAdress() + "', ID='"          
                                           + cli.getID() 
                                           + "' Where CodeClient  ='" + cli.getCodeClient() + "' and Status='A'";
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
  
        sqlStatement = "Update client set Status='I' where CodeClient='" +
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
  
        sqlStatement = "Update client set Status='A' where CodeClient='" +
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