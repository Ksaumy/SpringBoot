<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Employee Management - Add New Employee</title>
    <link rel="stylesheet" type="text/css" href="employee-management/resources/static/css/styles.css"> <!-- Link to your CSS file if needed -->
    <style>
        body {
            font-family: Arial, sans-serif;
            background-color: #f4f4f4;
            margin: 0;
            padding: 0;
        }

        .container {
            width: 80%;
            margin: 0 auto;
            background-color: #fff;
            padding: 20px;
            box-shadow: 0 0 10px rgba(0,0,0,0.1);
        }

        h1 {
            color: #333;
            text-align: center;
        }

        form {
            width: 100%;
            margin: 20px 0;
        }

        form table {
            width: 100%;
            border-collapse: collapse;
        }

        form table tr {
            margin-bottom: 10px;
        }

        form table td {
            padding: 10px;
        }

        form input[type="text"], form input[type="number"], form input[type="radio"] {
            width: 100%;
            padding: 8px;
            box-sizing: border-box;
            border: 1px solid #ddd;
            border-radius: 4px;
        }

        form input[type="radio"] {
            margin-right: 10px;
        }

        form input[type="submit"] {
            background-color: #007bff;
            color: #fff;
            padding: 10px 20px;
            text-decoration: none;
            border: none;
            border-radius: 4px;
            cursor: pointer;
        }

        form input[type="submit"]:hover {
            background-color: #0056b3;
        }
    </style>
</head>
<body>
    <div class="container">
        <h1>Employee Management - Add New Employee</h1>
        
        <form action="/employeemanagement/form" method="post">
            <table>
                
                <tr>
                    <td>Employee Name:</td>
                    <td><input type="text" name="empName" required /></td>
                </tr>
                <tr>
                    <td>Employee Age:</td>
                    <td><input type="number" name="empAge" required /></td>
                </tr>
                <tr>
                    <td>Employee Gender:</td>
                    <td>
                        <input type="radio" name="empGender" value="male" required /> Male
                        <input type="radio" name="empGender" value="female" required /> Female
                    </td>
                </tr>
                <tr>
                    <td colspan="2" style="text-align: center;">
                        <input type="submit" value="Save">
                    </td>
                </tr>
            </table>
        </form>
    </div>
</body>
</html>
