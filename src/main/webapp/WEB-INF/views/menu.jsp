<div class="row nav-menu">

    <div class="col-sm-12 columns text-center">
        <ul class="menu">
            <a></a>
            <li><a href="index.jsp" target="_self">Home</a></li>
            <li><a href="about.jsp" target="_self">About us</a></li>
            <li><a href="process.jsp" target="_self">Process</a></li>
            <li><a href="wines.jsp" target="_self">Our wines </a></li>
            <li><a href="contact.jsp" target="_self">Contact</a></li>
            <sec:authorize access="hasAnyRole('ADMIN') or hasRole('DBA')">
                <li><a href="adminHome.jsp" target="_self">Admin</a></li>
            </sec:authorize>

        </ul>
    </div>
</div>
