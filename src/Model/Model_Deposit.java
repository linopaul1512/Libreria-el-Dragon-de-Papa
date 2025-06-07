package Model;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import Controller.ConnectionBD;

public class Model_Deposit {
	
	String sqlStatement;
	Statement st;
	ResultSet rs;
	ConnectionBD conn;
	Deposit found;;
	
	
	
	public Model_Deposit() {
		conn = new ConnectionBD();
	}
	
	public Deposit Search(String cod) {
		found = null;     
		st = conn.connectBD();
		sqlStatement = "Select * from deposit where CodeDeposit = '" +cod + "'";
		try {
			rs = st.executeQuery(sqlStatement);
			if(rs.next())
				found = new Deposit(cod, 
							rs.getString(2),
							rs.getString(3),
							rs.getString(4)
							
							);
			}catch(SQLException e) {
			e.printStackTrace();
		}
		
		return  found;
	}
	
	public Boolean Include (Deposit dep) {
		Boolean ready = false;
		if(Search(dep.getCode())== null)
		{
			sqlStatement = "insert into deposit values('"+
					                                        dep.getCode()+"','"+
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
	
	
	
	public Boolean Modify(Deposit dep)
    {
        Boolean ready = false;
        if (Search(dep.getCode()) != null)
        {
            sqlStatement= "Update deposit set Name = '"
                                           + dep.getCode() + "', Name='"
                                           + dep.getName() + "', Type='"  
                                           + dep.getType() 
                                           + "' Where CodeDeposit  ='" + dep.getCode() + "' and Status='A'";
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
  
        sqlStatement = "Update deposit set Status='I' where CodeDeposit='" +
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
  
        sqlStatement = "Update deposit set Status='A' where CodeDeposit='" +
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
