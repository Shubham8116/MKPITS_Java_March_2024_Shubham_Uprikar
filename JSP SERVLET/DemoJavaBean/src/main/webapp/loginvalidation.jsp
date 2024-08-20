<%@page import="test.DBBeans"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <jsp:useBean id="obj" class="test.DBBeans" scope="application"/>
    <%String userid=request.getParameter("userid");%>
    <%String password=request.getParameter("psw");%>
    
    <%
    int value=DBBeans.checklogin(userid, password);
    if(value==1)
    {
    	 HttpSession sessions=request.getSession();
	      sessions.setAttribute("session_id",userid);
	      sessions.setAttribute("session_pass",password);
	      
    	response.sendRedirect("dashboard.jsp");  
    }
    else{
    	
    	out.print("Login failed ! invalid username or password");
    }
   
    %>
    
 
