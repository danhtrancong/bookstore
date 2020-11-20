<%@ page isELIgnored="false"%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>

<div class="product-info row">
	<div class="col-md-2 category">
		
	</div>
	<div class="col-md-7 products">
		<div><img src="<c:out value="../${productDetail.imageUrl}"></c:out>" alt="<c:out value="${productDetail.name}"></c:out>"/></div>
		<div><c:out value="${productDetail.name}"></c:out></div>
		<div><c:out value="${productDetail.category}"></c:out> - <c:out value="${productDetail.language}"></c:out></div>
		<div class="price">$<c:out value="${productDetail.sallingPrice}"></c:out> 
			<del> $<c:out value="${productDetail.originalPrice}"></c:out></del>
		</div>
		<div><c:out value="${productDetail.summary}"></c:out></div>
	</div>
	<div class="col-md-3 right-ads"></div>
</div>