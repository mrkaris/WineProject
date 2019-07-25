<div class="row nav-menu">

    <div class="col-sm-12 columns text-center">
        <ul class="menu">
            <a></a>
            <li><a href="home" target="_self">Home</a></li>
            <li><a href="about" target="_self">About us</a></li>
            <li><a href="process" target="_self">Process</a></li>
            <li><a href="wines" target="_self">Our wines </a></li>
            <li><a href="contact" target="_self">Contact</a></li>
            <li><a href="login" target="_self">Login</a></li>
            <sec:authorize access="hasAnyRole('ADMIN') or hasRole('DBA')">
                <li><a href="adminHome.jsp" target="_self">Admin</a></li>
            </sec:authorize>

        </ul>
    </div>
</div>
