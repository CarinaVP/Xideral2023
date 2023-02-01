<!DOCTYPE html>
<html>

<head>
	<title>Add Student</title>

	<link type="text/css" rel="stylesheet" href="css/style.css">
	<link type="text/css" rel="stylesheet" href="css/add-student-style.css">	
</head>

<body>
	<div id="wrapper">
		<div id="header">
			<h2>Modelo y fallas de telefono</h2>
		</div>
	</div>
	
	<div id="container">
		<h3>Agregar Telefono</h3>
		
		<form action="StudentControllerServlet" method="GET">
		
			<input type="hidden" name="command" value="ADD" />
			
			<table>
				<tbody>
					<tr>
						<td><label>Telefono:</label></td>
						<td><input type="text" name="nombreTelefono" /></td>
					</tr>

					<tr>
						<td><label>Dueño:</label></td>
						<td><input type="text" name="dueño" /></td>
					</tr>

					<tr>
						<td><label>Detalle:</label></td>
						<td><input type="text" name="detalle" /></td>
					</tr>
					
					<tr>
						<td><label></label></td>
						<td><input type="submit" value="Save" class="save" /></td>
					</tr>
					
				</tbody>
			</table>
		</form>
		
		<div style="clear: both;"></div>
		
		<p>
			<a href="StudentControllerServlet">Back to List</a>
		</p>
	</div>
</body>

</html>











