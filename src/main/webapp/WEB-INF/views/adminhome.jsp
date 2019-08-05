<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags"%>
<%@ page isELIgnored="false" %>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8">
        <title>Winery Template</title>
        <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
        <meta name="description" content="">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <link href="${pageContext.request.contextPath}/static/css/flexslider.min.css" rel="stylesheet" type="text/css" media="all" />
        <link href="${pageContext.request.contextPath}/static/css/line-icons.min.css" rel="stylesheet" type="text/css" media="all" />
        <link href="${pageContext.request.contextPath}/static/css/elegant-icons.min.css" rel="stylesheet" type="text/css" media="all" />
        <link href="${pageContext.request.contextPath}/static/css/lightbox.min.css" rel="stylesheet" type="text/css" media="all" />
        <link href="${pageContext.request.contextPath}/static/css/bootstrap.min.css" rel="stylesheet" type="text/css" media="all" />
        <link href="${pageContext.request.contextPath}/static/css/theme-1.css" rel="stylesheet" type="text/css" media="all" />
        <link href="${pageContext.request.contextPath}/static/css/custom.css" rel="stylesheet" type="text/css" media="all" />
        <!--[if gte IE 9]>
                <link rel="stylesheet" type="text/css" href="css/ie9.css" />
                <![endif]-->
        <link href='http://fonts.googleapis.com/css?family=Open+Sans:300italic,400italic,400,300,600,700%7CRaleway:700'
              rel='stylesheet' type='text/css'>
        <script src="${pageContext.request.contextPath}static/js/modernizr-2.6.2-respond-1.1.0.min.js"></script>
        <link href="http://fonts.googleapis.com/css?family=Cardo:400,400italic" rel="stylesheet" type="text/css">
        <link href="${pageContext.request.contextPath}static/css/font-cardo.css" rel="stylesheet" type="text/css">
    </head>
    <body>
        <div class="loader">
            <div class="spinner">
                <div class="double-bounce1"></div>
                <div class="double-bounce2"></div>
            </div>
        </div>

        <%@include file="header.jsp" %>


        <div class="main-container overflow-auto">
            <div class="generic-container">
                <div class="container panel panel-default">
                    <!-- Default panel contents -->
                    <div class="panel-heading"><span class="lead">Admin Homepage </span></div>
                    <table class="table table-hover">
                        <thead>
                            <tr>
                                <th>Options</th>
                            </tr>
                        </thead>
                        <tbody style="margin: 40px; display: flex; flex-direction: column;">
                            <tr>
                                <td><a class="btn btn-default" href="<c:url value='/list' />">Users</a></td>
                            </tr>
                            <tr>
                                <td><a class="btn btn-default" href="<c:url value='/product' />">Products</a></td>
                            </tr>
                            <tr>
                                <td><a class="btn btn-default" href="<c:url value='/colour' />">Colours</a></td>
                            </tr>
                            <tr>
                                <td><a class="btn btn-default" href="<c:url value='/country' />">Countries</a></td>
                            </tr>
                            <tr>
                                <td><a class="btn btn-default" href="<c:url value='/variety' />">Varieties</a></td>
                            </tr>
                        </tbody>
                    </table>
                </div>
            </div>
        </div>

                <%@include file="footer.jsp" %>


                <script src="https://www.youtube.com/iframe_api"></script>
                <script src="${pageContext.request.contextPath}/static/js/jquery.min.js"></script>
                <script src="${pageContext.request.contextPath}/static/js/jquery.plugin.min.js"></script>
                <script src="${pageContext.request.contextPath}/static/js/bootstrap.min.js"></script>
                <script src="${pageContext.request.contextPath}/static/js/jquery.flexslider-min.js"></script>
                <script src="${pageContext.request.contextPath}/static/js/smooth-scroll.min.js"></script>
                <script src="${pageContext.request.contextPath}/static/js/skrollr.min.js"></script>
                <script src="${pageContext.request.contextPath}/static/js/spectragram.min.js"></script>
                <script src="${pageContext.request.contextPath}/static/js/scrollReveal.min.js"></script>
                <script src="${pageContext.request.contextPath}/static/js/isotope.min.js"></script>
                <script src="${pageContext.request.contextPath}/static/js/twitterFetcher_v10_min.js"></script>
                <script src="${pageContext.request.contextPath}/static/js/lightbox.min.js"></script>
                <script src="${pageContext.request.contextPath}/static/js/jquery.countdown.min.js"></script>
                <script src="${pageContext.request.contextPath}/static/js/scripts.js"></script>
                </body>

                </html>