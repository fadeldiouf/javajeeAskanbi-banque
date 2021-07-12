<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="java.io.*,java.util.*" %>
<%@ page import="javax.servlet.*,java.text.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Fature Depot</title>
<link rel="stylesheet" href="NewFile.css">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
</head>
<body>
<div class="A4" >
   
     <p class="text-white bg-info p-3 rounded-circle mt-4">  
     <span class="offset-5">OPERATION DE CAISSE </span></p>
<!-- <p class="bg-light border   p-2">.border</p>
<p class="bg-light border   p-2">.border</p> -->
<%
  Date dNow = new Date( );
  SimpleDateFormat ft = 
  new SimpleDateFormat ("dd-MM-yyyy ");
  SimpleDateFormat ft1 = 
		   new SimpleDateFormat (" HH:mm:ss");
  
%>
<% HttpSession facsession = request.getSession(); %>
        
<p><span class="offset-2"> Type D'operation: &nbsp; &#160; Depot</span></p>
<p> <span class="offset-2">Numero de Compte:&nbsp; &#160;<%= facsession.getAttribute("num_compte") %></span></p>
<p><span class="offset-2"> Date:&nbsp; &#160;<% out.print(  ft.format(dNow) ); %></span></p>
<p><span class="offset-2"> Heure:&nbsp; &#160;<% out.print(  ft1.format(dNow) ); %></span></p>
<p><span class="offset-2"> Agence:&nbsp; &#160;<%= facsession.getAttribute("agence") %></span></p>
<p><span class="offset-2"> Responsable de l'operation:&nbsp; &#160;<%= facsession.getAttribute("prenom") %> <%= facsession.getAttribute("nom") %></span></p>
<p><span class="offset-2"> Montant:&nbsp; &#160;<%= facsession.getAttribute("credit") %></span></p>
<p><span class="offset-2"> Titulaire du compte:&nbsp; &#160;<%= facsession.getAttribute("prenomCl2") %> <%= facsession.getAttribute("nomCl2") %></span></p>
<div class="row ml-4">
<div class="col-md-6">
<div class="card" style="width: 18rem; height: 7rem;">
 <div class="card-body">
   <h5 class="card-title">Signature de L'agent</h5>
   <h6 class="card-subtitle mb-2 text-muted"></h6>
   <p class="card-text"></p>
 </div>
</div>
</div>
<div class="col-md-6">
<div class="card" style="width: 18rem; height: 7rem;">
 <div class="card-body">
   <h5 class="card-title">Signature du Titulaire</h5>
   <h6 class="card-subtitle mb-2 text-muted"></h6>
   <p class="card-text"></p>
 </div>
</div>
</div>
</div>
<div class="row mt-2">
 <span class="offset-10">
 <input type="button"  class="btn btn-info" value="Imprimer" onClick="window.print()">
</span>
</div>

</body>
<script type="text/javascript">
var max_pages = 100;
var page_count = 0;

function snipMe() {
 page_count++;
 if (page_count > max_pages) {
   return;
 }
 var long = $(this)[0].scrollHeight - Math.ceil($(this).innerHeight());
 var children = $(this).children().toArray();
 var removed = [];
 while (long > 0 && children.length > 0) {
   var child = children.pop();
   $(child).detach();
   removed.unshift(child);
   long = $(this)[0].scrollHeight - Math.ceil($(this).innerHeight());
 }
 if (removed.length > 0) {
   var a4 = $('<div class="A4"></div>');
   a4.append(removed);
   $(this).after(a4);
   snipMe.call(a4[0]);
 }
}

$(document).ready(function() {
 $('.A4').each(function() {
   snipMe.call(this);
 });
});

</script>


</html>
