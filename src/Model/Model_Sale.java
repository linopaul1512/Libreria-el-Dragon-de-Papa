package Model;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import Controller.ConnectionBD;
import View.View_Sale;

public class Model_Sale {
	String sqlStatement;
	Statement st;
	ResultSet rs;
	
	ConnectionBD conn;
	
	Sale found;
	Client client;
	Article article;
	View_Sale  viewsale;
	
	
	int CurrentAmount=0;
	
	
	public Model_Sale() {
		conn= new ConnectionBD();
	}
	
	
	public Sale Search(String CodeSale) {
		found = null;
		st = conn.connectBD();
		found = null;     
		st = conn.connectBD();
		sqlStatement = "Select * from sale where CodeSale = '" + CodeSale + "'";
		try {
			rs = st.executeQuery(sqlStatement);
			if(rs.next())
				found = new Sale(CodeSale, 
							rs.getString(2),
							rs.getString(3),
							rs.getString(4),
							rs.getString(5),
							rs.getString(6),
							rs.getString(7),
							rs.getString(8),
							rs.getString(9),
							rs.getInt(10),
							rs.getDouble(11),
							rs.getDouble(12),
							rs.getDouble(13),
							rs.getString(14));
			}catch(SQLException e) {
			e.printStackTrace();
		}
		
		return found;
	}
	
	
	public Client SearchClient(String cod) {
		client = null;     
		st = conn.connectBD();
		sqlStatement = "Select * from client where CodeClient = '" +cod + "'";
		try {
			rs = st.executeQuery(sqlStatement);
			if(rs.next())
				client = new Client(cod, 
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
		
		return  client;
	}

	
	public Article SearchArticle(String cod) {
		article = null;     
		st = conn.connectBD();
		sqlStatement = "Select * from articles where CodeArt = '" +cod + "'";
		try {
			rs = st.executeQuery(sqlStatement);
			if(rs.next())
				article = new Article (cod, 
							rs.getString(2),
							rs.getString(3),
							rs.getDouble(4),
							rs.getString(5)
							);
			}catch(SQLException e) {
			e.printStackTrace();
		}
		
		return  article;
	}
	
	public Boolean Include (Sale sale) {
		Boolean ready = false;
		if(Search(sale.getCodesale())== null)
		{
			sqlStatement = "insert into sale values('"+
					                                        sale.getCodesale()+"','"+
					                                        sale.getCodeclient()+"',"+	
					                                        sale.getIVA()+",'"+	
					                                        sale.getDate()+"','A')"; 
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
	
	public Boolean DetailSale (DetailSale ds) {
		Boolean ready = false;
		if(Search(ds.getCodeDS())== null)
		{
			sqlStatement = "insert into detail_sale values('"+
					                                        ds.getCodeDS()+"','"+
					                                        ds.getCodeArt()+"',"+	
					                                        ds.getCodeSale()+",'"+	
					                                        ds.getQuantity()+"','A')"; 
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
	
	public Boolean UpdateArticleDeposit(String codart, String coddeposit, int quantity)
    {
        Boolean ready = false;
        if (Search(codart) != null)
        {
            sqlStatement= "Select Quantity from deposit_article where CodeArt='"
            		                       + codart+"' and  CodeDeposit="
            		                       + coddeposit +"Quantity="
            							   + quantity +'"';
            
         
        
			try {
				rs = st.executeQuery(sqlStatement);
				if(rs.next()) {
					CurrentAmount = rs.getInt(1) - quantity;
				}
				st.executeUpdate(sqlStatement);
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		      sqlStatement= "Update deposit_article set Quantity=" + quantity + " where CodeArt='"
		    		  + codart +"' and  CodeDeposit="
                      + coddeposit + "'";
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



	
	
	
	
}
