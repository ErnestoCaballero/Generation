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
    <h2>Práctica 3 - Deserialización JSON</h2>
    <div id="Container">
    <form action="Practica3Servlet" method="GET">
        <P>
            <label for="txtNombre">Nombre: </label>
            <input type="text" id="txtNombre" name="txtNombre">
        </P>
        <P>
            <label for="txtApellidoPaterno">Apellido Paterno: </label>
            <input type="text" id="txtApellidoPaterno" name="txtApellidoPaterno">
        </P>
        <P>
            <label for="txtApellidoMaterno">Apellido Materno: </label>
            <input type="text" id="txtApellidoMaterno" name="txtApellidoMaterno">
        </P>
        <P>
            <label for="txtSexo">Sexo: </label>
            <input type="text" id="txtSexo" name="txtSexo">
        </P>
        <P>
            <label for="txtDomicilio">Domicilio: </label>
            <input type="text" id="txtDomicilio" name="txtDomicilio">
        </P>
        <P>
            <label for="txtEdad">Edad: </label>
            <input type="text" id="txtEdad" name="txtEdad">
        </P>
        <P>
            <label for="txtEstatura">Estatura: </label>
            <input type="text" id="txtEstatura" name="txtEstatura">
        </P>
        <P>
            <input type="button" id="btnAcepto" value="Haz click!">
        </P>
    </form>
    <div id="divResultado">

    </div>
    </div>
</body>
<script src="Scripts/practica3.js"></script>
</html>