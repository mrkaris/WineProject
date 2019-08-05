<header class="fullscreen-element no-pad centered-text">
    <div class="background-image-holder parallax-background overlay">
        <img class="background-image" alt="Background Image" src="static/img/main_image.jpg">
    </div>

    <div class="container align-vertical">
        <div class="row">
            <div class="col-md-7 col-sm-8">

                <h1 class="text-white">There is always time for a good wine.</h1>
                <p class="lead text-white">C'è sempre tempo per un buon vino</p>
                <sec:authorize access="!hasAnyRole('ADMIN','DBA','USER')">
                <a target="_self" href="login" class="btn btn-primary btn-white inner-link">Log in</a>
                <a href="newuser" class="btn btn-primary btn-filled inner-link" target="_self">Sign up for tasting</a>
                </sec:authorize>
            </div>
        </div>
    </div>


</header>