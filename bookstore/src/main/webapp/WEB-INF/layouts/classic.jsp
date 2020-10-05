<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<%@ page isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<html>
<head>
	<title><tiles:getAsString name="title" /></title>
	<link href="<c:url value="/css/bootstrap-4.4.1/bootstrap.min.css" />" rel="stylesheet">
	<link href="<c:url value="/css/bootstrap-4.4.1/bootstrap-glyphicons.css" />" rel="stylesheet">
	<link href="<c:url value="/css/jquery-ui-1.12.1.css" />" rel="stylesheet">
	<link href="<c:url value="/css/style.css" />" rel="stylesheet">

	<script src="<c:url value="/js/jquery-1.12.4.js" />"></script>
	<script src="<c:url value="/css/bootstrap-4.4.1/popper.min.js" />"></script>
	<script src="<c:url value="/css/bootstrap-4.4.1/bootstrap.min.js" />"></script>
	<script src="<c:url value="/js/jquery-ui-1.12.1.js" />"></script>
</head>

<body>
	<div><tiles:insertAttribute name="header" /></div>
	<div><tiles:insertAttribute name="navigation" /></div>
	<div><tiles:insertAttribute name="body" /></div>
	<div><tiles:insertAttribute name="footer" /></div>
</body>
</html>