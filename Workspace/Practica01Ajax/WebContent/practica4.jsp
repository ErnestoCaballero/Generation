<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
    <h2>Práctica 4</h2>
    <form action="Practica4Servlet" method="POST">
        <label for="txtJson">Pega tu Json: </label>
        <input type="text" id="txtJson" name="txtJson" placeholder="Json">
        <input type="submit" value="Serializa con el Json">
    </form>
</body>
</html>