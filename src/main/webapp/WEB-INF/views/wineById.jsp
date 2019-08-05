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
        <script src="${pageContext.request.contextPath}/static/js/modernizr-2.6.2-respond-1.1.0.min.js"></script>
        <link href="http://fonts.googleapis.com/css?family=Cardo:400,400italic" rel="stylesheet" type="text/css">
        <link href="${pageContext.request.contextPath}/static/css/font-cardo.css" rel="stylesheet" type="text/css">
    <body>
        <div class="loader">
            <div class="spinner">
                <div class="double-bounce1"></div>
                <div class="double-bounce2"></div>
            </div>
        </div>

        <%@include file="header.jsp" %>
        <br>
        <br>
        <br>
        <br>
        <br>
        <br>
        <br>
        <br>
        <c:set var="product" value="${product}" />
        <div class="container" >
            <div style="display:inline;">
                <img class="card-img-top mt-2" style="float: left; width: 155px; text-align: right; margin: 15px 130px; display: inline;" 
                     src="${product.image}" alt="Card image cap">
            </div>
            <div class="card d-inline-block h-40 m-8" style="float: left; text-align: left; margin: 5px 150px; width: 400px; display: inline; background-color:white; border-color: #a6a6a6;">
                <ul class="list-group list-group-flush">
                    <li class="list-group-item" style="background-color:#f2f2f2; border-color: #a6a6a6;"><h3 class="card-text" style="text-align: center;">${product.pname}</h3></li>
                    <li class="list-group-item" style="background-color:#f2f2f2; border-color: #a6a6a6;"><p class="card-text">${product.pdescr}</p></li>
                    <li class="list-group-item" style="background-color:#f2f2f2; border-color: #a6a6a6;"><p class="card-text">Variety: ${product.vid.vdescr}</p></li>
                    <li class="list-group-item" style="background-color:#f2f2f2; border-color: #a6a6a6;"><p class="card-text">Colour: ${product.clid.cldescr}</p></li>
                    <li class="list-group-item" style="background-color:#f2f2f2; border-color: #a6a6a6;"><p class="card-text">Country: ${product.cid.cdescr}</p></li>
                    <li class="list-group-item" style="background-color:#f2f2f2; border-color: #a6a6a6;"><p class="card-text">Dryness: ${product.pdryness}</p></li>
                    <li class="list-group-item" style="background-color:#f2f2f2; border-color: #a6a6a6;"><p class="card-text">Alcohol: ${product.palcohol}%</p></li>
                    <li class="list-group-item" style="background-color:#f2f2f2; border-color: #a6a6a6;"><p class="card-text">Year: ${product.pyear}</p></li>
                    <li class="list-group-item" style="background-color:#f2f2f2; border-color: #a6a6a6;"><p class="card-text">Size: ${product.psize}ml</p></li>
                    <li class="list-group-item" style="background-color:#f2f2f2; border-color: #a6a6a6;"><p class="card-text">Price: ${product.pprice} EUR</p></li>
                    <li class="list-group-item" style="background-color:#f2f2f2; border-color: #a6a6a6;"><p class="card-text">Quantity: 
                        <input type="number" id="number" name="number" value="1" min="1" max="20" data-bind="value:replyNumber" />
                        </p></li>
                    

                </ul>
                <div class="card-body" style="background-color:#f2f2f2; border-color: #a6a6a6;">
                    <!--                        <a href="#" class="card-link float-right">Buy</a>
                                            <a href="#" class="card-link float-left">View</a>-->               
                    <!--                <button type="button" class="btn btn-primary btn-md float-center btn-block">Buy</button>-->
                    <div class=" btn-primary10 btn-md float-center btn-block "id="paypal-button-container"></div>
                    <a href="<c:url value="/wines"/>" class="btn btn-secondary btn-md float-center btn-block">Back</a>
                </div>
            </div>
        </div>
        <br>
        <br>
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
        <script src="https://www.paypal.com/sdk/js?client-id=Af9x9QjflUEBvxzB_THdbNwQu9Xtj5I2YiPkNe8XxLhyLBQn78SLypvdttb_zue06xFGhsgy_a1HItjz&currency=EUR"></script>
        <script>
            // Render the PayPal button into #paypal-button-container
            paypal.Buttons({

                style: {
                    layout: 'horizontal',
                    fundingicons: 'false',
                    tagline: 'false',
                    size: 'responsive'
                },
                //funding: {
                // allowed: [ paypal.FUNDING.CARD ],
                // disallowed: [ paypal.FUNDING.CREDIT ]
                //}
                // Set up the transaction
                createOrder: function (data, actions) {
                    let quantity = document.querySelector("#number").value;
                    let total = quantity *${product.pprice};
                    return actions.order.create({
                        purchase_units: [{
                                amount: {
                                    value: total
                                }
                            }]
                    });
                },

                // Finalize the transaction
                onApprove: function (data, actions) {
                    return actions.order.capture().then(function (details) {
                        // Show a success message to the buyer
                        alert('Transaction completed by ' + details.payer.name.given_name + '!');
                    });
                }


            }).render('#paypal-button-container');
        </script>
    </body>

</html>

