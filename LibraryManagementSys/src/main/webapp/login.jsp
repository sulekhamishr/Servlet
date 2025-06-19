<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="login.jsp" method="post">
	
	
<!--  Submits to itself (login.jsp) using POST method. -->


<!-- Basic input fields for username and password. -->
		<center>
			<h2>Login Account</h2>
			 User Name :
			<input type="text" name="username" required><br><br>

			 Password :
			<input type="password" name="password" required><br><br>

			<input type="submit" value="Login">
		</center>
	</form>
	
	
	<!-- Checks if form has been submitted by verifying if both parameters exist. -->
	<%
	if (request.getParameter("username")!=null && 
		request.getParameter("password")!=null) {
		
		// checks if both the form exists...
		String user = request.getParameter("username");
		String pwd  = request.getParameter("password");
%>

<!-- Creates a new LibUsers object.

Automatically sets the form fields (username, password) into the object's properties using setUsername() and setPassword() -->

	<jsp:useBean id="libUsers" class="com.java.lib.model.LibUsers" />
	<jsp:setProperty property="*" name="libUsers"/>
	<jsp:useBean id="libraryDao" class="com.java.lib.dao.LibraryDaoImpl" />
	
<%

//If login is successful, Sets the user attribute in session scope,Forwards user to Menu.jsp.

	int count = libraryDao.login(libUsers);
	if (count==1) {
		session.setAttribute("user", request.getParameter("username"));
%>
	<jsp:forward page="Menu.jsp" />
<%
	} else {
		out.println("Invalid Credentials...");
	}
	}
%>
	
</body>
</html>