<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="f" uri="http://java.sun.com/jsf/core" %>
<%@ taglib prefix="h" uri="http://java.sun.com/jsf/html" %>
<!DOCTYPE html>
<f:view>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
  <h:form>
          <h:outputLabel for="age" value="ENTER YOUR AGE"/>
          <h:inputText id="age" value="#{ageBean.age}">
          <f:validateLongRange minimum ="18" maximum="60"/>
          </h:inputText>
          <h:message for="age" style="color:red"/>
          <br><br/>
          <h:message for="age" style="color:red"/><br></br>
          <h:commandButton value="Submit" action="#{age.submit }"/>
          </h:form>
      
 
</body>
</html>
</f:view>