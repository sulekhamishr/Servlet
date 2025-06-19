<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Student Selection</title>
</head>
<body>

    <form method="get" action="CaseEx1.jsp">
        <center>
            Student No:
            <input type="number" name="sno" /><br><br/>
            <input type="submit" value="Show" name="Show"/><br><br/>
        </center>
    </form>

    <c:if test="${param.sno != null}">
        <c:set var="sno" value="${param.sno}" />
        <c:choose>
            <c:when test="${sno == 1}">
                <c:out value="Hi, I am Nirmayala"/>
            </c:when>
            <c:when test="${sno == 2}">
                <c:out value="Hi, I am Sandahan"/>
            </c:when>
            
             <c:when test="${sno == 3}">
                <c:out value="Hi, I am Sulekha"/>
            </c:when>
            <c:otherwise>
                <c:out value="Student not found"/>
            </c:otherwise>
        </c:choose>
    </c:if>

</body>
</html>
