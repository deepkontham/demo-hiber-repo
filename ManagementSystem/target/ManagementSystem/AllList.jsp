<%@page import="java.util.List"%>
<%@page import="com.model.Engineer"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>
#customers {
	font-family: Arial, Helvetica, sans-serif;
	border-collapse: collapse;
	width: 100%;
}

#customers td, #customers th {
	border: 1px solid #ddd;
	padding: 8px;
}

#customers tr:nth-child(even) {
	background-color: #f2f2f2;
}

#customers tr:hover {
	background-color: #ddd;
}

#customers th {
	padding-top: 12px;
	padding-bottom: 12px;
	text-align: left;
	background-color: #04AA6D;
	color: white;
}
</style>
</head>
<body>
	<%
	List<Engineer> engineers = (List<Engineer>) request.getAttribute("list");
	%>

	<p style="color: blue">
		<%
		String msg = (String) request.getAttribute("msg");
		out.print(msg);
		%>
	</p>
	<%-- 	<h2><%=students%></h2> --%>
	<table id="Engineers">
		<tr>
			<th>Id</th>
			<th>ename</th>
			<th>esalary</th>
			<th>email</th>
			<th>Actions</th>
		</tr>
		<%
		for (Engineer engineer : engineers) {
		%>
		<tr>
			<td><%=engineer.getId()%></td>
			<td><%=engineer.getEname()%></td>

			<td><%=engineer.getEsalary()%></td>
			<td><%=engineer.getEmail()%></td>
			<td><a href="delete?id=<%=engineer.getId()%>">delete</a> <a
				href="update?id=<%=engineer.getId()%>">update</a></td>
		</tr>

		<%
		}
		%>

	</table>
</body>
</html>