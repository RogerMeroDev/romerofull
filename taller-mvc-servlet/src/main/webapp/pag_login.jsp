<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1 class="text-center">Curso Java</h1>
	<h2 class="text-center">Soy un Servlet</h2>
	<div class="c15-f">
		<form action="/taller-app-web/ServletInicial" method="Post">
			<div class="mb-3">
				<label for="Nombre" class="form-label">Usuario</label> <input
					type="text" class="form-control" required id="input-1"
					aria-describedby="Nombre" placeholder="Ingrese su nombre"
					name="nombre">
				<div id="nombre" class="form-text">Escriba su usuario.</div>
			</div>
			<div class="mb-3">
				<label for="Edad" class="form-label">Edad</label> <input type="text"
					class="form-control" required id="input-1"
					aria-describedby="Nombre" placeholder="Ingrese su Edad" name="edad">
				<div id="Edad" class="form-text">Escriba su Password.</div>
			</div>
			<button type="submit" class="btn btn-primary" value="presiona"
				id="servlet">Login</button>

			<!--<table id="table-1" border="1" class="table">
			<tbody>
				<tr>
					<td>Nombre</td>
					<td><input required id="input-1" placeholder="Ingrese Nombre"
						type="text" name="nombre" /></td>
				</tr>
				<tr>
					<td>Edad</td>
					<td class="table-info"><input required id="input-2"
						placeholder="Ingrese Edad" type="text" name="edad" /></td>
				</tr>
			</tbody>
			<tfoot>
				<tr>
					<th scope="col"><input class="btn btn-outline-primary"
						type="submit" value="Presiona" id="servlet" /></th>
				</tr>
			</tfoot>
		</table>-->
		</form>
	</div>
</body>
</html>