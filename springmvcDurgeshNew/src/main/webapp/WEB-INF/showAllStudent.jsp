 <%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <jsp:useBean id="student" class="springmvcDurgesh.model.Student" scope="request" />
    <jsp:setProperty name="student" property="*"/>
    
<!DOCTYPE html>
<html>
<head><%@ page isELIgnored="false" %>
<title>Student Details</title>
</head>
<body>
	
    <h3>List of Students :</h3>
    <ul>
 
        <c:forEach var="student" items="${listStd}">
            <li>${student}</li>
        </c:forEach>
 
    </ul>
</body>
</html>
 
