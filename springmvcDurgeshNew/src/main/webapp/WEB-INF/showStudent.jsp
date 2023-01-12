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
	<h1>Student details</h1>
	<p>Student roll: <c:out value="${student.roll}"/></p>
	<p>Student name: <c:out value="${student.name}"/></p>
	<p>Student phone: <c:out value="${student.phone}"/></p>
</body>
</html>