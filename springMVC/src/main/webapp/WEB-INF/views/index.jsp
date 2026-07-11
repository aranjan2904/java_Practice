<%@ page import="java.util.*"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Index Page</title>

<style>

*{
    margin:0;
    padding:0;
    box-sizing:border-box;
    font-family:Arial, Helvetica, sans-serif;
}

body{
    background:linear-gradient(135deg,#667eea,#764ba2);
    min-height:100vh;
    display:flex;
    justify-content:center;
    align-items:center;
}

.container{
    width:700px;
    background:#fff;
    padding:35px;
    border-radius:15px;
    box-shadow:0 15px 30px rgba(0,0,0,.2);
}

h1{
    color:#2c3e50;
    margin-bottom:8px;
}

h2{
    color:#666;
    margin-bottom:25px;
}

.card{
    background:#f8f9fa;
    padding:15px;
    margin:15px 0;
    border-left:5px solid #007bff;
    border-radius:8px;
}

.card strong{
    color:#007bff;
}

ul{
    list-style:none;
    margin-top:10px;
}

ul li{
    background:#e9ecef;
    margin:8px 0;
    padding:10px;
    border-radius:6px;
}

.search-box{
    margin-top:30px;
    text-align:center;
}

.search-box input[type=text]{
    width:70%;
    padding:12px;
    border:1px solid #ccc;
    border-radius:8px;
    font-size:16px;
}

.search-box input[type=submit]{
    padding:12px 25px;
    background:#28a745;
    color:white;
    border:none;
    border-radius:8px;
    cursor:pointer;
    font-size:16px;
    margin-left:10px;
}

.search-box input[type=submit]:hover{
    background:#218838;
}

.menu{
    margin-bottom:25px;
}

.menu a{
    text-decoration:none;
    background:#007bff;
    color:white;
    padding:10px 18px;
    border-radius:8px;
    margin-right:10px;
}

.menu a:hover{
    background:#0056b3;
}

</style>

</head>

<body>

<%
String name = (String) request.getAttribute("name");
Integer id = (Integer) request.getAttribute("id");
ArrayList<String> friends =
        (ArrayList<String>) request.getAttribute("friends");
%>

<div class="container">

    <h1>🏠 Welcome to Spring MVC</h1>
    <h2>Called by Index Controller</h2>

    <div class="menu">
        <a href="/springMVC/about">About</a>
        <a href="/springMVC/home">Home</a>
        <a href="/springMVC/help">Help</a>
    </div>

    <div class="card">
        <p><strong>Name :</strong> <%= name %></p>
    </div>

    <div class="card">
        <p><strong>ID :</strong> <%= id %></p>
    </div>

    <div class="card">
        <h3>👥 Friends List</h3>

        <ul>
        <%
        for(String s : friends){
        %>

            <li><%= s %></li>

        <%
        }
        %>
        </ul>
    </div>

    <div class="search-box">

        <form action="search" method="get">

            <input
                type="text"
                name="searchText"
                placeholder="Search Product...">

            <input
                type="submit"
                value="Search">

        </form>

    </div>

</div>

</body>
</html>