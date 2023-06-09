<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Pagina de Error</title>
</head>
<body>
	<font color="green">Pagina de Errores</font>
<br>	
<br>

	<form id="form-1" action="/taller-mvc-servlet" method="get">
		<div >
			<div><%=request.getAttribute("codigo")%> - <%=request.getAttribute("mensaje") %></div>
		</div>
		<div>
			<input type="submit" value="Regresar" id="button-1" />
		</div>
	</form>
</body>
</html>