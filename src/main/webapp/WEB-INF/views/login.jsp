<%@ page isELIgnored="false"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>

<div class="login">
	<form name='login' action="<c:url value='/api-login' />" method='POST'>
		<h1>Account Login</h1>
		
		<h3>Email address*</h3>
		<input type='text' name='email'>
		
		<h3>Password*</h3>
		<input type='password' name='password' />
		
		<button class="btn btn-warning button" type="submit">SIGN IN</button>
		<a href="http://localhost:8080/bookstore/auth/register" class="btn btn-primary button">REGISTER</a>
		<a href="/#">Forget your password</a>

		<input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}" />
	</form>
</div>
