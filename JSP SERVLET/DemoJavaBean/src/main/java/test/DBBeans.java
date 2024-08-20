package test;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;



public class DBBeans {
	
	private String userid;
	private String password;
	private String fullname;
	private String address;
	private String city;
	private int balance;
	
	
	public DBBeans()
	{
		
	}
	
	
	public DBBeans(String userid,String password,String fullname,String address,String city,int balance)
	{
		this.userid=userid;
		this.password=password;
		this.fullname=fullname;
		this.address=address;
		this.city=city;
		this.balance=balance;
	}


	public String getUserid() {
		return userid;
	}


	public void setUserid(String userid) {
		this.userid = userid;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public String getFullname() {
		return fullname;
	}


	public void setFullname(String fullname) {
		this.fullname = fullname;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	public String getCity() {
		return city;
	}


	public void setCity(String city) {
		this.city = city;
	}


	public int getBalance() {
		return balance;
	}


	public void setBalance(int balance) {
		this.balance = balance;
	}
	
	
	public static int saveDetails(DBBeans obj) {
		int value=0;
        Connection connection = null;
        PreparedStatement preparedStatement = null;

        try {
        	
        	Class.forName("com.mysql.cj.jdbc.Driver");

            String url = "jdbc:mysql://localhost:3306/newbankdatabase";
            String root = "root";
            String password = "Shubham123";
            connection = DriverManager.getConnection(url, root, password);
            Class.forName("com.mysql.cj.jdbc.Driver");

            connection = DriverManager.getConnection(url, root, password);
        	
            

            String query = "INSERT INTO accmaster (userid,password,fullname,address,city,balance) VALUES (?, ?, ?, ?, ?, ?)";
            preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1,obj.getUserid());
            preparedStatement.setString(2,obj.getPassword());
            preparedStatement.setString(3,obj.getFullname());
            preparedStatement.setString(4,obj.getAddress());
            preparedStatement.setString(5,obj.getCity());
            preparedStatement.setInt(6,obj.getBalance());

            value=preparedStatement.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (preparedStatement != null) preparedStatement.close();
                if (connection != null) connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        
        return value;
}
	
	public static int checklogin(String input_userid,String input_password) {
		int success=0;
		  try {
				Class.forName("com.mysql.cj.jdbc.Driver");
			 
				 String url = "jdbc:mysql://localhost:3306/newbankdatabase";
		            String root = "root";
		            String dbpassword = "Shubham123";
	      Connection con = null;
	      
	      //establishing database connection
	     
				con = DriverManager.getConnection(url,root,dbpassword);
			
	      //establishing database connection
	      Connection connection=con;
	      
	      Statement stmt=connection.createStatement();
	      ResultSet rs=stmt.executeQuery("select userid,password from accmaster");
	      
	     
	      while(rs.next())
	      {
	    	  if((input_userid.equals(rs.getString(1))) && (input_password.equals(rs.getString(2))))
	    	  {

	  		     	
	  		    success=1;
	    	  }
	    	 
	    	  
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
	
	public static int checkBalance(String input_userid)
	{
		int balance=0;
			 //loading jdbc driver
	      try
	      {
	      Class.forName("com.mysql.cj.jdbc.Driver");
			 
			 String url = "jdbc:mysql://localhost:3306/newbankdatabase";
	            String root = "root";
	            String dbpassword = "Shubham123";
	    
	    Connection con = null;
	    
	    //establishing database connection
	   
				con = DriverManager.getConnection(url,root,dbpassword);
			
	    //establishing database connection
	    Connection connection=con;
	    //creating Statement class object
	    Statement stmt=connection.createStatement();
	    //passing query to ResultSet object
	    
	    ResultSet rs=stmt.executeQuery("select BALANCE from accmaster where USERID='"+input_userid+"'");
		
	    while(rs.next())
	    {
	    	balance=rs.getInt(1);
	    	break;
	    }
	
	    connection.close();
			
	    }
	    catch (ClassNotFoundException e) {
				
				e.printStackTrace();
			}
	    catch (SQLException e) {
				
				e.printStackTrace();
			}

		return balance;
	}
	
}

