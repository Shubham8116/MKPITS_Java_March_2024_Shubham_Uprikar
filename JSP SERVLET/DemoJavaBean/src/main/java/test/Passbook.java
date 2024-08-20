package test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class Passbook {
	//creating String object for the jdbc driver
    public final static String driver = "com.mysql.cj.jdbc.Driver";
    //creating String url for the database connection
    public final static String url = "jdbc:mysql://localhost:3306/newbankdatabase";
    //creating String username for the database connection
    public final static String username = "root";
    //creating String password for the database connection
    public final static String dbpassword = "Shubham123";
    
	List<TransactionEntity> tr_list = new ArrayList<TransactionEntity>();

    
    public List<TransactionEntity> getHistory(String uid)
    {
    	
			
    		try {
				Class.forName(driver);
			 
	       
	       Connection con = null;
	       
	       //establishing database connection
	      
				con = DriverManager.getConnection(url,username,dbpassword);
			
	       //establishing database connection
	       Connection connection=con;
	       
	       
	       Statement stmt=connection.createStatement();
	         //passing query to ResultSet object
	         
	         ResultSet rs=stmt.executeQuery("select * from transactions where USERID='"+uid+"'");
		
			while (rs.next()) {
				
				TransactionEntity transactionEntity = new TransactionEntity(rs.getString(1),rs.getString(2),rs.getInt(3),rs.getString(4));
				tr_list.add(transactionEntity);
			}
		} catch (ClassNotFoundException e) {
			
	    	   System.out.println(e);
			}
	       catch (SQLException e) {
				
	    	   System.out.println(e);
			}
	       return tr_list;
    }
    		

}
