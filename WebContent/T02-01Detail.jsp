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
				<td><img border="3" width="500" height="500"
					src="img/<c:out value="${post.pass}" />" /></td>
			</tr>
			<tr>
				<td>タイトル:<c:out value="${post.postname}" />
				</td>
			</tr>
		</table>
		<form action="" method="post">
			<p>
				コメント：<input type="text" name="coment" size="50" maxlength="100">
				<input type="submit" value="送信する">
			</p>
			<p>
				<input type="button" onclick="location.href='T02-01Detail.jsp'"
					value="更新">
			</p>
			<c:if test="${not empty errorMsg}">
			<p>${errorMsg}</p>
			</c:if>
			<c:forEach var="coment" items="${comentList}">
				<p>
				-----------------------------------------------------------------------------------------------------------------------------
					<c:out value="${coment.userid}"></c:out>
					<c:out value="coment.text"></c:out>
				</p>
			</c:forEach>
		</form>
	</div>
</body>
</html>