<%@ page contentType="text/html; charset=UTF-8"%>
<%@ page isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<div class="header">
	<div class="header-top">
	    <div class="row">
	        <div class="col-md-4"><img alt="Logo" src="<c:url value="/static/asset/logo.png"  />"></div>
	        <div class="col-md-5">
                <div class="container h-100">
                      <div class="d-flex justify-content-center h-100">
                        <div class="searchbar">
                          <input class="search_input" type="text" name="" placeholder="Search...">
                          <a href="#" class="search_icon"><i class="glyphicon glyphicon-search"></i></a>
                        </div>
                      </div>
                    </div>
	        </div>
	        <div class="col-md-1"><span><a href="/#"><i class="glyphicon glyphicon-shopping-cart"></i></a></span></div>
	        <div class="col-md-2"><span><a href="<c:url value='http://localhost:8080/bookstore/auth/login' />"><i class="glyphicon glyphicon-user"></i></a></span></div>
	    </div>
	</div>
	<div class="header-bottom">
	    <div class="navigation-bar">
	        <ul>
                <li><a class="active" href="http://localhost:8080/bookstore/home">HOME</a></li>
                <c:forEach items="${categories}" var="category">
                <li><a href="#news">${category}</a></li>
                </c:forEach>

            </ul>
	    </div>
	</div>
</div>