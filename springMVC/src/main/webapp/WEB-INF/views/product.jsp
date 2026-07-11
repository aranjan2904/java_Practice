<%@ page language="java" contentType="text/html;charset=UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>iPhone Product</title>

<style>

*{
    margin:0;
    padding:0;
    box-sizing:border-box;
    font-family:Arial, Helvetica, sans-serif;
}

body{
    background:linear-gradient(135deg,#141E30,#243B55);
    min-height:100vh;
    display:flex;
    justify-content:center;
    align-items:center;
}

.container{
    width:450px;
    background:#fff;
    border-radius:15px;
    box-shadow:0 15px 30px rgba(0,0,0,.3);
    overflow:hidden;
    text-align:center;
}

.header{
    background:#000;
    color:#fff;
    padding:20px;
}

.header h1{
    font-size:32px;
}

.content{
    padding:30px;
}

.price{
    font-size:28px;
    color:#28a745;
    font-weight:bold;
    margin:20px 0;
}

.features{
    text-align:left;
    margin:20px 0;
}

.features li{
    margin:10px 0;
    list-style:none;
    padding-left:25px;
    position:relative;
}

.features li::before{
    content:"✔";
    color:#28a745;
    position:absolute;
    left:0;
}

.btn{
    display:inline-block;
    margin-top:20px;
    padding:12px 25px;
    background:#007bff;
    color:#fff;
    text-decoration:none;
    border-radius:8px;
    transition:.3s;
}

.btn:hover{
    background:#0056b3;
}

</style>

</head>

<body>

<div class="container">

    <div class="header">
        <h1>📱 Apple iPhone</h1>
    </div>

    <div class="content">

        <h2>iPhone 16 Pro</h2>

        <p class="price">₹1,19,900</p>

        <ul class="features">
            <li>6.3-inch Super Retina XDR Display</li>
            <li>A18 Pro Chip</li>
            <li>48 MP Triple Camera System</li>
            <li>128 GB Storage</li>
            <li>Face ID & 5G Support</li>
        </ul>

        <a href="/springMVC/" class="btn">
            🏠 Back to Home
        </a>

    </div>

</div>

</body>
</html>