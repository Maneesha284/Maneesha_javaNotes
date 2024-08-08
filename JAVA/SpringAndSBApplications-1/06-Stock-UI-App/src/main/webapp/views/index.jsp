<%@ page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title></title>
</head>
<body>
<h3> Get Stock Price Here</h3>
${msg}
<form action="getTotalCost">

Company Name : <input type="text" name="companyName">

Quantity : <input type="text" name="quantity">

<input type="submit" value="Get Cost">
</form>
</body>
</html>