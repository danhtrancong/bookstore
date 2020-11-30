<%@ page isELIgnored="false"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>

<div class="register-form">
	<form:form method="post" modelAttribute="user" action="register">
		<h1>Register</h1>
		<h3 class="lbl-email">Email address*  </h3>
		<c:if test="${not empty errors['email']}">
		<span style="color: #ff0000;">
			<c:out value="${errors['email']}"></c:out>
		</span>
		</c:if>
		<form:input path="email" type="text" /><br>
		
		<h3 class="lbl-name">Full Name *  </h3>
		<c:if test="${not empty errors['fullName']}">
		<span style="color: #ff0000;">
			<c:out value="${errors['fullName']}"></c:out>
		</span>
		</c:if>
		<form:input path="fullName" type="text" /><br>
		
		<h3 class="lbl-phone">Phone Number  </h3>
		<form:input path="phonNumber" type="text" /><br>
		
		<h3 class="lbl-psw">Password *  </h3>
		<c:if test="${not empty errors['password']}">
		<span style="color: #ff0000;">
			<c:out value="${errors['password']}"></c:out>
		</span>
		</c:if>
		<form:input path="password" type="password" id="password"/><br>
		
		<h3 class="lbl-psw">Confirm Password *  </h3>
		<c:if test="${not empty errors['confirmPassword']}">
		<span style="color: #ff0000;">
			<c:out value="${errors['confirmPassword']}"></c:out>
		</span>
		</c:if>
		<form:input path="confirmPassword" type="password" id="confirmPassword" onchange="check()" /><br>
		
		<c:if test="${not empty errors['execptionalMessage']}">
		<span style="color: #ff0000;">
			<c:out value="${errors['execptionalMessage']}"></c:out>
		</span>
		</c:if>
		
		<button type="submit" value="submit">REGISTER</button><br>
		
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