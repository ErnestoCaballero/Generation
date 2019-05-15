<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="css/style.css">
</head>
<body>
	<h2>Práctica 2</h2>
	<form action="Practica2Servlet" method="POST">
        <label for="txtNombre">Introduce tu nombre: </label>
        <input type="text" id="txtNombre" name="txtNombre" placeholder="Nombre">
        <input type="button" id="btnAcepta" value="Haz click!">
    </form>
    <div id="divResultado">

    </div>
</body>
<script src="Scripts/practica2.js"></script>
</html>