<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page import="com.java.jstl.CalcBean" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Simple Calculator</title>
</head>
<body>

<form method="get" action="CalcBean.jsp">
    <center>
        <label>First No:</label>
        <input type="number" name="firstNo" required /><br><br>
        <label>Second No:</label>
        <input type="number" name="secondNo" required /><br><br>
        <input type="submit" value="Calculate" /><br><br>
    </center>
</form>

<c:if test="${param.firstNo != null && param.secondNo != null}">
    <jsp:useBean id="beanCalc" class="com.java.jstl.CalcBean" />
    <jsp:setProperty name="beanCalc" property="firstNo" value="${param.firstNo}" />
    <jsp:setProperty name="beanCalc" property="secondNo" value="${param.secondNo}" />

    <p>Sum is: <c:out value="${beanCalc.sum}" /></p>
    <p>Sub is: <c:out value="${beanCalc.sub}" /></p>
    <p>Mult is: <c:out value="${beanCalc.mul}" /></p>
</c:if>

</body>
</html>
