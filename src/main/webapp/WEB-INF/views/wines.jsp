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
                        Escape out to the beautiful Iowa countryside and enjoy sampling our wines to know exactly 
                        what your preferences are. Whether you are a novice or experienced wine drinker, 
                        our knowledgeable staff will guide you in discovering Tabor wines. We have a range of 
                        wines to please any wine drinker, including reds and whites. 
                        All of our wines are available to buy. Read the descriptions below to find 
                        the perfect one for you! 
                    </p>
                </div>
            </div>
<%@include file="wineByCountry.jsp" %>
            <c:forEach items="${products}" var="item">
                <div class="card d-inline-block h-50 m-4" style="width: 24.5rem; background-color:white; border-color: #a6a6a6;">
                    <img class="card-img-top mt-2" style="display: block; margin-left: auto; margin-right: auto; width: 18%;" 
                         src="https://d.scdn.gr/images/sku_main_images/004709/4709792/20181008092249_moet_chandon_brut_imperial_leyko_750ml.jpeg" alt="Card image cap">
                    <div class="card-body">
                        <h3 class="card-title font-weight-bold align-vertical" style="font-family: '${item.pname}', 
                            serif;font-style: italic;font-weight: 400;">${item.pname}</h3>
                    </div>
                    <ul class="list-group list-group-flush">
                        <li class="list-group-item" style="background-color:#f2f2f2; border-color: #a6a6a6;"><p class="card-text">${item.vid.vdescr}</p></li>
                        <li class="list-group-item " style="background-color:#f2f2f2; border-color: #a6a6a6;"><p class="card-text">Colour: ${item.clid.cldescr}</p></li>
                        <li class="list-group-item" style="background-color:#f2f2f2; border-color: #a6a6a6;"><p class="card-text">Price: ${item.pprice} EUR</p></li>
                    </ul>
                    <div class="card-body" style="background-color:#f2f2f2; border-color: #a6a6a6;">
                        <!--                        <a href="#" class="card-link float-right">Buy</a>
                                                <a href="#" class="card-link float-left">View</a>-->               
                        <a href="<c:url value="/product/view/${item.pid}"/>" class="btn btn-primary btn-md float-center btn-block">View</a>
                        <button type="button" class="btn btn-secondary btn-md float-center btn-block">Buy</button>

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
                            <h6>Nemo enim ipsam voluptatem</h6>
                            <p>
                                At vero eos et accusamus et iusto odio dignissimos ducimus qui blanditiis praesentium
                                voluptatum deleniti atque corrupti quos dolores et quas molestias excepturi sint occaecati
                                cupiditate non provident, similique sunt in culpa qui officia deserunt mollitia animi, id
                                est laborum et dolorum fuga. Et harum quidem rerum facilis est et expedita distinctio.
                            </p>
                        </div>

                        <div class="col-sm-4">
                            <h6>Dolorem ipsum quia dolor sit amet</h6>
                            <p>
                                At vero eos et accusamus et iusto odio dignissimos ducimus qui blanditiis praesentium
                                voluptatum deleniti atque corrupti quos dolores et quas molestias excepturi sint occaecati
                                cupiditate non provident, similique sunt in culpa qui officia deserunt mollitia animi, id
                                est laborum et dolorum fuga. Et harum quidem rerum facilis est et expedita distinctio.
                            </p>
                        </div>

                        <div class="col-sm-4">
                            <h6>Fugiat quo voluptas nulla pariatur</h6>
                            <p>
                                At vero eos et accusamus et iusto odio dignissimos ducimus qui blanditiis praesentium
                                voluptatum deleniti atque corrupti quos dolores et quas molestias excepturi sint occaecati
                                cupiditate non provident, similique sunt in culpa qui officia deserunt mollitia animi, id
                                est laborum et dolorum fuga. Et harum quidem rerum facilis est et expedita distinctio.
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
                                        <p class="text-white lead">Lorem ipsum dolor sit amet, consectetur adipiscing elit,
                                            sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad
                                            minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea
                                            commodo consequat. </p>
                                        <span class="author text-white">John Doe</span>
                                    </li>

                                    <li>
                                        <p class="text-white lead">Nemo enim ipsam voluptatem quia voluptas sit aspernatur
                                            aut odit aut fugit, sed quia consequuntur magni dolores eos qui ratione
                                            voluptatem sequi nesciunt. Neque porro quisquam est, qui dolorem ipsum quia
                                            dolor.</p>
                                        <span class="author text-white">Jessica Marks</span>
                                    </li>

                                    <li>
                                        <p class="text-white lead">Dignissimos ducimus qui blanditiis praesentium voluptatum
                                            deleniti atque corrupti quos dolores et quas molestias excepturi sint occaecati
                                            cupiditate non provident, similique sunt in culpa qui officia deserunt mollitia
                                            animi, id est laborum et dolorum fuga.</p>
                                        <span class="author text-white">Steven Hanson</span>
                                    </li>
                                </ul>
                            </div>
                        </div>
                    </div>
                </div>
            </section>
        </div>
