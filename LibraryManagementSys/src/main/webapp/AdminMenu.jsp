<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="com.java.lib.model.AdminUsers" %>
<%@ page import="com.java.lib.dao.LibraryDaoImpl" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Admin Login</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            background: #f4f6f9;
            display: flex;
            justify-content: center;
            align-items: center;
            height: 100vh;
        }

        .login-container {
            background: #ffffff;
            padding: 30px 40px;
            border-radius: 10px;
            box-shadow: 0 4px 12px rgba(0, 0, 0, 0.1);
            width: 100%;
            max-width: 400px;
        }

        h2 {
            margin-bottom: 25px;
            text-align: center;
            color: #333;
        }

        input[type="text"], input[type="password"] {
            width: 100%;
            padding: 10px;
            margin: 8px 0 20px 0;
            border: 1px solid #ccc;
            border-radius: 5px;
            box-sizing: border-box;
        }

        input[type="submit"] {
            width: 100%;
            background-color: #4285f4;
            color: white;
            padding: 12px;
            border: none;
            border-radius: 5px;
            cursor: pointer;
            font-weight: bold;
        }

        input[type="submit"]:hover {
            background-color: #3367d6;
        }

        .error {
            color: red;
            text-align: center;
        }
    </style>
</head>
<body>
    <div class="login-container">
        <form method="post">
            <h2>Admin Login</h2>
            <label for="adminName">Username</label>
            <input type="text" name="adminName" id="adminName" required>

            <label for="adminPassword">Password</label>
            <input type="password" name="adminPassword" id="adminPassword" required>

            <input type="submit" value="Login">
        </form>

<%
    String user = request.getParameter("adminName");
    String password = request.getParameter("adminPassword");

    if (user != null && password != null) {
        AdminUsers admin = new AdminUsers();
        admin.setAdminName(user);
        admin.setAdminPassword(password);

        LibraryDaoImpl dao = new LibraryDaoImpl();
        int count = dao.admin(admin);

        if (count == 1) {
            session.setAttribute("admin", user);
            response.sendRedirect("AdminDashboard.jsp");
        } else {
%>
        <div class="error">Invalid admin credentials. Please try again.</div>
<%
        }
    }
%>
    </div>
</body>
</html>
