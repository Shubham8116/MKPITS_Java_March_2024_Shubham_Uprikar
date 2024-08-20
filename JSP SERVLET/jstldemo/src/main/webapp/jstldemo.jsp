<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  
    <%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>  
    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSTL Demo</title>
</head>
<body>
<c:set var="username" scope="session" value="${1000/4}"/>
<c:out value="${'shubham'}"/>  
<c:out value="${username}"/> 
<c:set var="message" scope="session" value="${'hello'}"/>
<c:out value="${message}"/>

<c:if test="${username>150}" >
<c:out value="${username}"/>

</c:if>
<br>
<c:forEach var="value" begin="1" end="3">
<br>
item no. <c:out value="${value}"/>
</c:forEach> 
  <%-- <c:redirect url="https://www.youtube.com/"/>--%>

<c:set var="string" value="Hello ji, i am saurabh the foolish boy."/>  
${fn:substring(string, 5, 17)} <br> 
Length of the String is: ${fn:length(string)}<br>  

</body>
</html>