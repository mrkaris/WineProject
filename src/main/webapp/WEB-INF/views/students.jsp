<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>students.JSP</title>
        <link rel="stylesheet" type="text/css" href="https://cdn.datatables.net/1.10.19/css/jquery.dataTables.min.css">
        <script type="text/javascript" language="javascript" src="https://code.jquery.com/jquery-3.3.1.js"></script>
        <script type="text/javascript" language="javascript" src="https://cdn.datatables.net/1.10.19/js/jquery.dataTables.min.js"></script>   
        <script type="text/javascript">
            $(document).ready(function () {
                $('#colours').DataTable();
            });
        </script>
    </head>
    <body>
        <h1>Students list!</h1>
        <table border="1" id="students">
            <thead>
                <tr>
                    <th>ID</th>
                    <th>First Name</th>
                    <th>Last Name</th>
                    <th>Section</th>
                </tr>
            </thead>
            <tbody>
                <c:forEach items="${colours}" var="item">
                    <tr>
                        <td>${item.pid}</td>
                        <td>${item.pyear}</td>
                        <td>${item.pname}</td>
                        <td>${item.psize}</td>
                        <td>${item.palcohol}</td>
                        <td>${item.pdryness}</td>
                        <td>${item.pdescr}</td>
                        <td>${item.pprice}</td>
                        <td>${item.cid.cdescr}</td>
                        
                        
                        
                    </tr>
                </c:forEach>
            </tbody>
        </table>
    </body>
</html>