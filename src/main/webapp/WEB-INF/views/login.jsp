<%@ page isELIgnored="false"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>

<div class="login">
	<form name='login' action="<c:url value='/api-login' />" method='POST'>
		<h1>Login</h1>
		<h3>Email address*</h3>
		<input type='text' name='email' value=''>
		
		<h3 class="lbl-psw">Password*</h3>
		<input type='password' name='password' />
		
		<input class="loginBtn" name="submit" type="submit" value="SIGN IN" /> </br>
		<a href="#">Forget your password</a> 
		<input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}" />
	</form>
</div>
