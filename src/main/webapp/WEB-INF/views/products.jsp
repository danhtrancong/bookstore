<%@ page isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<div class="product-info row">
	<div class="col-md-2 category">
		<h3>Categories</h3>
		<ul>
		<c:forEach items="${product.categories}" var="category"> 
			<li><a href='#'><c:out value="${category.name}"></c:out></a></li>
		</c:forEach>
		<h3>Language Book</h3>
		<c:forEach items="${product.langbooks}" var="langbook"> 
			<li><a href='#'><c:out value="${langbook.name}"></c:out></a></li>								
		</c:forEach>
		</ul>
	</div>
	<div class="col-md-9 products"></div>
	<div class="col-md-2"></div>
</div>



