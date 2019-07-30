<!DOCTYPE html>
<html>
    <head>
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link rel="stylesheet" href="${pageContext.request.contextPath}/static/css/filtersidebar.css" type="text/css" media="all">
    </head>
    <body>

        <div id="mySidebar" class="sidebar">
                <a href="javascript:void(0)" class="closebtn" onclick="closeNav()">×</a>
                <a href="${pageContext.request.contextPath}/wines">All</a>
                <a class="dropdown-btn">Country
                    <i class="fa fa-caret-down"></i>
                </a>
                <div class="dropdown-container" style="display: none;">
                    <c:forEach items="${countries}" var="country">
                        <a href="${pageContext.request.contextPath}/product/country/${country.cid}"><h5>${country.cdescr}</h5></a>
                    </c:forEach>
                </div>
                <a class="dropdown-btn">Color
                    <i class="fa fa-caret-down"></i>
                </a>
                <div class="dropdown-container" style="display: none;">
                    <c:forEach items="${colours}" var="colour">
                        <a href="${pageContext.request.contextPath}/product/colour/${colour.clid}"><h5>${colour.cldescr}</h5></a>
                    </c:forEach>
                </div>
                <a class="dropdown-btn">Variety
                    <i class="fa fa-caret-down"></i>
                </a>
                <div class="dropdown-container" style="display: none;">
                    <c:forEach items="${varieties}" var="variety">
                        <a href="${pageContext.request.contextPath}/product/variety/${variety.vid}"><h5>${variety.vdescr}</h5></a>
                    </c:forEach>
                </div>
        </div>

        <div id="main">
            <button class="openbtn bg-primary" onclick="openNav()"><i class="fas fa-filter"></i>Filter Sidebar</button>  
            <h4>Click on the sidebar to filter our wines by country, variety or color</h4>
        </div>


        <script>
            function openNav() {
                document.getElementById("mySidebar").style.width = "250px";
                document.getElementById("main").style.marginLeft = "250px";
            }

            function closeNav() {
                document.getElementById("mySidebar").style.width = "0";
                document.getElementById("main").style.marginLeft = "0";
            }
        </script>
        <script>
            /* Loop through all dropdown buttons to toggle between hiding and showing its dropdown content - This allows the user to have multiple dropdowns without any conflict */
            var dropdown = document.getElementsByClassName("dropdown-btn");
            var i;

            for (i = 0; i < dropdown.length; i++) {
                dropdown[i].addEventListener("click", function () {
                    this.classList.toggle("active");
                    var dropdownContent = this.nextElementSibling;
                    if (dropdownContent.style.display === "block") {
                        dropdownContent.style.display = "none";
                    } else {
                        dropdownContent.style.display = "block";
                    }
                });
            }
        </script>

    </body>
</html> 

</body>
</html> 
