<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ page isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
        <title>AccessDenied page</title>
        <link href="${pageContext.request.contextPath}/static/css/bootstrap.css" rel="stylesheet"></link>
        <link href="${pageContext.request.contextPath}/static/css/app.css" rel="stylesheet"></link>
    </head>
    <body>
        <div class="generic-container">
            <div class="authbar">
                <span>Dear <strong>${loggedinuser=='anonymousUser'?"Guest":loggedinuser}</strong>, You are not authorized to access this page.</span> 
                <span class=""><a href="<c:url value="/logout" />">Logout </a></span>
                <span> or go to </span><span><a href="<c:url value="/" />"> Homepage</a></span>
            </div>
        </div>
    </body>
</html>