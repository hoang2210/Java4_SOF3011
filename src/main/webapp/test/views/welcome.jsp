<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form method="GET"
		action="/SP22B2_SOF3011_IT16301/HelloServlet" >
		<label>Họ tên: </label>
		<input type="text" name="ho_ten" />
		<button>Gửi</button>
	</form>
	<h3>Hello ${ name }</h3>
</body>
</html>
