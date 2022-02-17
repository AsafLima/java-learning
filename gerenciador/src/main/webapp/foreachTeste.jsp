
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<!-- UM LAÇO QUE VAI DE 1 A 10 PULANDO DE 2 EM 2 -->
	<c:forEach var="i" begin="1" end="10" step="2">
		${i} <br/>
	</c:forEach>

</body>
</html>