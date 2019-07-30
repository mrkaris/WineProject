<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ page isELIgnored="false" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8">
        <title>Winery Template</title>
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
        <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.6.3/css/all.css" integrity="sha384-UHRtZLI+pbxtHCWp1t77Bi1L4ZtiqrqD80Kn4Z8NTSRyMA2Fd33n5dQ8lWUE00s/" crossorigin="anonymous">
        <script src="${pageContext.request.contextPath}static/js/modernizr-2.6.2-respond-1.1.0.min.js"></script>
        <link href="http://fonts.googleapis.com/css?family=Cardo:400,400italic" rel="stylesheet" type="text/css">
        <link href="${pageContext.request.contextPath}static/css/font-cardo.css" rel="stylesheet" type="text/css">
    <body>
        <div class="loader">
            <div class="spinner">
                <div class="double-bounce1"></div>
                <div class="double-bounce2"></div>
            </div>
        </div>

        <%@include file="header.jsp" %>

        <div class="main-container">
            <div class="container">
                <div class="well lead">Variety Registration Form</div>
                <form:form method="POST" modelAttribute="variety" class="form-horizontal">
                    <form:input type="hidden" path="vid" id="id"/>

                    <div class="row">
                        <div class="form-group col-md-12">
                            <label class="col-md-3 control-lable" for="vdescr">Description</label>
                            <div class="col-md-7">
                                <form:input type="text" path="vdescr" id="vdescr" class="form-control input-sm"/>
                                <div class="has-error">
                                    <form:errors path="vdescr" class="help-inline"/>
                                </div>
                            </div>
                        </div>
                    </div>

                    <div class="row" style="margin-bottom: 20px; display:flex; justify-content: center;">
                        <div class="form-actions floatRight">
                            <c:choose>
                                <c:when test="${edit}">
                                    <input id="myAdd" type="submit" value="Update" class="btn btn-primary btn-sm"/> or <a href="<c:url value='/admin' />">Cancel</a>
                                </c:when>
                                <c:otherwise>
                                    <input id="myAdd" type="submit" value="Register" class="btn btn-primary btn-sm"/> or <a href="<c:url value='/admin' />">Cancel</a>
                                </c:otherwise>
                            </c:choose>
                        </div>
                    </div>
                </form:form>
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