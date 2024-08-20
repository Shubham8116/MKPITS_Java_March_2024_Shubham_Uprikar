<%@page import="test.DBBeans"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    
    <jsp:useBean id="obj" class="test.DBBeans"  scope="application"/>
    <jsp:setProperty name="obj" property="userid" param="userid"/>
    <jsp:setProperty name="obj" property="password" param="psw"/>
    <jsp:setProperty name="obj" property="fullname" param="fullname"/>
    <jsp:setProperty name="obj" property="address" param="address"/>
    <jsp:setProperty name="obj" property="city" param="city"/>
    <jsp:setProperty name="obj" property="balance" param="balance"/>
    
    <%
    int value=DBBeans.saveDetails(obj);
    if(value!=0)
    {
    	
    	out.print("Data stored successfully");
    	
    	 out.println("<center><h1>Registration Successfull</h1>");
	  	      out.println("<h1>Please login again</h1>");
	  	      out.println("<h1><a href='index.html'>login</a></h2></center>");
	      	response.sendRedirect("index.jsp");  

    }
    else{
    	
    	out.print("failed to store data");
    }
   
    %>
  
<