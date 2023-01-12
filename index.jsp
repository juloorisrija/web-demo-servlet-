<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Registration Page</h1>

<form action="<%=request.getContextPath() %>/welcomeServlet" method="post">

Enter username <input type="text" name="uname" placeholder="Enter username"/><br></br>

Enter password <input type="password" name="pwd" placeholder="Enter password"/><br></br>
select date <input type="date" name="todaydate"/><br><br>

<!--Enter Email <input type="text" name="Email" placeholder="Enter Your Email"/><br></br>-->

<input type="submit" value="login"/><br></br>

</form>

</body>
</html>