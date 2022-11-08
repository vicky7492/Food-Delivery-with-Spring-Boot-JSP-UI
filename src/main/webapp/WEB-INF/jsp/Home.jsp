<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>FoodSystem-Home</title>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
    <style>
        body{background-color: white;
        }
    </style>
</head>
<body>

    <nav class="navbar navbar-inverse" style="padding-top: 5px;font-size: 16px;">
        <div class="container-fluid">
          <div class="navbar-header">
            <a class="navbar-brand" href="">FoodDeliverySystem</a>
          </div>
          <ul class="nav navbar-nav">
            <li class="active"><a href="">Home</a></li>
            <li><a href="login"><span class="glyphicon glyphicon-log-in"></span>Login-Customer</a></li>
            <li><a href="register"><span class="glyphicon glyphicon-log-in"></span>Register-Customer</a></li>
            <li><a href="/loginRestaurant"><span class="glyphicon glyphicon-log-in"></span>Login-Restaurant</a></li>
            <li><a href="/registerRestaurant"><span class="glyphicon glyphicon-log-in"></span>Register-Restaurant</a></li>
          </ul>
        </div>
      </nav>



        <div class="col justify-content-center align-items-center text-center">
          <div class="text-white">
            <h1 class="mb-3" style="margin-top:15%; font-weight: bolder;">Welcome ${list.customerName} to Food Delivery System</h1>
            <h4 class="mb-4" style="font-weight: bold;">Eat what you want</h4>
            </div>
            </div>



</body>
</html>