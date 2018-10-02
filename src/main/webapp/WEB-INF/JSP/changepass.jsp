<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<html >
<head>
  <meta charset="UTF-8">
  <title>ChangePass</title>
      <meta name="viewport" content="width=device-width, initial-scale=1">
      <link rel="stylesheet" href="css/stylelogin.css">
      <script src="js/notification.js"></script>

</head>

<body>
  <div id="login-box">
  <div class="left">
    <h1>Đổi Pass</h1>
    <form method="post" action="changepass" onsubmit="checkpass()">
    <input type="text" name="email" placeholder="E-mail" />
    <input type="password" name="password" placeholder="Password" />
    <input type="password" name="password2" placeholder="Retype password" />
    <input type="submit" name="SignUp" value="Đổi Pass" />
    </form>
  </div>
  
  <div class="right">
    <span class="loginwith"></span>
    <button class="social-signin facebook"  onclick="thongbao();">Log in with facebook</button>
    <button class="social-signin twitter" onclick="thongbao();">Log in with Twitter</button>
    <button class="social-signin google" onclick="thongbao();">Log in with Google+</button>
  </div>
  <div class="or">OR</div>
</div>
  
  
</body>
</html>
