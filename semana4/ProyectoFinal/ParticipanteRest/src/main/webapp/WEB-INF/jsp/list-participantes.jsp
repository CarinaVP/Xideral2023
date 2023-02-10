<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>

<html>

<head>

    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/css/bootstrap.min.css">
	<title> Lista Participantes de Ajedrez</title>
	
	<!-- reference our style sheet -->

	<link type="text/css"
		  rel="stylesheet"
		  href="${pageContext.request.contextPath}/css/style.css" />

</head>

<body>

	<div id="wrapper">
		<div id="header" ALIGN=center>
		<div class="p-3 mb-2 bg-danger text-white">Lista Participantes de Ajedrez</div>

		</div>
	</div>

	<div id="container">
	
		<div id="content">
		    
			<!-- put new button: Add Participante -->
			<button id= "agregar" type="button" class="btn btn-outline-danger" value="Agregar"
				   onclick="window.location.href='showFormForAdd'; return false;"
				   class="add-button">Agregar</button>
		<br>
	
		
			<!--  add our html table here -->
		
			<table>
				<tr id= "datos">
					<th>Nombre</th>
					<th>Apellido</th>
					<th>Correo</th>
					<th>Action</th>
				</tr>
				
				<!-- loop over and print our customers -->
				<c:forEach var="tempParticipante" items="${participantes}">
				
					<!-- construct an "update" link with customer id -->
					<c:url var="updateLink" value="/mvc/showFormForUpdate">
						<c:param name="participanteId" value="${tempParticipante.id}" />
					</c:url>					

					<!-- construct an "delete" link with customer id -->
					<c:url var="deleteLink" value="/mvc/delete">
						<c:param name="participanteId" value="${tempParticipante.id}" />
					</c:url>					
					
					<tr>
						<td> ${tempParticipante.nombre} </td>
						<td> ${tempParticipante.apellido} </td>
						<td> ${tempParticipante.correo} </td>
						
						<td>
							<!-- display the update link -->
							<a href="${updateLink}">Cambiar</a>
							|
							<a href="${deleteLink}"
							   onclick="if (!(confirm('Seguro de eliminar el registro?'))) return false">Eliminar</a>
						</td>
						
						
					</tr>
				
				</c:forEach>
						
			</table>
				
		</div>
	
	</div>
	<script src="https://cdn.jsdelivr.net/npm/jquery@3.5.1/dist/jquery.slim.min.js" integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-Fy6S3B9q64WdZWQUiU+q4/2Lc9npb8tCaSX9FK7E8HnRr0Jz8D6OP9dO5Vg3Q9ct" crossorigin="anonymous"></script>
	

</body>

</html>









