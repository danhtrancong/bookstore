<%@ page isELIgnored="false"%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>

<div class="product-info row">
	<div class="col-md-2 category">
		<h3>Categories</h3>
		<ul>
		<c:forEach items="${product.categories}" var="category">
			<li><c:out value="${category.name}"></c:out></li>
		</c:forEach>
		</ul>
	</div>
	<div class="col-md-7 products"></div>
	<div class="col-md-3 right-ads"></div>
</div>