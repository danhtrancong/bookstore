<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page isELIgnored="false"%>
<%@ page contentType="text/html; charset=UTF-8" %>

<html>
<head>
	<title><tiles:getAsString name="title" /></title>

	<link href="<c:url value="/css/bootstrap-4.4.1/bootstrap.min.css" />" rel="stylesheet">
	<link href="<c:url value="/css/bootstrap-4.4.1/bootstrap-glyphicons.css" />" rel="stylesheet">
	<link href="<c:url value="/css/jquery-ui-1.12.1.css" />" rel="stylesheet">
	
	<link href="<c:url value="/css/style.css" />" rel="stylesheet" type="text/css">
	<link href="<c:url value="https://fonts.googleapis.com/css?family=Muli:300,400,500,600,700,800,900&display=swap" />" rel="stylesheet">

    
    <link href="<c:url value="/css/bootstrap-4.4.1/font-awesome.min.css"  />" rel="stylesheet" type="text/css">
    <link href="<c:url value="/css/bootstrap-4.4.1/themify-icons.css"  />" rel="stylesheet" type="text/css">
   	<link href="<c:url value="/css/bootstrap-4.4.1/elegant-icons.css"  />" rel="stylesheet" type="text/css">
    <link href="<c:url value="/css/bootstrap-4.4.1/owl.carousel.min.css"  />" rel="stylesheet" type="text/css">
    <link href="<c:url value="/css/bootstrap-4.4.1/nice-select.css"  />" rel="stylesheet" type="text/css">
    <link href="<c:url value="/css/bootstrap-4.4.1/slicknav.min.css"  />" rel="stylesheet" type="text/css">
    
	
	<script src="<c:url value="/js/jquery-3.3.1.min.js"/>"></script>
    <script src="<c:url value="/js/bootstrap.min.js"/>"></script>
    <script src="<c:url value="/js/jquery-ui.min.js"/>"></script>
    <script src="<c:url value="/js/jquery.countdown.min.js"/>"></script>
    <script src="<c:url value="/js/jquery.nice-select.min.js"/>"></script>
    <script src="<c:url value="/js/jquery.zoom.min.js"/>"></script>
    <script src="<c:url value="/js/jquery.dd.min.js"/>"></script>
    <script src="<c:url value="/js/jquery.slicknav.js"/>"></script>
    <script src="<c:url value="/js/owl.carousel.min.js"/>"></script>
    <script src="<c:url value="/js/main.js"/>"></script>
	
</head>

<body>
	<div>
		<tiles:insertAttribute name="header" />
	</div>
	<div>
		<tiles:insertAttribute name="navigation" />
	</div>
	<div>
		<tiles:insertAttribute name="body" />
	</div>
	<div>
		<tiles:insertAttribute name="footer" />
	</div>
</body>
</html>