<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Help Page</title>

<style>
*{
    margin:0;
    padding:0;
    box-sizing:border-box;
    font-family:Arial, Helvetica, sans-serif;
}

body{
    background:linear-gradient(135deg,#667eea,#764ba2);
    height:100vh;
    display:flex;
    justify-content:center;
    align-items:center;
}

.card{
    background:#fff;
    width:420px;
    padding:35px;
    border-radius:15px;
    box-shadow:0 10px 25px rgba(0,0,0,0.25);
    text-align:center;
}

h1{
    color:#2c3e50;
    margin-bottom:10px;
}

.subtitle{
    color:#777;
    margin-bottom:30px;
    font-size:18px;
}

.info{
    background:#f4f4f4;
    padding:15px;
    border-radius:10px;
    margin:15px 0;
    text-align:left;
}

.label{
    font-weight:bold;
    color:#444;
}

.value{
    color:#007bff;
    font-size:18px;
}

.btn{
    display:inline-block;
    margin-top:20px;
    text-decoration:none;
    background:#007bff;
    color:white;
    padding:10px 25px;
    border-radius:8px;
    transition:0.3s;
}

.btn:hover{
    background:#0056b3;
}
</style>

</head>
<body>

<%
    String name = (String) request.getAttribute("name");
    Integer roll = (Integer) request.getAttribute("rollNumber");
%>

<div class="card">

    <h1>🆘 Help Page</h1>
    <p class="subtitle">Data received from Spring MVC Controller</p>

    <div class="info">
        <span class="label">Name :</span><br>
        <span class="value"><%= name %></span>
    </div>

    <div class="info">
        <span class="label">Roll Number :</span><br>
        <span class="value"><%= roll %></span>
    </div>

    <a href="/springMVC/" class="btn">
        🏠 Back to Home
    </a>

</div>

</body>
</html>