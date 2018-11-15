<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home Page</title>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
<style>
* {
	box-sizing: border-box;
}

body {
	/* margin: 0; */
	font-family: Arial, Helvetica, sans-serif;
}

.topnav {
	overflow: hidden;
	background-color: #e9e9e9;
}

.topnav a {
	float: left;
	display: block;
	color: black;
	text-align: center;
	padding: 14px 16px;
	text-decoration: none;
	font-size: 17px;
}

.topnav a:hover {
	background-color: #ddd;
	color: black;
}

.topnav a.active {
	background-color: #2196F3;
	color: white;
}

.topnav .search-container {
	float: center;
}

.topnav input[type=text] {
	padding: 6px;
	margin-top: 8px;
	margin-right: 300px;
	font-size: 17px;
	border: none;
}

.topnav .search-container button {
	float: center;
	padding: 6px 10px;
	margin-top: 8px;
	margin-right: 16px;
	background: #ddd;
	font-size: 17px;
	border: none;
	cursor: pointer;
}

.topnav .search-container button:hover {
	background: #ccc;
}

footer {
	background-color: #777;
	padding: 7px;
	text-align: center;
	color: white;
}

@media screen and (max-width: 600px) {
	.topnav .search-container {
		float: none;
	}
	.topnav a, .topnav input[type=text], .topnav .search-container button {
		float: none;
		display: block;
		text-align: left;
		width: 100%;
		margin: 0;
		padding: 14px;
	}
	.topnav input[type=text] {
		border: 1px solid #ccc;
	}
}
</style>
</head>
<body>
	<header>
		<marquee>
			<h1>Shopping App</h1>
		</marquee>
	</header>
	<div class="topnav">
		<a class="active" href="#home">Home</a> <a href="about.jsp">About</a>
		<a href="contact.jsp">Contact</a>
		<div class="search-container">
			<form action="">
				<input type="text" placeholder="Search Something Here..."
					name="search">
				<button type="submit">
					<i class="fa fa-search"></i>
				</button>
			</form>
		</div>
	</div>
	<div style="padding-left: 16px"></div>
	<br>
	<div>Images</div>
	<img src="m1.jpg" width="180" height="180" hspace="15">
	<img src="m2.jpg" width="180" height="180" hspace="15">
	<img src="m3.jpg" width="180" height="180" hspace="15">
	<img src="m4.jpg" width="180" height="180" hspace="15">
	<img src="D://Images/m5.jpg" width="180" height="180" hspace="15">
	<img src="D:\\Images\m6.jpg" width="180" height="180" hspace="15">
	<br>
	<br>
	<img src="/Images/m7.jpg" width="180" height="180" hspace="15">
	<img src="D:\Images\m8.jpg" width="180" height="180" hspace="15">
	<img src="D:\\Images\\m9.jpg" width="180" height="180" hspace="15">
	<img src="D:/Images/m10.jpg" width="180" height="180" hspace="15">
	<img src="m11.jpg" width="180" height="180" hspace="15">
	<img src="m12.jpg" width="180" height="180" hspace="15">
	</div>
	<br>
</body>

<footer>
	<p>
	<h2>Shopping App : Team Sankya Group
		&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
		&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
		&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; Email:
		helpdesk@shoppingapp.com</h2>
	</p>
</footer>
</html>