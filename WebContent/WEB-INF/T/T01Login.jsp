<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>学生ログイン</title>
<link rel="stylesheet" href="bootstrap-3.3.7/css/bootstrap.css">
<link rel="stylesheet" href="css/style.css">

</head>
<body>
<div id="main">
<form action="/T01Login" method="POST">
			<h1>ログイン</h1>
			<div id="mid">
				<table>
					<tr>
						<td><span style="color: black"
							class="glyphicon glyphicon-user"></span></td>
						<td><input type="text" name="studentid"></td>
					</tr>
					<tr>
						<td><span style="color: black"
							class="glyphicon glyphicon-asterisk"></span></td>
						<td><input type="password" name="passwd"></td>
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


