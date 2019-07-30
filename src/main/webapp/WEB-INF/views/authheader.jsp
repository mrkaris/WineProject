<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<div class="authbar">
    <c:choose>
        <c:when test="${pageContext.request.isUserInRole('ADMIN') 
                        or pageContext.request.isUserInRole('USER') 
                        or pageContext.request.isUserInRole('DBA')}">
                <span style="font-size: small">Logged in as </span>
        </c:when>
        </c:choose>
    <strong style="font-size: small"><a href="<c:url value='/edituserinfo' />">${loggedinuser=='anonymousUser'?"":loggedinuser}</a></strong>
</div>
