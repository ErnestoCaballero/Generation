<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Resultado</title>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
</head>
<body>
    <h2>¡Resultado final!</h2>
    <% 
        int resultadoOperacion = (int)request.getAttribute("resultado");
        out.println("La suma es: " + resultadoOperacion);
    %>
    <p>
        <% out.println("Resultado: " + resultadoOperacion); %>
    </p>
</body>
</html>