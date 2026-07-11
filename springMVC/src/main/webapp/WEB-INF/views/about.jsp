<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>About Page</title>

<style>
*{
    margin:0;
    padding:0;
    box-sizing:border-box;
    font-family:Arial, Helvetica, sans-serif;
}

body{
    background:linear-gradient(135deg,#74ebd5,#ACB6E5);
    height:100vh;
    display:flex;
    justify-content:center;
    align-items:center;
}

.container{
    background:white;
    padding:40px;
    width:450px;
    border-radius:15px;
    text-align:center;
    box-shadow:0 10px 25px rgba(0,0,0,0.2);
}

h1{
    color:#2c3e50;
    margin-bottom:15px;
}

h2{
    color:#555;
    margin-bottom:25px;
    font-weight:normal;
}

p{
    color:#666;
    font-size:17px;
    line-height:1.6;
}

a{
    display:inline-block;
    margin-top:25px;
    text-decoration:none;
    background:#3498db;
    color:white;
    padding:10px 22px;
    border-radius:8px;
    transition:0.3s;
}

a:hover{
    background:#2980b9;
}
</style>

</head>

<body>

<div class="container">
    <h1>📖 About Page</h1>
    <h2>Called by About Controller</h2>

    <p>
        This page is rendered using <strong>Spring MVC</strong>.
        It demonstrates navigation from the controller to a JSP view.
    </p>

    <a href="/springMVC/">🏠 Back to Home</a>
</div>

</body>
</html>