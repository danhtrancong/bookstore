<%@ page contentType="text/html; charset=UTF-8"%>
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
	        <div class="col-md-1"><span><i class="glyphicon glyphicon-shopping-cart"></i></span></div>
	        <div class="col-md-2"><span><i class="glyphicon glyphicon-user"></i></span></div>
	    </div>
	</div>
	<div class="header-bottom">
	    <div class="navigation-bar">
	        <ul>
                <li><a class="active" href="#home">HOME</a></li>
                <li><a href="#news">COMICS & GRAPHIC</a></li>
                <li><a href="#contact">ART & PHOTOGRAPHY</a></li>
                <li><a href="#about">FOOD & COOKBOOKS</a></li>
                <li><a href="#about">HISTORY</a></li>
                <li><a href="#about">MEDICAL</a></li>
                <li><a href="#about">TRAVEL</a></li>
                <li><a href="#about">TECHNOLOGIES</a></li>
            </ul>
	    </div>
	</div>
</div>