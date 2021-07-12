<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <title>Designer un admin</title>

  <!-- Google Font: Source Sans Pro -->
  <link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Source+Sans+Pro:300,400,400i,700&display=fallback">
  <!-- Font Awesome -->
  <link rel="stylesheet" href="../plugins/fontawesome-free/css/all.min.css">
  <!-- icheck bootstrap -->
  <link rel="stylesheet" href="../plugins/icheck-bootstrap/icheck-bootstrap.min.css">
  <!-- Theme style -->
  <link rel="stylesheet" href="../dist/css/adminlte.min.css">
</head>
<body class="hold-transition login-page">
<div class="login-box">
  <!-- /.login-logo -->
  <div class="card card-outline card-primary">
    <div class="card-header text-center">
      <a href="" class="h1"><b>Askanbibank</b></a>
    </div>
    <div class="card-body">
      <p class="login-box-msg">Designer un administrateur</p>

      <form action="<%=request.getContextPath() %>/templates/viewSiege/"  method="post">
        
                 <div class="form-group">
					<select class="custom-select" name="idagence">
					<c:forEach items="${modelagence.agences}" var="c">
					  <option value="${c.idagence}">${c.nomagence}</option> 
				    </c:forEach>
					</select>
				    </div>
				   
          <!-- Google Font: Source Sans Pro 
          <div class="col-4">
            <button type="submit" class="btn btn-primary btn-block">Sign In</button>
          </div>
          -->
          <!-- /.col -->
          
          
     
      

      <div class="social-auth-links text-center mt-2 mb-3">
        <!-- /<a href="#" class="btn btn-block btn-primary">-->
           <button type="submit" class="btn btn-primary" value="designer" name="action">Valider </button>
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
<script src="../plugins/jquery/jquery.min.js"></script>
<!-- Bootstrap 4 -->
<script src="../plugins/bootstrap/js/bootstrap.bundle.min.js"></script>
<!-- AdminLTE App -->
<script src="../dist/js/adminlte.min.js"></script>
</body>
</html>
