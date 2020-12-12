<%@ page isELIgnored="false"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>

<div class="login">
	<form:form method="post" modelAttribute="user" action="register">
		<h1>Account Register</h1>

        <h3>Email Address*</h3>
		<input type='text' name='email'>
		
		<h3>Fullname*</h3>
		<input type='text' name='fullName'>
		
		<h3>Phone Number*</h3>
        <input type='text' name='phoneNumber'>

        <h3>Password*</h3>
		<input type='password' name='password' />
		
		<h3>Confirmed Password*</h3>
        <input type='password' name='confirmPassword' />

        <button class="btn btn-warning button" type="submit">REGISTER</button>
	</form:form>
</div>

 <script>
 function check() {
	    if(document.getElementById('password').value ===
	       document.getElementById('confirmPassword').value) {
	    	
	        document.getElementById('message').innerHTML = "match";
	        
	    } else {
	    	
	        document.getElementById('message').innerHTML = "no match";
	        
	    }
	}
 </script>