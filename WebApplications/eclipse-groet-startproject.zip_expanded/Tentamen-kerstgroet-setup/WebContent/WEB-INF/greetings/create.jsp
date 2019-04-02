<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt"%>
<!DOCTYPE html">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Maak een nieuwe kadowens aan</title>
</head>
<body>

	<!-- Check of message aanwezig is -->
	<c:if test="${not empty message}">
    		<p>${message}</p>
	</c:if>
	<form action="">
		Groet: <input type="text" required size="60"> <br> 
		Ontvanger: <input type="text" required size="30"> <br> 
		Afzender: <input type="text" required size="30"> <br> 
		<input type="submit" value="Maak groet"> <br>
	</form>

</body>
</html>