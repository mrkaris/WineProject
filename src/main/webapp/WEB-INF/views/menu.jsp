<div class="row nav-menu">

    <div class="col-sm-12 columns text-center">
        <ul class="menu">
            <a></a>
            <li><a href="${pageContext.request.contextPath}/home" target="_self">Home</a></li>
            <li><a href="${pageContext.request.contextPath}/about" target="_self">About us</a></li>
            <li><a href="${pageContext.request.contextPath}/process" target="_self">Process</a></li>
            <li><a href="${pageContext.request.contextPath}/wines" target="_self">Our wines </a></li>
            <li><a href="${pageContext.request.contextPath}/contact" target="_self">Contact</a></li>
            <c:choose>
                <c:when test="${pageContext.request.isUserInRole('ADMIN') 
                                or pageContext.request.isUserInRole('USER') 
                                or pageContext.request.isUserInRole('DBA')}">
                    <li><a href="logout" target="_self">Logout</a></li>
                </c:when>
                <c:otherwise>
                    <li><a href="login" target="_self">Login</a></li>
                </c:otherwise>
            </c:choose>
            <sec:authorize access="hasAnyRole('ADMIN') or hasRole('DBA')">
                <li><a href="<c:url value='/admin' />" target="_self">Admin</a></li>
            </sec:authorize>

        </ul>
    </div>
</div>
