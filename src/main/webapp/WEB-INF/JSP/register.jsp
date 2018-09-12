<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<html >
<head>
  <meta charset="UTF-8">
  <title>Đăng Kí</title>
      <meta name="viewport" content="width=device-width, initial-scale=1">
      <link rel="stylesheet" href="css/stylelogin.css">
      <script src="js/notification.js"></script>

</head>

<body>
  <div id="login-box">
  <div class="left">
    <h1>Đăng Kí</h1>
    
    <input type="text" name="username" placeholder="Username" />
    <input type="text" name="email" placeholder="E-mail" />
    <input type="password" name="password" placeholder="Password" />
    <input type="password" name="password2" placeholder="Retype password" />
    <input type="submit" name="SignUp" value="Đăng Kí" />
      <a href="login"><button class="btnregister">Đăng nhập</button></a>
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
