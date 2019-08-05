<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
      integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<div class="main-container">
    <section class="team-1">
        <div class="container">
            <div class="row">
                <div class="col-md-8 col-md-offset-2 text-center">
                    <h1>Meet the collection of our wines</h1>
                    <p class="lead">
                        At our Vineyards and Winery, our tasting room is always open for wine tastings. 
                        Escape out to the beautiful countryside and enjoy sampling our wines to know exactly 
                        what your preferences are. Whether you are a novice or experienced wine drinker, 
                        our knowledgeable staff will guide you in discovering Tabor wines. We have a range of 
                        wines to please any wine drinker, including reds and whites. 
                        All of our wines are available to buy. Read the descriptions below to find 
                        the perfect one!
                    </p>
                </div>
            </div>
            <%@include file="filters.jsp" %>
            <c:forEach items="${products}" var="item">
                <div class="card d-inline-block h-50 m-4" style="width: 24.5rem; background-color:white; border-color: #a6a6a6;">
                    <img class="card-img-top mt-2" style="display: block; margin-left: auto; margin-right: auto; width: 22%; height: 17vw; object-fit: cover;" 
                         src="${item.image}" alt="Card image cap">
                    <div class="card-body">
                        <h3 class="card-title font-weight-bold align-vertical" style="font-family: '${item.pname}', 
                            serif;font-style: italic;font-weight: 400;">${item.pname}</h3>
                    </div>
                    <ul class="list-group list-group-flush">
                        <li class="list-group-item" style="background-color:#f2f2f2; border-color: #a6a6a6;"><p class="card-text">Variety: ${item.vid.vdescr}</p></li>
                        <li class="list-group-item " style="background-color:#f2f2f2; border-color: #a6a6a6;"><p class="card-text">Colour: ${item.clid.cldescr}</p></li>
                        <li class="list-group-item" style="background-color:#f2f2f2; border-color: #a6a6a6;"><p class="card-text">Price: ${item.pprice} EUR</p></li>
                    </ul>
                    <div class="card-body" style="background-color:#f2f2f2; border-color: #a6a6a6;">
                        <!--                        <a href="#" class="card-link float-right">Buy</a>
                                                <a href="#" class="card-link float-left">View</a>-->               
                        <a href="<c:url value="/product/view/${item.pid}"/>" class="btn btn-primary btn-md float-center btn-block">Buy</a>

                    </div>
                </div>
            </c:forEach>

            <section class="duplicatable-content pure-text">
                <div class="container">
                    <div class="row">
                        <div class="col-sm-12 text-center">
                            <h1>Which one fits to you?</h1>
                        </div>
                    </div>

                    <div class="row">
                        <div class="col-sm-4">
                            <h6>Ingredients</h6>
                            <p>                    
                                Read the back of the label to get ideas about the wine's flavor, body and potential pairings. 
                                Most people buy wines based on labels they like, but take things a step further and actually read 
                                the winemaker's description. They frequently point to the prominent flavors and character of the 
                                wine, and sometimes suggest food pairings as well. 
                            </p>
                        </div>

                        <div class="col-sm-4">
                            <h6>The flavor</h6>
                            <p>
                                Consider how strongly flavored or rich the meal is, and match it with a similarly full-bodied wine. 
                                The idea of "red with meat, white with fish," is far too simple. The more important goal is for the 
                                wine and meal to complement each other. You don't want either the dish to overpower the taste of 
                                the wine or vice versa -- they should both have a similar depth. 
                            </p>
                        </div>

                        <div class="col-sm-4">
                            <h6>The age</h6>
                            <p>                               
                                Consider the vintage, or year, when you choose wine, but understand that all wines age differently. 
                                All wines change, develop, and evolve with age. Every wine ages 
                                differently, making choosing based on the year a fool's errand unless you're a seasoned pro. 
                                That said, there are some common traits that all wines take on as they age.
                            </p>
                        </div>
                    </div>
                </div>
            </section>

            <section class="bg-primary">
                <div class="container">
                    <div class="row">
                        <div class="col-sm-8 col-sm-offset-2">
                            <div class="testimonials-slider text-center">
                                <ul class="slides">
                                    <li>
                                        <p class="text-white lead">Just a very quick review to thank you so much for taking 
                                            the time out to help us better understand the organic wine process and to enjoy the
                                            truly remarkable wines that you have produced.</p>
                                        <span class="author text-white">John Doe</span>
                                    </li>

                                    <li>
                                        <p class="text-white lead">Your wines however stand far from the madding crowd and 
                                            have a great backstory and a passion that can not be ignored. <br>
                                            Kindest regards</p>
                                        <span class="author text-white">Jessica Marks</span>
                                    </li>

                                    <li>
                                        <p class="text-white lead">We will most certainly be attending the pruning activity in 
                                            August and look forward very much to spending time with you again and meeting other 
                                            people with a similar passion.</p>
                                        <span class="author text-white">Steven Hanson</span>
                                    </li>
                                </ul>
                            </div>
                        </div>
                    </div>
                </div>
            </section>
        </div>
