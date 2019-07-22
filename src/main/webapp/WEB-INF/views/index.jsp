<%@page contentType="text/html" pageEncoding="UTF-8"%>
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
        <link href="static/css/flexslider.min.css" rel="stylesheet" type="text/css" media="all" />
        <link href="static/css/line-icons.min.css" rel="stylesheet" type="text/css" media="all" />
        <link href="static/css/elegant-icons.min.css" rel="stylesheet" type="text/css" media="all" />
        <link href="static/css/lightbox.min.css" rel="stylesheet" type="text/css" media="all" />
        <link href="static/css/bootstrap.min.css" rel="stylesheet" type="text/css" media="all" />
        <link href="static/css/theme-1.css" rel="stylesheet" type="text/css" media="all" />
        <link href="static/css/custom.css" rel="stylesheet" type="text/css" media="all" />
        <!--[if gte IE 9]>
                <link rel="stylesheet" type="text/css" href="css/ie9.css" />
                <![endif]-->
        <link href='http://fonts.googleapis.com/css?family=Open+Sans:300italic,400italic,400,300,600,700%7CRaleway:700'
              rel='stylesheet' type='text/css'>
        <script src="static/js/modernizr-2.6.2-respond-1.1.0.min.js"></script>
        <link href="http://fonts.googleapis.com/css?family=Cardo:400,400italic" rel="stylesheet" type="text/css">
        <link href="static/css/font-cardo.css" rel="stylesheet" type="text/css">
    <body>
        <div class="loader">
            <div class="spinner">
                <div class="double-bounce1"></div>
                <div class="double-bounce2"></div>
            </div>
        </div>

        <%@include file="header.jsp" %>

        <div class="main-container">}
            <c:import url="${page}" />
        </div>

        <%@include file="footer.jsp" %>


        <script src="https://www.youtube.com/iframe_api"></script>
        <script src="static/js/jquery.min.js"></script>
        <script src="static/js/jquery.plugin.min.js"></script>
        <script src="static/js/bootstrap.min.js"></script>
        <script src="static/js/jquery.flexslider-min.js"></script>
        <script src="static/js/smooth-scroll.min.js"></script>
        <script src="static/js/skrollr.min.js"></script>
        <script src="static/js/spectragram.min.js"></script>
        <script src="static/js/scrollReveal.min.js"></script>
        <script src="static/js/isotope.min.js"></script>
        <script src="static/js/twitterFetcher_v10_min.js"></script>
        <script src="static/js/lightbox.min.js"></script>
        <script src="static/js/jquery.countdown.min.js"></script>
        <script src="static/js/scripts.js"></script>
    </body>

</html>