<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Home Page</title>

<style>
*{
    margin:0;
    padding:0;
    box-sizing:border-box;
    font-family:Arial, Helvetica, sans-serif;
}

body{
    background:linear-gradient(135deg,#4facfe,#00f2fe);
    height:100vh;
    display:flex;
    justify-content:center;
    align-items:center;
}

.container{
    width:500px;
    background:#fff;
    padding:40px;
    border-radius:15px;
    text-align:center;
    box-shadow:0 10px 25px rgba(0,0,0,0.2);
}

h1{
    color:#2c3e50;
    margin-bottom:15px;
}

h2{
    color:#666;
    margin-bottom:30px;
    font-weight:normal;
}

.btn{
    display:inline-block;
    margin:10px;
    padding:12px 25px;
    text-decoration:none;
    color:#fff;
    background:#007bff;
    border-radius:8px;
    transition:0.3s;
}

.btn:hover{
    background:#0056b3;
}
</style>

</head>
<body>

<div class="container">
    <h1>🏠 Home Page</h1>
    <h2>Called by Home Controller</h2>

    <a href="/springMVC/about" class="btn">
        About
    </a>

    <a href="/springMVC/help" class="btn">
        Help
    </a>

    <br><br>

    <form action="/springMVC/search" method="get">
        <input type="text"
               name="searchText"
               placeholder="Search Product..."
               style="padding:10px;width:250px;border:1px solid #ccc;border-radius:6px;">

        <input type="submit"
               value="Search"
               style="padding:10px 20px;background:#28a745;color:white;border:none;border-radius:6px;cursor:pointer;">
    </form>

</div>

</body>
</html>