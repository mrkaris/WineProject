<div class="row nav-menu">

    <div class="col-sm-12 columns text-center">
        <ul class="menu">
            <a></a>
            <li><a href="${pageContext.request.contextPath}/home" target="_self">Home</a></li>
            <li><a href="${pageContext.request.contextPath}/about" target="_self">About us</a></li>
            <li><a href="${pageContext.request.contextPath}/process" target="_self">Process</a></li>
            <li><a href="${pageContext.request.contextPath}/wines" target="_self">Our wines </a></li>
            <sec:authorize access="hasAnyRole('ADMIN') or hasRole('DBA') or hasRole('USER')">
                <li><a href="<c:url value='/chat' />" target="_self">Chat</a></li>
            </sec:authorize>
            <sec:authorize access="hasAnyRole('ADMIN') or hasRole('DBA')">
                <li><a href="<c:url value='/admin' />" target="_self">Admin</a></li>
            </sec:authorize>            
            <c:choose>
                <c:when test="${pageContext.request.isUserInRole('ADMIN') 
                                or pageContext.request.isUserInRole('USER') 
                                or pageContext.request.isUserInRole('DBA')}">
                    <li><a href="${pageContext.request.contextPath}/logout" target="_self">Logout</a></li>
                </c:when>
                <c:otherwise>
                    <li><a href="${pageContext.request.contextPath}/login" target="_self">Login</a></li>
                </c:otherwise>
            </c:choose>
        </ul>
        <div style="float:right; margin-top: 1%">
            <%@include file="authheader.jsp"%>
        </div>
    </div>
</div>
