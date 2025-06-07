package Model;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import Controller.ConnectionBD;

public class Model_Article {

	String sqlStatement;
	Statement st;
	ResultSet rs;
	ConnectionBD conn;
	Article found;
	
	
	
	public Model_Article() {
		conn = new ConnectionBD();
	}
	
	public Article Search(String cod) {
		found = null;     
		st = conn.connectBD();
		sqlStatement = "Select * from articles where CodeArt = '" +cod + "'";
		try {
			rs = st.executeQuery(sqlStatement);
			if(rs.next())
				found = new Article (cod, 
							rs.getString(2),
							rs.getString(3),
							rs.getDouble(4),
							rs.getString(5)
							);
			}catch(SQLException e) {
			e.printStackTrace();
		}
		
		return  found;
	}
	
	public Boolean Include (Article art) {
		Boolean ready = false;
		if(Search(art.getCodeArt())== null)
		{
			sqlStatement = "insert into articles values('"+
					                                        art.getCodeArt()+"','"+
					                                        art.getCodeDeparment()+"','"+
					                                        art.getName()+"',"+
					                                        art.getPrice()+",'A')"; 
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
	
	
	
	public Boolean Modify(Article art)
    {
        Boolean ready = false;
        if (Search(art.getCodeArt()) != null)
        {
            sqlStatement= "Update articles set Name = '"
                                           + art.getName() + "', CodeArt='"
                                           + art.getCodeArt() + "', CodeDeparment='"  
                                           + art.getCodeDeparment() + "', Price="  
                                           + art.getPrice() 
                                           + " Where CodeArt  ='" + art.getCodeArt() + "' and Status='A'";
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
  
        sqlStatement = "Update articles set Status='I' where CodeArt='" +
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
  
        sqlStatement = "Update articles set Status='A' where CodeArt='" +
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
