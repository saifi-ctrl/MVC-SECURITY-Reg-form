<%@ page language="java" contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<html>
<head>
    <title>User List</title>
    <style>
        table {
            border-collapse: collapse;
            width: 100%;
        }

        th, td {
            border: 1px solid black;
            padding: 8px;
            text-align: left;
        }

        .link {
            color: blue;
            text-decoration: none;
        }
    </style>
</head>
<body>
    <h1>User List</h1>
    <table>
        <thead>
            <tr>
                <th>Email</th>
                <th>UserName</th>
                <th>Mobile Number</th>
                <th>Password</th>
                <th>Address</th>
                <th>Edit</th>
                <th>Delete</th>
            </tr>
        </thead>
        <tbody>
            <c:forEach var="user" items="${list}">
                <tr>
                    <td>${user.email}</td>
                    <td>${user.userName}</td>
                    <td>${user.mobileNo}</td>
                    <td>${user.passWord}</td>
                    <td>${user.address}</td>
                    <td><a href="/editUser/${user.email}" class="link">Edit</a></td>
                    <td><a href="/deleteUser/${user.email}" class="link">Delete</a></td>
                </tr>
            </c:forEach>
        </tbody>
    </table>
    <br/>
    <a href="/getmail" class="link">Add New User</a>
</body>
</html>
