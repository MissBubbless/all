<%@ page import="java.util.ArrayList" %>
<%@ page import="CarDealerH.CarModel" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<table >
		<tr >
			<td><b>ModelNumber</b></td>
			<td><b>YearofProduction</b></td>
			<td><b>DownPayment</b></td>
		</tr>
<!-- 	USE REFERENCE -->
	<% ArrayList<CarModel> CM = (ArrayList<CarModel>) request.getAttribute("carlist"); 
		for(CarModel c: CM){
	%>
	
		<tr >
				<td><%=c.getBrand() %></td>
				<td><%=c.isCondition() %></td>
				<td><%=c.getColour()  %>></td>
				<td><%=c.getPrice()  %>></td>
				<td><%=c.getSeries()  %>></td>
				<td><%=c.getVin() %>></td>
				
		</tr>
	<%	}
	%>
	</table>
	<br/><br/>
			
	<table  >
		<tr >
			<td><b>Brand</b></td>
			<td><b>Colour</b></td>
			<td><b>Price</b></td>
			<td><b>Series</b></td>
			<td><b>Vin</b></td>
		</tr>
	<% ArrayList<CarModel> CM1 = (ArrayList<CarModel>) request.getAttribute("carlist"); 
	for(CarModel c: CM1){
	%>
			
		<tr >
			<td><%=c.getBrand() %></td>
				<%-- <td><%=c.get %></td> sipposed to have condition but it is not showing--%>
				<td><%=c.getColour()  %>></td>
				<td><%=c.getPrice()  %>></td>
				<td><%=c.getSeries()  %>></td>
				<td><%=c.getVin() %>></td>
		</tr>
		
	<%	}
	%>
	</table>
	
	<a href="next.jsp">NEXT RESOURCE</a>
</body>
</html>