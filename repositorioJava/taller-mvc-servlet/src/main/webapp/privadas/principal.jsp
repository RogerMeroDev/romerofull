<%@page import="fin.coop1504.tallerjava.datos.Usuario" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%

//String nombreUsuario = (String) request.getAttribute("usuario");
Usuario usuario=(Usuario)request.getSession().getAttribute("UsuarioDB"); 
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Pagina Principal</title>
</head>
<body>

	<font color="green"> Pagina Principal</font>


	<form id="form-1" action="/taller-mvc-servlet" method="get">
		<div>
			<div>Bienvenido <%=usuario%></div>
		</div>
		
		<div>
			<input type="submit" value="Regresar" id="button-1" />
		</div>
	</form>
<% String [] datos= {"Name1","Name2","Name3","Name4"}; %>


</body>
</html>