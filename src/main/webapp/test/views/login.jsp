<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>IT16301</title>
</head>
<body>
	<form method="POST"
		action="/SP22B2_SOF3011_IT16301/login">
		<div>
			<label>Email</label>
			<input type="email" name="email" />
		</div>
		<div>
			<label>Password</label>
			<input type="password" name="password" />
		</div>
		
		<button class="btn btn-primary"
	href="/SP22B2_SOF3011_IT16301/admin/users/index">Đăng nhập</button>
	</form>
</body>
</html>