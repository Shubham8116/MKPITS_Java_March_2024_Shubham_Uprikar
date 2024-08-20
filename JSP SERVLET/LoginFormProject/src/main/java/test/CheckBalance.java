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
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.apache.catalina.startup.HomesUserDatabase;

public class CheckBalance extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
    public CheckBalance() {
        super();
        
    }


    //creating String object for the jdbc driver
      public final static String driver = "com.mysql.cj.jdbc.Driver";
      //creating String url for the database connection
      public final static String url = "jdbc:mysql://localhost:3306/newbankdatabase";
      //creating String username for the database connection
      public final static String username = "root";
      //creating String password for the database connection
      public final static String password = "Shubham123";
      

    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	        
	      HttpSession session=request.getSession(false);
          String session_name=(String)session.getAttribute("session_id");
         
          
          response.setContentType("text/html");      
	      PrintWriter out = response.getWriter();
	      
	      
	      

		 //loading jdbc driver
    try {
			Class.forName(driver);
		 
    
    Connection con = null;
    
    //establishing database connection
   
			con = DriverManager.getConnection(url,username,password);
		
    //establishing database connection
    Connection connection=con;
    //creating Statement class object
    Statement stmt=connection.createStatement();
    //passing query to ResultSet object
    
    ResultSet rs=stmt.executeQuery("select BALANCE from accmaster where USERID='"+session_name+"'");
	
    while(rs.next())
    {
    	out.println("<center><h1>Account Balance is : "+rs.getInt(1)+"</h1></center>");
    	break;
    }
	out.println("<center><h2><a href='home.html'>back to dashboard</a></h2><center>");
    connection.close();
		
    }
    catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		}
    catch (SQLException e) {
			
			e.printStackTrace();
		}

	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		doGet(request, response);
	}

}
