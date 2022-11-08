<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>FoodSystem-Customer-Home</title>
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
            <a class="navbar-brand" href="CHome">FoodDeliverySystem</a>
          </div>
          <ul class="nav navbar-nav">
            <li class="active"><a href="CHome">Customer-Home</a></li>
            <li><a href="#">Account Details</a></li>
            <li><a href="#">Update Details</a></li>
            <li><a href="#">Order Food</a></li>
            <li><a href="#">Orders History</a></li>
          </ul>
          <ul class="nav navbar-nav navbar-right">
            <li><a href="login"><span class="glyphicon glyphicon-log-out"></span> Logout</a></li>
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