<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link rel="stylesheet" href="Style.css">
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Book Page</title>
</head>
<body>
<img src="C:\Users\765782\Pictures\flight.jpg" alt="bgimage" class="homeimage">
<center><b>
<a href="Index.jsp"class="atag">Home</a>|
<a href="Register.jsp" class="atag">Customer Registration</a>|
<a href="Search.jsp" class="atag">Searching and Booking</a>|
<a href="Index.jsp" class="atag">Logout</a>
</b>
<h1 style="color:green;">Book Page</h1></center>
<form method="post" action="BookingController">
Flight No<span class="asterisk">*</span>
<select name="flight">
<option value="A1-191">A1-191</option>
<option value="DL-151">DL-151</option>
<option value="AL-51">AL-51</option>
<option value="DL-151">DL-151</option>
<option value="DLA-151">DLA-151</option>
</select>

Customer ID<span class="asterisk">*</span>
<input  type="number" name="cid" min="1" max="40"required>


Seats Requested<span class="asterisk">*</span>
<input id="seat" type="number" name="seat" min="1" max="20"required>
<input type="submit" name="book" value="Book">
</form>
<br><br>


</body>
</html>
