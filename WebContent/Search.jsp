<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="ShowFlightController" method="post"><table cellspacing="10px"><tr><td>
  <label>Leaving from:</label></td><td>
                <select name="from" required>
    <option value="mumbai">Mumbai</option>
    <option value="chennai">Chennai</option>
    <option value="kolkata">Kolkatta</option>
    <option value="delhi">Delhi</option>
  </select></td></tr><tr><td>
<label >Going To:</label></td><td>
                <select name="to" required>
    
    <option value="chennai">Chennai</option>
    <option value="kolkata">Kolkatta</option>
    <option value="delhi">Delhi</option>
                <option value="mumbai">Mumbai</option>
  </select></td></tr>
<tr><td><label for="st_dte">Departure Date(MM/dd/yyyy):</label></td><td>
<input type="date"  name="dte" min="2019-03-01"  required></td></tr>
<tr><td><label for="st_tym">Departure Time:</label></td><td>
<input type="time"  name="tym"
       min="9:00" max="18:00" required></td></tr>
<tr><td>
  <label >Seats To Book:</label></td><td>
<input type="number" name="seats" min="1" max="20" required><br> </td></tr><tr><td>

<tr><td>   </td> <td><input type="submit" value="Show Flight"></td></tr>
</table>
</form>

</body>
</html>