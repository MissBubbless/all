<html>
<body>
<form method='post' action='http://localhost:8080/servlets/Login'>
		<p>User ID:</p>
		<input type="text" name="id">
		<p>Password</p>
		<input type="password" name="password">
		<input type="submit"
			value="SUBMIT">
<%

// take the name and pasword
  String name = request.getParameter("myname");
  String password = request.getParameter("mypassword");
 %>
<%-- Print out the variables. --%>
<h1>Hello, <%=name%> !</h1>
Please enter your password <%=password%>. 

</body>
</html>