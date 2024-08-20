<%@page import="test.Deposit"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <% HttpSession sessions=request.getSession(false);
    String session_name=(String)sessions.getAttribute("session_id");%>
    
 <jsp:useBean id="obj1" class="test.Deposit" scope="application"/>
  <jsp:setProperty name="obj1" property="userid" value='<%=session_name%>'/>
    <jsp:setProperty name="obj1" property="amount" param="amount"/>
      
    
    <% int value=Deposit.depositMoney(obj1);
    if(value!=0)
    {
    	 out.println("<center><h1>Amount deposited successfully</h1></center>");
    	 out.println("<center><h2><a href='dashboard.jsp'>back to dashboard</a></h2><center>");
    }
    
    else
    {
    	out.println("Error occured");
    }
    %>