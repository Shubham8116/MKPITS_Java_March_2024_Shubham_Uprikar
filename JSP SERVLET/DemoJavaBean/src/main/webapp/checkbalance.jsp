<%@page import="test.DBBeans"%>

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
     <% HttpSession sessions=request.getSession(false);
    String session_name=(String)sessions.getAttribute("session_id");%>
    
        <jsp:useBean id="obj" class="test.DBBeans"  scope="application"/>
    
    <%
    int value=DBBeans.checkBalance(session_name);
    out.println("<center><h1>Account Balance is : "+value+"</h1></center>");
	out.println("<center><h2><a href='dashboard.jsp'>back to dashboard</a></h2><center>");

    
    %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

</body>
</html>