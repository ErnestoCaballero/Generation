<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
</head>
<body>
        <h1>Create Prepared Statment</h1>
        <div id="formulario" class="form-group">
            <form action="CreatePreparedStatementServlet" method="POST">
                    <label for="txtNombreProducto">Nombre del producto: </label>
                    <input type="text" id="txtNombreProducto" name="txtNombreProducto" class="form-control"><br/>
                    <label for="txtPrecioProducto">Precio del producto: </label>
                    <input type="text" id="txtPrecioProducto" name="txtPrecioProducto" class="form-control"><br/>
                    <label for="txtExistenciaProducto">Existencias: </label>
                    <input type="text" id="txtExistenciaProducto" name="txtExistenciaProducto" class="form-control"><br/>
                    <input type="submit" class="btn btn-primary" value="Enviar">
            </form>
        </div>
        <p>
            <a href="index.jsp">Menú Principal</a>
        </p>
</body>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>
<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js" integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1" crossorigin="anonymous"></script>
</html>