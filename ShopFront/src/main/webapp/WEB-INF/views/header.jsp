<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="en">
<head>
  <title>Bootstrap Case</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<style>
  .carousel-inner > .item > img,
  .carousel-inner > .item > a > img {
      width: 70%;
      margin: auto;
      .search-form .form-group {
  
  
  </style>
</head>
<style>
body  {
    background-image: url("");
    background-color:#d3caad;
}
</style>
<body>

<nav class="navbar navbar-inverse">
  <div class="container-fluid">
    <div class="navbar-header">
      <a class="navbar-brand" href="#">SAM'S TELEVISION</a>
    </div>
        <ul class="nav navbar-nav">
      <li><a href="home"><span class="glyphicon glyphicon-home"></span> Home</a></li>
      <li><a href="aboutus">About Us</a></li>
      <li><a href="contactus">Contact Us</a></li>
     
        <li class="dropdown"><a data-target="#" href="page.html" data-toggle="dropdown" class="dropdown-toggle">Products <b class="caret"></b></a>
        <ul class="dropdown-menu">
            <li><a href="4k">4K ULTRA</a></li>
            <li><a href="3d">3D</a></li>
            <li><a href="led">LED</a></li>
                 </ul>
              </li>
        </ul>     
                   
        <ul class="nav navbar-nav navbar-right">
    <c:if test="${empty SuccessMessage}">
      <li><a href="register">Signup <span class="glyphicon glyphicon-user"></span></a></li>
      <li><a href="login">Login <span class="glyphicon glyphicon-log-in"></span></a></li>
      </c:if>
      <c:if test="${not empty SuccessMessage}">
       <li><a href="#">My Cart<span class="glyphicon glyphicon-shopping-cart"></span></a></li>
       <li><a href="login">Log out<span class="glyphicon glyphicon-log-out"></span></a></li>
       </c:if>
       </ul>
         </div>
         </nav>
 

</body>
</html>



