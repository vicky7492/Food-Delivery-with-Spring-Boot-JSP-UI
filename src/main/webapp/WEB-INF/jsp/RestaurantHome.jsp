<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>FoodSystem-Restaurant-Home</title>
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
            <a class="navbar-brand" href="RHome">FoodDeliverySystem</a>
          </div>
          <ul class="nav navbar-nav">
            <li class="active"><a href="RHome">Home</a></li>
            <li><a href="#">View FoodItems</a></li>
            <li><a href="#">Update FoodItems</a></li>
            <li><a href="#">Availability</a></li>
            <li><a href="#">History of Orders</a></li>
          </ul>
          <ul class="nav navbar-nav navbar-right">
            <li><a href="loginRestaurant"><span class="glyphicon glyphicon-log-out"></span> Logout</a></li>
          </ul>
        </div>
      </nav>



        <div class="col justify-content-center align-items-center text-center">
          <div class="text-white">
            <h1 class="mb-3" style="margin-top:15%; font-weight: bolder;">Welcome ${list.restaurantName} to Food Delivery System</h1>
            <h4 class="mb-4" style="font-weight: bold;">Eat what you want</h4>
            </div>
            </div>



</body>
</html>