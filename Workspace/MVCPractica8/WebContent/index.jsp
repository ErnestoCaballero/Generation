<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"  %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
<link rel="stylesheet" href="css/style.css">
</head>
<body>
    <h2>MVC Practice - 8</h2>
    <div class="form-group">
        <form class="centro" action="index.jsp" method="post">
            <label for="txtNombre" id="txtNombre">Nombre: </label>
            <input type="text" id="txtNombre" name="txtNombre" class="form-control" placeholder="Nombre completo" value="Sin nombre"><br/>
            
            <label for="txtCalificacion1" id="txtCalificacion1">Calificacion 1: </label>
            <input type="text" id="txtCalificacion1" name="txtCalificacion1" class="form-control" placeholder="Equitación"><br/>
            
            <label for="txtCalificacion2" id="txtCalificacion2">Calificación 2: </label>
            <input type="text" id="txtCalificacion2" name="txtCalificacion2"  class="form-control" placeholder="Regresión Lineal"><br/>
            
            <input type="submit" id="btnEnter" class="btn btn-primary" value="Promediar">
            <input id="btnReset" type="button" class="btn btn-warning" value="Reset">
            
        </form>
    </div>

</body>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>
<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js" integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1" crossorigin="anonymous"></script>
<script src="scripts/script.js"></script>
</html>