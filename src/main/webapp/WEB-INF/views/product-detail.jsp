<%@ page isELIgnored="false"%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>

<div class="product-info row">
	<div class="col-md-2 category">
		
	</div>
	<div class="col-md-7 products">
		<div><img src="<c:out value="../${productDetail.imageUrl}"></c:out>" alt="<c:out value="${productDetail.name}"></c:out>"/></div>
		<div><h3>${productDetail.name}</h3></div>
		<div><h4>${productDetail.category} - ${productDetail.language}</h4></div>
		<div class="price">$${productDetail.sallingPrice} - <del>$${productDetail.originalPrice}</del>
		</div>
		<div><c:out value="${productDetail.summary}"></c:out></div>
	</div>
	<div class="col-md-3 right-ads"></div>
</div>

