<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <title>Acceuil</title>

  <!-- Google Font: Source Sans Pro -->
  <link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Source+Sans+Pro:300,400,400i,700&display=fallback">
  <!-- Font Awesome -->
  <link rel="stylesheet" href="templates/plugins/fontawesome-free/css/all.min.css">
  <!-- icheck bootstrap -->
  <link rel="stylesheet" href="templates/plugins/icheck-bootstrap/icheck-bootstrap.min.css">
  <!-- Theme style -->
  <link rel="stylesheet" href="templates/dist/css/adminlte.min.css">
</head>
<body class="hold-transition login-page">
<div class="login-box">
  <!-- /.login-logo -->
  <div class="card card-outline card-primary">
    <div class="card-header text-center">
      <a href="templates/index2.html" class="h1"><b>Askanbibank</b></a>
    </div>
    <div class="card-body">
      <p class="login-box-msg">Espace</p>

      <form action="<%= request.getContextPath() %>/templates/"  method="post">
        <div class="input-group mb-3">
          <input type="text" class="form-control" name="username" placeholder="login">
          <div class="input-group-append">
            <div class="input-group-text">
              <span class="fas fa-envelope"></span>
            </div>
          </div>
        </div>
        <div class="input-group mb-3">
          <input type="password" class="form-control" name="password" placeholder="Password" >
          <div class="input-group-append">
            <div class="input-group-text">
              <span class="fas fa-lock"></span>
            </div>
          </div>
        </div>
        <div class="row">
          <div class="col-8">
          <!--
            <div class="icheck-primary">
              <input type="checkbox" id="remember">
              <label for="remember">
                Remember Me
              </label>
            </div>
             -->
             <input type="hidden" name="bouton" value="add">
          </div>
          <!-- Google Font: Source Sans Pro 
          <div class="col-4">
            <button type="submit" class="btn btn-primary btn-block">Sign In</button>
          </div>
          -->
          <!-- /.col -->
          
          
        </div>
      

      <div class="social-auth-links text-center mt-2 mb-3">
        <!-- /<a href="#" class="btn btn-block btn-primary">-->
           <input type="submit" value="valider" class="btn btn-block btn-primary">
        <!-- </a>-->
        
      </div>
      <!-- /.social-auth-links -->
</form>
     
    </div>
    <!-- /.card-body -->
  </div>
  <!-- /.card -->
</div>
<!-- /.login-box -->

<!-- jQuery -->
<script src="templates/plugins/jquery/jquery.min.js"></script>
<!-- Bootstrap 4 -->
<script src="templates/plugins/bootstrap/js/bootstrap.bundle.min.js"></script>
<!-- AdminLTE App -->
<script src="templates/dist/js/adminlte.min.js"></script>
</body>
</html>
