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

public class LoginValidation extends HttpServlet {
	private static final long serialVersionUID = 1L;
     
    public LoginValidation() {
        super();
        
    }
       static String global_id;
	  //creating String object for the jdbc driver
	    public final static String driver = "com.mysql.cj.jdbc.Driver";
	    //creating String url for the database connection
	    public final static String url = "jdbc:mysql://localhost:3306/newbankdatabase";
	    //creating String username for the database connection
	    public final static String username = "root";
	    //creating String password for the database connection
	    public final static String dbpassword = "Shubham123";
	

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");

	      
	      PrintWriter out = response.getWriter();
	      
	      String userid=request.getParameter("userid");
	    //  global_id=userid;
	     // System.out.println(global_id);
	      String password=request.getParameter("psw");
	      
	      HttpSession session=request.getSession();
	      session.setAttribute("session_id",userid);
	      session.setAttribute("session_pass",password);
	     

		 //loading jdbc driver
      try {
			Class.forName(driver);
		 
      
      Connection con = null;
      
      //establishing database connection
     
			con = DriverManager.getConnection(url,username,dbpassword);
		
      //establishing database connection
      Connection connection=con;
      
      Statement stmt=connection.createStatement();
      ResultSet rs=stmt.executeQuery("select userid,password from accmaster");
      
     int success=0;
      while(rs.next())
      {
    	  if((userid.equals(rs.getString(1))) && (password.equals(rs.getString(2))))
    	  {

  		    response.sendRedirect("home.html");  	
  		    success=1;
    	  }
    	 
    	  
      }
      
      if(success!=1)
      {
    	  out.println("<h1>Error</h1>");
		    response.sendRedirect("index.html");  	

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
