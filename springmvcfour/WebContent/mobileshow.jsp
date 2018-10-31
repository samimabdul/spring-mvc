<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="a" uri="http://java.sun.com/jsp/jstl/core"  %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<table>
<tr>

<th>Mobile Id</th>
<th>Mobile Name</th>
<th>Mobile Price</th>
<th>Mobile Category</th>
<th>Mobile Online</th>


</tr>
<a:forEach var="mob" items="${data}">
<!-- use to store data using key value data and variable mob  -->
<tr>
<td>${mob.mobId}  </td>
<td>${mob.mobName}  </td>
<td>${mob.mobPrice}  </td>
<td>${mob.mobCategory} </td>
<td>${mob.mobOnline}  </td>
<td><a href="parchase?mobname=${mob.mobName}">Parchase</a></td>
</tr>
</a:forEach>

</table>







</body>
</html>