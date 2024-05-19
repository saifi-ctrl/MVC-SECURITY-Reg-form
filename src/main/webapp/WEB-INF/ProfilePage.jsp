
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<form:form modelAttribute="loginU">


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

		<a href="LoginDetails">Logout</a>

	</form:form>
	<h1>success</h1>

</body>
</html>