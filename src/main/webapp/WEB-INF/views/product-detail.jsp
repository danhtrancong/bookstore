<%@ page isELIgnored="false"%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>

<div class="product-info row">
	<div class="col-md-9 product-detail">
		<div><img src="../${productDetail.imageUrl}" alt="${productDetail.name}"/></div>
		<div><h3>${productDetail.name}</h3></div>
		<div><h4>${productDetail.category} - ${productDetail.language}</h4></div>
		<div class="price">$${productDetail.sallingPrice} - <del>$${productDetail.originalPrice}</del>
		</div>
		<div>${productDetail.summary}</div>
	</div>
	<div class="col-md-3 right-ads"></div>
</div>