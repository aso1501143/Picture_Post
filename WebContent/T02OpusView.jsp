<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>作品閲覧</title>
</head>
<body>

作品閲覧・投票<br><br>




作品タイトル<br>


		<form action="Category" method="post">
			<table>
					<c:if test="${status.first}">
						<tr>
					</c:if>
					<td>
						<div style="text-align: center;">
							<p>
								<input type="image" src="img/${data.picture}"
		width="100" height="100" alt="画像" name = "categoryid" value="${data.categoryid}">
							</p>
							<p><c:out value="${data.categoryname}" /></p>
						</div>
					</td>
						</tr>

</table></form>
<input type="submit" value ="投票">


作品タイトル<br>

<input type="submit" value ="投票"><br>



作品タイトル<br>

<input type="submit" value ="投票"><br>


作品タイトル<br>

<input type="submit" value ="投票"><br>


</body>
</html>