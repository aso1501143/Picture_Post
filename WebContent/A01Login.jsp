<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>管理者ログイン</title>
</head>
<body>

<br>
	<form action="/T01Login" method="POST">
		<table>
			<tr>
				<th>・ユーザー名</th>
				<td><input type="text" name="name"></td>
			</tr>

			<tr>
				<th>・パスワード</th>
				<td><input type="password" name="pass"></td>
			</tr>
		</table>

	<li><input type="submit" value="ログイン"></li>
		<input type="reset" value="リセット">
	</form>




</body>
</html>