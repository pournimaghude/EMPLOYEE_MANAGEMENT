<!doctype html>
<%@page import="com.example.entity.Employee"%>
<%@page import="java.util.List"%>
<html lang="en">
<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>Bootstrap demo</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH"
	crossorigin="anonymous">
</head>
<body>

	<div class="container">
		<h5>${msg}</h5>
		<h1>Home Page</h1>
		<%
			List<Employee> employees=(List<Employee>)request.getAttribute("emps");
		%>

		<table class="table">
			<thead>
				<tr>
					<th scope="col">EmpId</th>
					<th scope="col">Name</th>
					<th scope="col">Email</th>
					<th scope="col">Phone</th>
					<th scope="col">Update</th>
					<th scope="col">Delete</th>
				</tr>
			</thead>
			<tbody>
				<%
				for(Employee employee : employees)
				{
				%>
					<tr>
					<td><%=employee.getEid() %></td>
					<td><%=employee.getName()%></td>
					<td><%=employee.getEmail()%></td>
					<td><%=employee.getPhone()%></td>
					<td><a href="<%=request.getContextPath()%>/update?eid=<%=employee.getEid() %>">Update</a></td>
					<td><a href="#">Delete</a></td>
				</tr>
				<%} %>
			</tbody>
		</table>
		<a href="email">Send Email</a><br>
		<a href="/">Add</a>
	</div>

	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js"
		integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz"
		crossorigin="anonymous"></script>
</body>
</html>