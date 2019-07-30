<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ page isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
        <title>Registration Confirmation Page</title>
        <link href="${pageContext.request.contextPath}/static/css/bootstrap.css" rel="stylesheet"></link>
        <link href="${pageContext.request.contextPath}/static/css/app.css" rel="stylesheet"></link>
    </head>
    <body>
        <div class="generic-container">
            <div class="alert alert-success lead">
                ${success}
            </div>
            <c:choose>
                <c:when test="${pageContext.request.isUserInRole('ADMIN')  
                                or pageContext.request.isUserInRole('DBA')}">
                        <span class="well floatRight">
                            Go to <a href="<c:url value='/admin' />">Admin Homepage</a>
                        </span>
                </c:when>
                <c:otherwise>
                    <span class="well floatRight">
                        Go to <a href="<c:url value='/' />">Homepage</a>
                    </span>
                </c:otherwise>
            </c:choose>
        </div>
    </body>

</html>