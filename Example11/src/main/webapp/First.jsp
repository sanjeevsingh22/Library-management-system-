<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Scriplet Tag</title>
</head>
<body>

<% String name = request.getParameter("uname");
out.print("Name is : "+ name); 


%>


</body>
</html>