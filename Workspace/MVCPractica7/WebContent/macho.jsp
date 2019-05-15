<%@ page language="java" contentType="text/html; charset=UTF-"
    pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"  %>  
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>Resultado del MACHO</h2>
	<!-- Cuando se requiere un input type="Text" se utiliza el método request.getParameter("input") se utiliza la notación ${param.nombreDelinput}.
	Cuando se requiere traer un atributo especificado en el servlet como request.setAttribute("nombreAtributo") se utiliza la notación ${nombreAtributo}
	 -->
	<p>
		El Valor del resultado fue positivo y macho.
	</p>
	<c:set var="num1" value="${param.txtNumero1}"></c:set>
	<c:set var="num2" value="${param.txtNumero2}"></c:set>
	<p>
		Los valores de los números fueron <c:out value="${num1}"></c:out> y <c:out value="${num2}"></c:out>
		El valor del resultado fue positivo y <c:out value="${resultado}"></c:out>	
	</p>
	<p>	
		El valor de la resta es: <c:out value="${resta}"></c:out>
	</p>
</body>
</html>