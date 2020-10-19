<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ page isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<div style="background: #E0E0E0; height: 55px; padding: 5px;">
  <div style="float: left">
     <h1>My Site</h1>
  </div>
 
  <div style="float: right; padding: 10px; text-align: right;">
 
     Search <input name="search">
 
  </div>

	<div class="authbar">
	 <span class="floatRight"><a href="<c:url value="/logout" />">Logout</a></span>
	</div>

</div>