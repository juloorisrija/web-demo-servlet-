<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page import ="java.util.List" %>
<%@page import =" com.training.web.model.User" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"  %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%

String user=(String)request.getAttribute("user");

//out.print(" Welcome ${user}! You are successfully logged in ");

List<User>userList=(List<User>)request.getAttribute("usrList");

//out.println("<table border='1'> ");

//out.println("<tr> <th>");

//out.println("Name </th>");

//out.println("<th> Password </th>");

%>
<c:out value=" Welcome ${user}! You are successfully logged in "/>

<table border="1">

<tr>

<th>Name</th>

<th>Password</th>
<th>date</th>

 

<c:forEach items="${usrList}" var="user" >

<tr>

<td>${user.getUserName() }</td>

<td>${ user.getPassword() } </td>
<td><fmt:formatDate value="${user.getDate1()}" type="date" pattern="dd-MM-YYYY"/> </td>

</tr>

</c:forEach>

<%-- <%

for(User usr:userList) { %>

<tr>

<td><%=usr.getUserName() %> </td>

<td><%=usr.getPassword() %> </td>

</tr>

<!--out.println("<tr><td>" +usr.getUserName() +"</td>");

out.println("<td>" +usr.getPassword() +"</td> </tr>");-->

<%}%>--%>

<c:url value="/header.jsp" var="headerUrl">

<c:param name="userName" value="${user}"></c:param>

</c:url>

<a href="${headerUrl}">Click here</a>

</table>
<c:set var="num" value="456321.567878"></c:set>
Number after setting type attribute:<br/>
<fmt:setLocale value="en_EU"/>
<fmt:formatNumber value="${num}" type="currency" currencySymbol="$"></fmt:formatNumber>
Number after setting maxIntegerDigit Type Attribute:
<br/>
<fmt:formatNumber value="${num}" type="number" maxIntegerDigits="4"
maxFractionDigits="3"></fmt:formatNumber>
<br>
<fmt:formatNumber value="${num}" type="number" pattern="##,###.##"></fmt:formatNumber><br>
<fmt:parseNumber value="${num}" type="number" integerOnly="true"></fmt:parseNumber><br>
<c:set var="currentDate" value="<%=new java.util.Date() %>"></c:set><br>
today's Date: 
<c:out value="${currentDate}"/><br>
today's date after formatting:
<fmt:formatDate value="${currentDate}" type="date" pattern="yyyy-mm-dd"/>
<c:set var="testString" value="Hi this is a jstl function example"></c:set>
<c:if test="${fn:contains(testString,'Hi')}">
<h3>String JSTL is Found...</h3>
</c:if>
<c:set var="test" value="India"></c:set>
The string starts with "I" :${fn:startsWith(test,'I')}<br>
<c:set var="name" value="This statement is to findout the index of the string"/>
the length of the name is : ${fn:length(name)}<br>
the index of the string is : ${fn:indexOf(name,'to')}<br>
The string ends with "string" : ${fn:endsWith(name,"string")}<br>
the substring of "name" is :${fn:substring(name,5,15)}<br>
<c:set var="name1" value="   This statement is to   findout the index of the string"/>
after triming of the "name" is :${fn:trim(name1)}<br>
the length of the name is : ${fn:length(name1)}<br>



</body>
</html>