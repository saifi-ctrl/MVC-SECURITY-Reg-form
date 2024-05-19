<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Login User's</title>
    <style>
        body {
            font-family: 'Arial', sans-serif;
            background-color: #f4f4f4;
            text-align: center;
            margin: 50px;
        }

        h1 {
            color: #333;
        }

        form {
            max-width: 400px;
            margin: 0 auto;
            background-color: #fff;
            padding: 20px;
            border-radius: 8px;
            box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
        }

        label {
            display: block;
            margin-bottom: 8px;
            color: #333;
        }

        input {
            width: 100%;
            padding: 10px;
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
       
        .signup-link {
            display: block;
            margin-top: 15px;
            text-decoration: none;
            color: #333;
        }
    </style>
</head>
<body>
    <h1>Login Details</h1>
    <form:form action="login" modelAttribute="users" method="Post">
        <label for="USERNAME">USERNAME</label>
        <form:input path="email" id="email" />
        <form:errors path="email"></form:errors>
        <br>

        <label for="password">PASSWORD</label>
        <form:input path="passWord" type="password" id="passWord" />
        <form:errors path="passWord" ></form:errors>
        <br>

        <input type="submit" value="Login">
    </form:form>

    <a href="add" class="signup-link">Don't have an account? Sign Up</a>
</body>
</html>