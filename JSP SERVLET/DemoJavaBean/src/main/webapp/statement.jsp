<%@page import="org.apache.jasper.tagplugins.jstl.core.ForEach"%>
<%@page import="test.Passbook"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@page import="test.TransactionEntity"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>


<% HttpSession sessions=request.getSession(false);
    String session_name=(String)sessions.getAttribute("session_id");%> 

<% 
List<TransactionEntity> tr_list=new ArrayList();

Passbook ps= new Passbook();

//getting list of transaction entity object
tr_list=ps.getHistory(session_name);
%>


         <html><head><link rel='stylesheet' href='MyStyle.css'>
         </head><body>
         <section>
         <h1>Account Statement</h1>
         <div class="tbl-header">
         	<table>
             <thead>
             <tr>
         
             
      	   <th>
             userid
           </th>
            <th>
            transaction date
            </th>
             <th>
            amount
             </th>
             <th>
            transaction type
            </th>
             
             
         
         </tr></thead></table></div>
         
         <div class="tbl-content"><table><tbody id="enter">
         
        
         
<% for(TransactionEntity tran:tr_list){ %>
	

             <tr>
            <td>
             <%=tran.getUserid()%>
             </td>
            <td>
             <%=tran.getTransdate()%>
             </td>
             <td>
             <%=tran.getAmount()%>
             </td>
             <td>
             <%=tran.getTranstype()%>
             </td>
             </tr>
             
<% }%>
             

        
         </tbody>
        </table>
       </div>
      </section>
         
         <center><h3><a href='dashboard.jsp'>back to dashboard</a></h3><center>
         </body>
         </html>


	



