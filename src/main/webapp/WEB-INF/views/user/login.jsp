<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
  <body class="login-page">
    <div class="login-box">
      <div class="login-logo">
        <b>Sujin</b>Project
      </div><!-- /.login-logo -->
      <div class="login-box-body">
        <p class="login-box-msg">Sign in to start your session</p>

<form action="/user/loginPost" method="post">
  <div class="form-group has-feedback">
    <input type="text" name="uid" class="form-control" placeholder="USER ID"/>
    <span class="glyphicon glyphicon-envelope form-control-feedback"></span>
  </div>
  <div class="form-group has-feedback">
    <input type="password" name="pw" class="form-control" placeholder="Password"/>
    <span class="glyphicon glyphicon-lock form-control-feedback"></span>
  </div>
  <div class="row">
    <div class="col-xs-8">    
      <div class="checkbox icheck">
        <label>
          <input type="checkbox" name="useCookie"> Remember Me
        </label>
      </div>                        
    </div><!-- /.col -->
    <div class="col-xs-4">
      <button type="submit" class="btn btn-primary btn-block btn-flat">Sign In</button>
    </div><!-- /.col -->
  </div>
</form>


        <a href="#">I forgot my password</a><br>
        <a href="register.html" class="text-center">Register a new membership</a>

      </div><!-- /.login-box-body -->
    </div><!-- /.login-box -->

<!--     jQuery 2.1.4
    <script src="/resources/plugins/jQuery/jQuery-2.1.4.min.js"></script>
    Bootstrap 3.3.2 JS
    <script src="/resources/bootstrap/js/bootstrap.min.js" type="text/javascript"></script>
    iCheck
    <script src="/resources/plugins/iCheck/icheck.min.js" type="text/javascript"></script> -->
    <script>
      $(function () {
        $('input').iCheck({
          checkboxClass: 'icheckbox_square-blue',
          radioClass: 'iradio_square-blue',
          increaseArea: '20%' // optional
        });
      });
    </script>
</body>
</html>