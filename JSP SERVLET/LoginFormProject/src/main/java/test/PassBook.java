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
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

public class PassBook extends HttpServlet {
	private static final long serialVersionUID = 1L;
  
    public PassBook() {
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
      
      
      
  	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
  	{
  		
  		 
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
         
         ResultSet rs=stmt.executeQuery("select * from transactions where USERID='"+session_name+"'");
         //accessing metadata of the table
         ResultSetMetaData resultSetMetaData=rs.getMetaData();
         int count=resultSetMetaData.getColumnCount();
         
         
       
         out.print("<html><head><link rel='stylesheet' href='MyStyle.css'></head><body><section>\r\n"
         			+ "  <h1>Account Statement</h1> <h1></h1>\r\n"
         			+ "  <div class=\"tbl-header\">\r\n"
         			+ "    <table>\r\n"
         			+ "      <thead><tr>");
         
         for (int i = 1; i <=count ; i++) {
             //printing column name
             
      	   out.print("<th>");
             out.print(resultSetMetaData.getColumnName(i));
             out.print("</th>");
             
             
         }
         out.print("</tr></thead></table></div>");
         out.print("<div class='tbl-content'><table><tbody id='enter'>");
         
         //accessing each records using ResultSet object
         while(rs.next())
         {
             out.print("<tr><td>");
             out.print(rs.getString(1));
             out.print("</td>");

             

             for (int i = 2; i <= count; i++)
             {
                 out.print("<td>");

                out.print(rs.getString(i));
                 out.print("</td>");

             }
             out.print("</tr>");

         }
         out.print("</tbody>\r\n"
         		+ "    </table>\r\n"
         		+ "  </div>\r\n"
         		+ "</section>\r\n");
         out.print("<center><h5><a href='home.html'>back to dashboard</a></h5><center></body></html>");
          //closing database connection
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
