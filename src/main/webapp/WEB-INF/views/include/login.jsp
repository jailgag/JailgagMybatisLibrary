<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>BOOKLIBRARY-로그인</title>
</head>
<body>
	<fieldset>
		<legend>로그인</legend>
		<form action="/customer/login" method="post">
			ID: <input type="text" name="Id"><br>
			PW: <input type="password" name="Pw"><br>
			<input type="submit" value="로그인">
		</form>
	</fieldset>
</body>
</html>