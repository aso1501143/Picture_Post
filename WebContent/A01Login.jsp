<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>管理者ログイン</title>
<link rel="stylesheet" href="bootstrap-3.3.7/css/bootstrap.css">
<link rel="stylesheet" href="css/Logtemp.css">
<body>
</head>


<div id="main">
<br>

	<form method="post" action=	"A01ManagerLogin">

<body>
<div class="login">
  <div class="heading">
    <h2>管理者用ログイン</h2>
    <form method="post" action=	"A01ManagerLogin">
branch 'master' of https://github.com/aso1501143/Picture_Post.git

      <div class="input-group input-group-lg">
        <span class="input-group-addon"><i class="fa fa-user"></i></span>
        <input type="text" class="form-control" name="adminid" placeholder="ユーザー名">
          </div>

        <div class="input-group input-group-lg">
          <span class="input-group-addon"><i class="fa fa-lock"></i></span>
          <input type="password" name="password" class="form-control" placeholder="パスワード">
        </div>

        <button type="submit" class="float">Login</button>
       </form>
 		</div>
 </div>

</body>
</html>