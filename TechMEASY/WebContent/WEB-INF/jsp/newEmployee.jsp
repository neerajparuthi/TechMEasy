<%@ include file="/WEB-INF/jsp/include.jsp" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Employee Registration</title>
</head>
<body>

<form:errors  path="employee.*"></form:errors>

<form action="/TechMEASY/empRegisterSuccess" method="POST">
<h1><center>${msg}</center></h1>

<table>
	
	
	<tr>
		<td>Employee Name</td>
		<td>
			<input type="text" name="empName" />
		</td>
	</tr>
	
	<tr>
		<td>Employee Age</td>
		<td>
			<input type="text" name="empAge" />
		</td>
	</tr>
	
	<tr>
		<td>Employee Mobile Number</td>
		<td>
			<input type="text" name="empMobile" />
		</td>
	</tr>
	
	<tr>
		<td>Employee Country</td>
		<td>
			<input type="text" name="address.empCountry" />
		</td>
	</tr>
	
	<tr>
		<td>Employee City</td>
		<td>
			<input type="text" name="address.empCity" />
		</td>
	</tr>
	
	<tr>
		<td>Employee Pincode</td>
		<td>
			<input type="text" name="address.empPincode" />
		</td>
	</tr>
	<tr><td>
	<input type="submit" value="Register" />
	</td><tr>
</table>

</form>





</body>
</html>