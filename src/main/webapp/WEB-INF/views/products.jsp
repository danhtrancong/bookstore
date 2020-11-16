<%@ page isELIgnored="false"%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>

<div class="product-info row">
	<div class="col-md-2 category">
		<h3>Categories</h3>
		<ul>
			<c:forEach items="${productView.categories}" var="category">
				<li><c:out value="${category.name}"></c:out></li>
			</c:forEach>
		</ul>
		<h3>Languages</h3>
		<ul>
			<c:forEach items="${productView.languages}" var="language">
				<li><c:out value="${language.name}"></c:out></li>
			</c:forEach>
		</ul>
	</div>
	<div class="col-md-7 products">
		<table>
			<tr>
			<c:forEach items="${productsView.products}" var="product" varStatus="productCounter">
				
				<td>
					<div class="product-item">
						<div><a href="product/<c:out value="${product.id}"></c:out>"><img src="<c:out value="${product.imageUrl}"></c:out>" /></a></div>
						<div class="product-category"><c:out value="${product.category.name}"></c:out> - <c:out value="${product.language.name}"></c:out></div>
						<div><c:out value="${product.name}"></c:out></div>
						<div class="price">$<c:out value="${product.sallingPrice}"></c:out> 
							<del> $<c:out value="${product.originalPrice}"></c:out></del>
						</div>
					</div>	
				</td>
				<c:if test="${productCounter.count % 3 == 0}"></tr><tr></c:if>
			</c:forEach>
		</table>
	</div>
	<div class="col-md-3 right-ads"></div>
</div>