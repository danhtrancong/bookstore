<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page isELIgnored="false"%>
<%@ page contentType="text/html; charset=UTF-8" %>

<html>
<head>
	<title><tiles:getAsString name="title" /></title>

    <script src="<c:url value="/js/jquery-3.3.1.min.js"/>"></script>
	<script src="<c:url value="/css/bootstrap-4.4.1/popper.min.js" />"></script>
	<script src="<c:url value="/css/bootstrap-4.4.1/bootstrap.min.js" />"></script>
    <script src="<c:url value="/js/bootstrap.min.js"/>"></script>
    <script src="<c:url value="/js/jquery-ui.min.js"/>"></script>
    <script src="<c:url value="/js/jquery.countdown.min.js"/>"></script>
    <script src="<c:url value="/js/jquery.nice-select.min.js"/>"></script>
    <script src="<c:url value="/js/jquery.zoom.min.js"/>"></script>
    <script src="<c:url value="/js/jquery.dd.min.js"/>"></script>
    <script src="<c:url value="/js/jquery.slicknav.js"/>"></script>
    <script src="<c:url value="/js/owl.carousel.min.js"/>"></script>
    <script src="<c:url value="/js/main.js"/>"></script>

    <link href="<c:url value="/css/bootstrap-4.4.1/bootstrap.min.css" />" rel="stylesheet">
    <link href="<c:url value="/css/bootstrap-4.4.1/bootstrap-glyphicons.css" />" rel="stylesheet">
    <link href="<c:url value="/css/jquery-ui-1.12.1.css" />" rel="stylesheet" type="text/css">
    <link href="<c:url value="/css/style.css" />" rel="stylesheet" type="text/css">

</head>

<body>
	<div>
		<tiles:insertAttribute name="header" />
	</div>
	<div class="my-container row">
	    <div class="col-md-3"><tiles:insertAttribute name="navigation" /></div>
	    <div class="col-md-9 body"><tiles:insertAttribute name="body" /></div>
	</div>
	<div>
		<tiles:insertAttribute name="footer" />
	</div>
</body>
</html>