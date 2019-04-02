<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt"%>
<!DOCTYPE html">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Maak een nieuw Koopje aan</title>
</head>
<body>

	<!-- Check of message aanwezig is -->
	<c:if test="${not empty message}">
    		<p>${message}</p>
	</c:if>
	<form action="" method="post">
		titel: <input type="text" name="title" required> <br> <!-- required voor de nullcheck -->
		beschrijving: <input type="text" name="description"> <br> 
		price: <input type="text" name="price" placeholder="12.34" required><br>
		<input type="submit" value="Plaats Koopje"> <br>
	</form>

</body>
</html>