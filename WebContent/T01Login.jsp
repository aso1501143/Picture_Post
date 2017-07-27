<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>学生ログイン</title>
</head>
<body>
<div id="main">
<br>
	<form method="post" action="T01StudentsLogin">

		<h1>学生ログイン</h1>
			<!--<div id="mid">-->
				<table>
			<tr>
				<th>・ユーザー名</th>
				<td><input type="text" name="userid"></td>
			</tr>

			<tr>
				<th>・パスワード</th>
				<td><input type="password" name="password"></td>
			</tr>
		</table>


		<button type="submit" class="btn btn-primary">
					<span class="glyphicon glyphicon-arrow-down"></span>ログイン
				</button>
		<button type="button" class="btn btn-primary">
					<span class="glyphicon glyphicon-trash"></span>キャンセル
				</button>

			</div>
		
		</form>
     </div>

</body>
</html>


