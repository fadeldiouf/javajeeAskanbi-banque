<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <title>Verification</title>

  <!-- Google Font: Source Sans Pro -->
  <link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Source+Sans+Pro:300,400,400i,700&display=fallback">
  <!-- Font Awesome -->
  <link rel="stylesheet" href="../../plugins/fontawesome-free/css/all.min.css">
  <!-- icheck bootstrap -->
  <link rel="stylesheet" href="../../plugins/icheck-bootstrap/icheck-bootstrap.min.css">
  <!-- Theme style -->
  <link rel="stylesheet" href="../../dist/css/adminlte.min.css">
</head>
<body class="hold-transition login-page">
<div class="login-box">
  <!-- /.login-logo -->
  <div class="card card-outline card-primary">
    <div class="card-header text-center">
      <a href="templates/index2.html" class="h1"><b>Askanbibank</b></a>
    </div>
    <div class="card-body">
      <p class="login-box-msg">Faire un retrait</p>
      <% HttpSession sess = request.getSession(); %>

      <form action="<%= request.getContextPath() %>/templates/viewClient/operation/"  method="post">
        <div class="input-group mb-3">
          <input type="text" class="form-control"  value="<%= sess.getAttribute("nom") %>" readonly>
          
        </div>
        <div class="input-group mb-3">
          <input type="text" class="form-control"   value="<%= sess.getAttribute("prenom") %>" readonly>
          
        </div>
        <div class="input-group mb-3">
          <input type="text" class="form-control" name="balance"  value="<%= sess.getAttribute("solde") %>" readonly>
          
        </div>
        <div class="input-group mb-3">
          <input type="text" class="form-control" name="num_compte" value="<%= sess.getAttribute("num_compte") %>" readonly>
          
        </div>
        <div class="input-group mb-3">
          <input type="text" class="form-control" name="debite" placeholder="montant debite">
          
        </div>
          <!--
            <div class="icheck-primary">
              <input type="checkbox" id="remember">
              <label for="remember">
                Remember Me
              </label>
            </div>
             -->
             
          <!-- Google Font: Source Sans Pro 
          <div class="col-4">
            <button type="submit" class="btn btn-primary btn-block">Sign In</button>
          </div>
          -->
          <!-- /.col -->
          
          
      

      <div class="social-auth-links text-center mt-2 mb-3">
        <!-- /<a href="#" class="btn btn-block btn-primary">-->
           <button type="submit" class="btn btn-primary" value="retrait" name="verify">Valider op </button>
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
<script src="../../plugins/jquery/jquery.min.js"></script>
<!-- Bootstrap 4 -->
<script src="../../plugins/bootstrap/js/bootstrap.bundle.min.js"></script>
<!-- AdminLTE App -->
<script src="../../dist/js/adminlte.min.js"></script>
</body>
</html>
