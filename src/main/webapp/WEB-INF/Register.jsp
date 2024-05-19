<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<html>

<head>
<style>
body {
	font-family: 'Arial', sans-serif;
	background-color: #f4f4f4;
	text-align: left;
	margin-top: 10px;
}

h2 {
	color: #333;
}

form {
	max-width: 400px;
	margin: 0 auto;
	background-color: #fff;
	padding: 20px;
	border-radius: 5px;
	box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
}

label {
	display: block;
	margin: 10px 0 5px;
	color: #555;
}

input {
	width: 100%;
	padding: 8px;
	margin-bottom: 15px;
	box-sizing: border-box;
	border: 1px solid #ccc;
	border-radius: 4px;
}

input[type="submit"] {
    background-color: #1877f2; /* Facebook blue */
    color: white;
    cursor: pointer;
}

input[type="submit"]:hover {
    background-color: #166fe5; /* Darker shade on hover */
}

</style>
</head>

<body>
<div style="text-align:center;">
<h2>Registration Form </h2>
</div>
	
	<form:form action="save" method="post" modelAttribute="users">
	
	    <label for="email">Email</label>
		<form:input path="email" id="email" />
		
		 <form:errors path = "email" id="email"/> 
		<br>
	
		<label for="userName">User Name</label>
		  <form:input path="userName" id="userName" />
		  
		<form:errors path = "userName" id="userName"/> 
		<br>
		
		<label for="mobileNo">Mobile No</label>
		<form:input path="mobileNo" id="mobileNo" />
		
		<form:errors path = "mobileNo" id="mobileNo"/> 
		<br>
		
		<label for="passWord">Password</label>
		<form:input path="passWord" id="passWord" type="password" />
		
		<form:errors path = "passWord" id="passWord"/> 
		<br>
		
		<label for="address">Address</label>
		<form:input path="address" id="address" />
		
		 <form:errors path="address" id="address" /> 
		<br>
		

		<input type="submit" value="Register">
	</form:form>
</body>

</html>
