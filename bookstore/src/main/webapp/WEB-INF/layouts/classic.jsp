<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<%@ page isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<html>
<head>
<title><tiles:getAsString name="title" /></title>
<link href="<c:url value='/css/style.css' />" rel="stylesheet"></link>
</head>

<body>
	<div><tiles:insertAttribute name="header" /></div>
	<div><tiles:insertAttribute name="navigation" /></div>
	<div><tiles:insertAttribute name="body" /></div>
	<div><tiles:insertAttribute name="footer" /></div>
</body>
</html>