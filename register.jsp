<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
   <%@ include file="header.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style type="text/css">

body {
background-color:green;
}
h1{
color: white;
}
</style>
</head>
<body>
<h1> User Registration Page</h1>
<form action="<%=request.getContextPath() %>/RegisterPage" method="post" id="reg">
Enter username <input type="text" name="username" placeholder="Enter username"/><br></br>
Enter userid <input type="text" name="userid" placeholder="Enter userid"/><br></br>
Enter Phonenumber <input type="text" name="phno" placeholder="Enter PhoneNumber"/><br></br>
<input type="submit" value="login"/><br></br>
</form>
</body>
</html>