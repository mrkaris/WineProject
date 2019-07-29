<!DOCTYPE html>
<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1">
<style>
body {
  font-family: "Lato", sans-serif;
}

.sidebar {
  height: 100%;
  width: 0;
  position: fixed;
  z-index: 1;
  top: 0;
  left: 0;
  background-color: #820233;;
  overflow-x: hidden;
  transition: 0.5s;
  padding-top: 60px;
}

.sidebar a, h5 {
  padding: 8px 8px 8px 32px;
  text-decoration: none;
  font-size: 25px;
  color: white;
  display: block;
  transition: 0.3s;
}

h5 {
  padding: 8px 8px 8px 32px;
  text-decoration: none;
  font-size: 20px;
  color: white;
  display: block;
  transition: 0.3s;
}

.sidebar a:hover {
  color: #f1f1f1;
}

.sidebar .closebtn {
  position: absolute;
  top: 0;
  right: 25px;
  font-size: 36px;
  margin-left: 50px;
}

.openbtn {
  font-size: 20px;
  cursor: pointer;
  background-color: #111;
  color: white;
  padding: 10px 15px;
  border: none;
}

.openbtn:hover {
  background-color: #444;
}

#main {
  transition: margin-left .5s;
  padding: 25px;
}

.dropdown-btn {
  padding: 6px 8px 6px 16px;
  text-decoration: none;
  font-size: 20px;
  color: white !important;
  display: block;
  border: none;
  background: none;
  width: 100%;
  text-align: left;
  cursor: pointer;
  outline: none;
}

.fa-caret-down {
  float: right;
  padding-right: 8px;
}

.dropdown-btn:hover {
    color: darkred;
}

.active {
    background-color: #a6a6a6;
    color: white;
}


/* On smaller screens, where height is less than 450px, change the style of the sidenav (less padding and a smaller font size) */
@media screen and (max-height: 450px) {
  .sidebar {padding-top: 15px;}
  .sidebar a {font-size: 18px;}
}
</style>
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
  document.getElementById("main").style.marginLeft= "0";
}
</script>
<script>
/* Loop through all dropdown buttons to toggle between hiding and showing its dropdown content - This allows the user to have multiple dropdowns without any conflict */
var dropdown = document.getElementsByClassName("dropdown-btn");
var i;

for (i = 0; i < dropdown.length; i++) {
  dropdown[i].addEventListener("click", function() {
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
