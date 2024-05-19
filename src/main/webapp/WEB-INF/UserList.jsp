<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    
     <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>    
   <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>    
<!DOCTYPE html>
<html>
<head>
    <meta charset="ISO-8859-1">
    <title>User List</title>
    <style>
        body {
            font-family: 'Arial', sans-serif;
            background-color: #f4f4f4;
            margin: 0;
            padding: 0;
            display: flex;
            justify-content: center;
            align-items: center;
            flex-direction: column;
        }

        h1 {
            text-align: center;
            color: #333;
            margin-bottom: 20px;
        }

        table {
            width: 70%;
            border-collapse: collapse;
            margin-top: 20px;
            background-color: #rrr;
            box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
        }

        th, td {
            border: 2px solid #ddd;
            padding: 10px;
            text-align: left;
        }

        th {
            background-color: #4CAF50;
            color: white;
        }

        tr:nth-child(even) {
            background-color: #f9f9f9;
        }

        a {
            display: inline-block;
            padding: 10px 20px;
            background-color: #3498db;
            color: #fff;
            text-decoration: none;
            margin-top: 20px;
            border-radius: 4px;
        }

        a:hover {
            background-color: #2980b9;
        }
    </style>
</head>
<body>



  
<h1>User List</h1> 

 
<table border="2" width="70%" cellpadding="2">  
<tr><th>email</th><th>user_Name</th><th>mobile_Number</th><th>address</th><th>Edit</th><th>Delete</th></tr>  

   <c:forEach var="user" items="${listUser}">   
   <tr>  
   <td>${user.email}</td>  
   <td>${user.userName}</td>  
   <td>${user.mobileNo}</td>  
   <%-- <td>${user.password}</td> --%> 
   <td>${user.address}</td>  
   <td><a href="getmail?email=${user.email}">Update</a></td>  
   <td><a href="delete?email=${user.email}">Delete</a></td>
   
   </tr>  
   </c:forEach>  
   </table>  
   <br>  
   <%-- <a href="<c:url value='save' />">Add New User</a> --%>
   
   <a href="add">Add New User</a> 


</body>
</html>