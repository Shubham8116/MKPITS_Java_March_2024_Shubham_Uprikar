package test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Deposit {
	//creating String object for the jdbc driver
    public final static String driver = "com.mysql.cj.jdbc.Driver";
    //creating String url for the database connection
    public final static String url = "jdbc:mysql://localhost:3306/newbankdatabase";
    //creating String username for the database connection
    public final static String username = "root";
    //creating String password for the database connection
    public final static String dbpassword = "Shubham123";

	private String userid;
	private int amount;
	
    public Deposit()
    {
    	
    }
    
    public Deposit(String userid,int amount)
    {
    	this.userid=userid;
    	this.amount=amount;
    }
    
    
    
    public String getUserid() {
		return userid;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}
	
	

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public static int depositMoney(Deposit obj1)
    {
    	int success=0;
    	 
    	     
    	      
    		 //loading jdbc driver
    	       try {
    				Class.forName(driver);
    			 
    	       
    	       Connection con = null;
    	       
    	       //establishing database connection
    	      
    				con = DriverManager.getConnection(url,username,dbpassword);
    			
    	       //establishing database connection
    	       Connection connection=con;
    	       
    	       Statement stmt=connection.createStatement();
    	         //passing query to ResultSet object
    	         
    	         ResultSet rs=stmt.executeQuery("select BALANCE from accmaster where USERID="+"'"+obj1.getUserid()+"'");
    	         int db_amount=0;
    	        
    	         while(rs.next())
    	         {
    	        	db_amount=rs.getInt(1);
    	        	break;
    	         } 
    	         
    	         System.out.println("hello"+obj1.getUserid());
    	         PreparedStatement preparedStatement= connection.prepareStatement("insert into transactions values(?,?,?,?)");
    	         
    	         preparedStatement.setString(1,obj1.getUserid());
    	         preparedStatement.setObject(2,java.time.LocalDate.now());
    	         preparedStatement.setInt(3,obj1.getAmount());
    	         preparedStatement.setString(4,"deposit");
    	         int value=preparedStatement.executeUpdate();
    	         
    	         db_amount=db_amount+obj1.getAmount();
    	         System.out.println(db_amount);
    	         
    	         PreparedStatement preparedStatementnext= connection.prepareStatement("update accmaster set BALANCE=? where USERID="+"'"+obj1.getUserid()+"'");
    	         preparedStatementnext.setInt(1,db_amount);
    	         int value1=preparedStatementnext.executeUpdate();
    	         
    	         if(value!=0 && value1!=0)
    	         {
    	        	 success=1;
    	         }
    	         connection.close();
    	       }
    	       catch (ClassNotFoundException e) {
    				
    	    	   System.out.println(e);
    			}
    	       catch (SQLException e) {
    				
    	    	   System.out.println(e);
    			}
    	
    	
    	return success;
    }

}
