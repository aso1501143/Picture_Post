<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/jsp/common.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>作品詳細</title>
</head>
<body>
	<div style="text-align: center;">
		<table align="center">
			<tr>
				<td><img border="3" width="500" height="500" src="img/c.png" /></td>
			</tr>
			<tr>
				<td>タイトル:</td>
			</tr>
		</table>
		<form action="/PicturePost/T03Detail" method="post">
			<p>
				コメント<br>
				<textarea name="comments" rows="4" cols="40"></textarea>
				<br> <input type="submit" value="送信する"><input
					type="reset" value="リセット">
			</p>
			<p>
				<input type="button" onclick="location.href='T02-01Detail.jsp'"
					value="更新">
			</p>
			<p>
				<input type="button" onclick="location.href='T02OpusView.jsp'"
					value="戻る">
			</p>
		</form>
		<c:forEach var="obj" items="${comments}">
			<p>
			コメント
			____________________________________________________________________________________________________________
			<c:out value="${obj.comments}" />
			</p>
		</c:forEach>
	</div>
</body>
</html>