<%@ page import="java.util.*, com.luv2code.web.jdbc.*" %>
<!DOCTYPE html>
<html>

<head>
	<title>Student Tracker App</title>
	
	<link type="text/css" rel="stylesheet" href="css/style.css">
</head>

<%
// get the students from the request object (sent by servlet)
	List<Telefono> theStudents = 
			(List<Telefono>) request.getAttribute("STUDENT_LIST");
%>

<body>

	<div id="wrapper">
		<div id="header">
			<h2>Modelo y fallas de telefono</h2>
		</div>
	</div>

	<div id="container">
	
		<div id="content">
		
			<table>
			
				<tr>
					<th>Telefono</th>
					<th>Dueño</th>
					<th>Detalle</th>
				</tr>
				
				<%
								for (Telefono tempStudent : theStudents) {
								%>
				
					<tr>
						<td> <%= tempStudent.getNombreTelefono() %> </td>
						<td> <%= tempStudent.getDueño() %> </td>
						<td> <%= tempStudent.getDetalle() %> </td>
					</tr>
				
				<% } %>
				
			</table>
		
		</div>
	
	</div>
</body>


</html>








