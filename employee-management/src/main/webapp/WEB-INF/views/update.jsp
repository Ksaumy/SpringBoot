<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="com.management.model.Employee" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Edit Employee</title>
</head>
<body>
    <form action="${pageContext.request.contextPath}/update/${employee.empId}" method="post">
        <div class="form-group">
            <label for="empName">Employee Name</label>
            <input type="text" id="empName" name="empName" value="${employee.empName}" placeholder="Enter Employee name" required>
        </div>
       
        <div class="form-group">
            <button type="submit">Update Employee</button>
        </div>
    </form>
</body>
</html>
