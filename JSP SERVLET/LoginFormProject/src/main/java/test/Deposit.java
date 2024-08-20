package test;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.protocol.x.ContinuousOutputStream;

public class Deposit extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
    public Deposit() {
        super();
       
    }
  //creating String object for the jdbc driver
    public final static String driver = "com.mysql.cj.jdbc.Driver";
    //creating String url for the database connection
    public final static String url = "jdbc:mysql://localhost:3306/newbankdatabase";
    //creating String username for the database connection
    public final static String username = "root";
    //creating String password for the database connection
    public final static String dbpassword = "Shubham123";
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		  HttpSession session=request.getSession(false);
          String session_name=(String)session.getAttribute("session_id");
		
		 int input_amount=Integer.parseInt(request.getParameter("amount"));
		 
		 response.setContentType("text/html");
		 
	      PrintWriter out = response.getWriter();
	      
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
	         
	         ResultSet rs=stmt.executeQuery("select BALANCE from accmaster where USERID="+"'"+session_name+"'");
	         int db_amount=0;
	        
	         while(rs.next())
	         {
	        	db_amount=rs.getInt(1);
	        	break;
	         } 
	         
	         
	         PreparedStatement preparedStatement= connection.prepareStatement("insert into transactions values(?,?,?,?)");
	         
	         preparedStatement.setString(1,session_name);
	         preparedStatement.setObject(2,java.time.LocalDate.now());
	         preparedStatement.setInt(3,input_amount);
	         preparedStatement.setString(4,"deposit");
	         int value=preparedStatement.executeUpdate();
	         
	         db_amount=db_amount+input_amount;
	         System.out.println(db_amount);
	         
	         PreparedStatement preparedStatementnext= connection.prepareStatement("update accmaster set BALANCE=? where USERID="+"'"+session_name+"'");
	         preparedStatementnext.setInt(1,db_amount);
	         int value1=preparedStatementnext.executeUpdate();
	         
	         if(value!=0 && value1!=0)
	         {
	        	 out.println("<center><h1>Amount deposited successfully</h1></center>");
	        	 out.println("<center><h2><a href='home.html'>back to dashboard</a></h2><center>");
	         }
	         connection.close();
	       }
	       catch (ClassNotFoundException e) {
				
	    	   out.println(e);
			}
	       catch (SQLException e) {
				
	    	   out.println(e);
			}
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
