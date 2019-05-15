<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>Práctica 5 MVC - Scriplets</h2>
	<table>
	<thead>
		<tr><th>Id</th><th>Nombre</th></tr>
	</thead>
	<tbody>
	<%
		for (int i = 0; i < 100; i++) {
			out.println("<tr><td>"+i+"</td><td>El macho<br/></td></tr>");	
		}	
	%>
	</tbody>
	</table>
	
	<jsp:scriptlet>
		out.println("Lorem ipsum dolor sit amet, consectetur adipiscing elit. Vestibulum augue urna, vestibulum non tellus vel, ultrices placerat quam. Donec a ante euismod, feugiat lacus at, consectetur elit. Nulla bibendum pretium metus, id consectetur eros feugiat quis. Quisque velit eros, lacinia dapibus semper vitae, pellentesque quis sapien. Donec malesuada mi ut purus tempor venenatis. In imperdiet mollis vulputate. Curabitur rhoncus nunc eget dolor volutpat sagittis. Integer ac quam in sem hendrerit scelerisque in id arcu.");
	</jsp:scriptlet>
</body>
</html>