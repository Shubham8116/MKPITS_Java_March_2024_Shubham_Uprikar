<%@page import="test.Withdraw"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <% HttpSession sessions=request.getSession(false);
    String session_name=(String)sessions.getAttribute("session_id");%>
    
 <jsp:useBean id="obj2" class="test.Withdraw" scope="application"/>
  <jsp:setProperty name="obj2" property="userid" value='<%=session_name%>'/>
    <jsp:setProperty name="obj2" property="amount" param="amount"/>
      
    
    <% int value=Withdraw.withdrawMoney(obj2);
    

    if(value==-1)
    {
    	 out.println("<center><h1>Insufficient balance ! Please try again with lesser amount</h1></center>");
    	 out.println("<center><h2><a href='dashboard.jsp'>back to dashboard</a></h2><center>");
    }
    
    else if(value==1)
    {
    	 out.println("<center><h1>Amount withdrawn successfully</h1></center>");
    	 out.println("<center><h2><a href='dashboard.jsp'>back to dashboard</a></h2><center>");
    }
    
    else
    {
    	out.println("Error occured");
    }
    %>