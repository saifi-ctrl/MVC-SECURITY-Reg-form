<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"%>
<!DOCTYPE html>
<html>

<head>
    <title>Success page Display</title>
    <style>
        body {
            font-family: 'Arial', sans-serif;
            background-color: #e6f7ff;
            text-align: center;
            margin-top: 50px;
        }

        h1 {
            color: #4caf50;
        }
    </style>
</head>

<body>
   

<form:form modelAttribute="users">


		<label>EMAIL_ID</label>
		<form:input path="email" value="${user.email }" />
		<br>
		<label>USER_NAME</label>
		<form:input path="userName" value="${user.userName }" />
		<br>
		<label>MOBILE_NUMBER</label>
		<form:input path="mobileNo" value="${user.mobileNo }" />
		<br>
		<label>PASSWORD</label>
		<form:input path="passWord" value="${user.passWord }" />
		<br>
		<label>ADDRESS</label>
		<form:input path="address" value="${user.address }" />
		<br>
		
	
	</form:form>
	<h1>success</h1>


</body>

</html>
