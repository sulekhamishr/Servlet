<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="com.java.lib.model.AdminUsers" %>
<%@ page import="com.java.lib.dao.LibraryDaoImpl" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Admin Login</title>
</head>
<body>
    <form method="post">
        <center>
            <h2>Admin Login</h2>
            UserName: <input type="text" name="adminName" required><br><br>
            PassWord: <input type="password" name="adminPassword" required><br><br>
            <input type="submit" value="Login">
        </center>
    </form>
    
            <p><a href="CreateAdmin.jsp">Create Admin Account</a></p>
    

<%
    String user = request.getParameter("adminName");
    String password = request.getParameter("adminPassword");

    if (user != null && password != null) {
        AdminUsers admin = new AdminUsers();
        admin.setAdminName(user);
        admin.setAdminPassword(password);

        LibraryDaoImpl dao = new LibraryDaoImpl();
        int count = dao.admin(admin);  // Correct method for admin login

        if (count == 1) {
            session.setAttribute("admin", user);
            response.sendRedirect("AdminDashboard.jsp");
        } else {
%>
            <center><p style="color:red;">Invalid admin credentials. Please try again.</p></center>
<%
        }
        
        
    }
    
%>
</body>
</html>
