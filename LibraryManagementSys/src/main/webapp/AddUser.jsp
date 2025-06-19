<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="com.java.lib.model.AdminUsers" %>
<%@ page import="com.java.lib.dao.LibraryDaoImpl" %>
<%@ page import="java.sql.*" %>
<%@ page import="com.java.lib.util.EncryptPassword" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Create Admin Account</title>
</head>
<body>

<form method="post">
    <h2>Create Admin Account</h2>
    Admin Username: <input type="text" name="adminName" required><br><br>
    Password: <input type="password" name="adminPassword" required><br><br>
    Re-type Password: <input type="password" name="retypePassword" required><br><br>
    <input type="submit" value="Create Account">
</form>

<%
    String adminName = request.getParameter("adminName");
    String adminPassword = request.getParameter("adminPassword");
    String retypePassword = request.getParameter("retypePassword");

    if (adminName != null && adminPassword != null && retypePassword != null) {
        if (!adminPassword.equals(retypePassword)) {
%>
            <p style="color:red;">Passwords do not match. Please try again.</p>
<%
        } else {
            try {
                AdminUsers admin = new AdminUsers();
                admin.setAdminName(adminName);
                admin.setAdminPassword(adminPassword);

                String encrypted = EncryptPassword.getCode(adminPassword);

                Connection conn = com.java.lib.util.ConnectionHelper.getConnection();
                PreparedStatement ps = conn.prepareStatement("INSERT INTO Admins(UserName, PassWord) VALUES (?, ?)");
                ps.setString(1, adminName);
                ps.setString(2, encrypted);
                int rows = ps.executeUpdate();

                if (rows > 0) {
%>
                    <p style="color:green;">Admin account created successfully!</p>
<%
                } else {
%>
                    <p style="color:red;">Failed to create admin account. Try again.</p>
<%
                }
            } catch (Exception e) {
%>
                <p style="color:red;">Error: <%= e.getMessage() %></p>
<%
            }
        }
    }
%>

</body>
</html>
