<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<head><link rel="stylesheet" href="Style.css">
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body class="id">
<ul>
<a href="Index.jsp">Home</a>|
<a href="Register.jsp">Customer Registration</a>|
<a href="Search.jsp">Searching and Booking</a>|
<a href="Index.jsp">Logout</a></li>
</ul>
<p style="color:green;position:absolute;top:60px;left:180px">Customer Registration</p>
<div id="p1">
<form action="CustomerRegistration" method="post" >
<table>
	<tr>
		<td><label><b>Name  </b> </label></td>
		<td><input type="text" name="uname"required/></td>
	</tr>
	<tr>
		<td><label><b>Email</b>  </label></td>
		<td><input type="email" name="mail" required/></td>
	</tr>
	<tr>
		<td><label><b>Password</b>  </label></td>
		<td><input type="password" name="pwd1" required/></td>
	</tr>
	<tr>
		<td><label><b>Re-Type Password</b>  </label></td>
		<td><input type="password" name="pwd2" required/></td>
	</tr>
	<tr>
		<td><label><b>Date of Birth</b>  </label></td>
		<td><input type="date" name="dob" required/></td>
	</tr>
	<tr>
		<td><label><b>Address</b>  </label></td>
		<td><textarea name="address" rows=5 cols=22 required/></textarea></td>
	</tr>
	<tr>
		<td><label><b>Gender</b>  </label></td>	
		<td>
		<select name="gender" required/>
		<option value="Male">Male
		<option value="Female">Female
		</td>
	</tr>
	<tr>
		<td><label><b>Phone</b>  </label>
		<td><input type="text" name="contact" required/></td>
	</tr>
	<tr>
		<td><label><b>SSN Type</b>  </label></td>
		<td>
		<select name="ssnt" required/>
		<option value="1">1
		<option value="2">2
		<option value="3">3
		<option value="4">4
		<option value="5">5
		</td>
	</tr>
	<tr>
		<td><label><b>SSN Number</b>  </label></td>
		<td><input type="number" name="ssnn" required/></td>
	</tr>
</table>
<input type="submit" id="btn1" value="Register">
</form>
</div>
</body>
</html>