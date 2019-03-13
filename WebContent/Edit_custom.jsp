<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" href="style.css">
<title>Insert title here</title>
</head>
<body>
	<center>
		<ul class="nav">
			<h4 style="color: blue;">
				<a href="Index.jsp" class="atag">Home</a> | <a href="ShowInvoice"
					class="atag">Booking Invoice</a>| <a href="EditControl"
					class="atag">Edit Profile</a>| <a href="Cancel.jsp" class="atag">Cancellation</a>|
				<a href="Help.jsp" class="atag">Help</a>| <a href="Index.jsp"
					class="atag">logout</a>
			</h4>
		</ul>
	</center>
	<p style="color: green; position: absolute; top: 60px; left: 180px">Customer
		Registration</p>
	<br>
	<br>

	<div id="p1">
		<form method="post" action="CustomerUpdation">
			<table>
				<tr>
					<td><label><b>Customer_Id</b> </label></td>
					<td>${cid}</td>
				</tr>
				<tr>
					<td><label><b>Email</b> </label></td>
					<td>${n}</td>
				</tr>

				<tr>
					<td><label><b>Password</b> </label></td>
					<td><input type="password" name="pwd1" required /></td>
				</tr>
				<tr>
					<td><label><b>Re-Type Password</b> </label></td>
					<td><input type="password" name="pwd2" required /></td>
				</tr>
				<tr>
					<td><label><b>Date of Birth</b> </label></td>
					<td><input type="date" name="dob" required /></td>
				</tr>
				<tr>
					<td><label><b>Address</b> </label></td>
					<td><textarea name="address" rows=5 cols=22 required /></textarea></td>
				</tr>
				<tr>
					<td><label><b>Gender</b> </label></td>
					<td><select name="gender" required />
						<option value="Male">Male
						<option value="Female">Female</td>
				</tr>
				<tr>
					<td><label><b>Phone</b> </label>
					<td><input type="number" name="contact" required /></td>
				</tr>
				<tr>
					<td><label><b>SSN Type</b> </label></td>
					<td><select name="ssnt" required />
						<option value="1">1
						<option value="2">2
						<option value="3">3
						<option value="4">4
						<option value="5">5</td>
				</tr>
				<tr>
					<td><label><b>SSN Number</b> </label></td>
					<td><input type="number" name="ssnn" required /></td>
				</tr>
			</table>
			<input type="submit" id="btn1" value="Update">
		</form>
		</center>
</body>
</html>
