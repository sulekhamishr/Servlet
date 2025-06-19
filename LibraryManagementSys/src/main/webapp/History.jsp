<%@page import="com.java.lib.model.TransReturn"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>


   <jsp:include page="Menu.jsp"></jsp:include>
  <jsp:useBean id="libraryDao" class="com.java.lib.dao.LibraryDaoImpl"/>
  
  <%
  //session.get attribute - if their is username it will bring the username from transReturn and it will show the username
  //here user is object that's why it's return into String typecast
  
  String user = (String)session.getAttribute("user");
  List<TransReturn> history = libraryDao.historyBook(user);

  
  %>
  
  <table border="5" align="center">
  
  <tr>
    <th>UserName</th>
    <th>BookId  </th>
    <th>FromDate</th>
    <th>ToDate  </th>
    
  </tr>
  <%
     for(TransReturn trans  :history  ){
    	 
     //scriplet tag - <%=
  
  %>
      <tr>
     
        <td><%=trans.getUserName() %></td>
        <td><%=trans.getBookId() %>  </td>
        <td><%=trans.getFromdate()%> </td>
        <td><%=trans.getTodate() %>  </td>
      
      </tr>
<%

     }
%>

</table>
</body>
</html>