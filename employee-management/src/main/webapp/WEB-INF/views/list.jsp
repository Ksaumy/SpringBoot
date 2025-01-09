<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="java.util.List" %>
<%@ page import="com.management.model.Employee" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Employee List</title>
    <style>
        body {
            font-family: 'Arial', sans-serif;
            background-color: #F4F4F4;
            color: #1A1A2E;
            display: flex;
            justify-content: center;
            align-items: center;
            height: 100vh;
            margin: 0;
        }
        .container {
            background: #fff;
            padding: 20px;
            border-radius: 10px;
            box-shadow: 0 4px 8px rgba(0, 0, 0, 0.1);
            max-width: 800px;
            width: 100%;
            text-align: center;
        }
        h2 {
            color: #FF6F61;
            margin-bottom: 20px;
        }
        table {
            width: 100%;
            border-collapse: collapse;
            margin-bottom: 20px;
        }
        th, td {
            padding: 10px;
            border: 1px solid #ccc;
        }
        th {
            background-color: #FFEB3B;
            color: #1A1A2E;
        }
        td {
            background-color: #fff;
            color: #1A1A2E;
        }
        a {
            display: inline-block;
            margin: 10px;
            padding: 10px 20px;
            background-color: #00B8D4;
            color: #fff;
            text-decoration: none;
            border-radius: 5px;
            transition: background-color 0.3s ease;
        }
        a:hover {
            background-color: #FF6F61;
            color: #fff;
        }
    </style>
</head>
<body>
    <div class="container">
        <h2>Employee List</h2>
        <hr>
        <table>
            <thead>
                <tr>
                    <th>Employee ID</th>
                    <th>Employee Name</th>
                    <th>Employee Age</th>
                    <th>Employee Gender</th>
                    <th>Actions</th>
                </tr>
            </thead>
            <tbody>
                <% 
                    List<Employee> employeeList = (List<Employee>) request.getAttribute("employeelist");
                    if (employeeList != null) {
                        for (Employee employee : employeeList) {
                %>
                <tr>
                    <td><%= employee.getEmpId() %></td>
                    <td><%= employee.getEmpName() %></td>
                    <td><%= employee.getEmpAge() %></td>
                    <td><%= employee.getEmpGender() %></td>
                    <td>
                        <a href="/employeemanagement/edit/<%= employee.getEmpId() %>">Update</a>
                        <a href="/employeemanagement/delete/<%= employee.getEmpId() %>">Delete</a>
                    </td>
                </tr>
                <% 
                        }
                    } else {
                %>
                <tr>
                    <td colspan="5">No employees found.</td>
                </tr>
                <% 
                    } 
                %>
            </tbody>
        </table>
        <a href="/employeemanagement/new">Add New Employee</a> &nbsp;&nbsp;&nbsp;
        <a href="/employeemanagement/">Home Page</a>
    </div>
</body>
</html>
