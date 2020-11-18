<%@ page isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page contentType="text/html; charset=UTF-8"%>
<div class="product-info row">
	<div class="col-md-2 category">
		<h3>Categories</h3>
		<ul>
			<c:forEach items="${productsView.categories}" var="category">
				<li><a href='#'><c:out value="${category.name}"></c:out></a></li>
			</c:forEach>
			<h3>Language Book</h3>
			<c:forEach items="${productsView.langbooks}" var="langbook">
				<li><a href='#'><c:out value="${langbook.name}"></c:out></a></li>
			</c:forEach>
		</ul>
	</div>

	<div id="title-sanpham">
		<span>LIST BOOK</span>
		<div class="row" style="margin-top:42px">
			<c:forEach var="product" varStatus="productCounter" items="${productsView.products}">
				<div class="col-md-2 col-sm-8 product">
					<a href="product-detail/${product.id}}">
						<img alt="img" src='<c:url value="../static/asset/product-img/${product.imageUrl}"/>' /><br/>
							<span>${product.name}</span><br/></a>
							<span class="price">${product.sallingPrice} VNĐ</span>
							<del>$<c:out value="${product.originalPrice}"></c:out></del>
					
				</div>
			            <c:if test="${productCounter.count % 3 == 0}"></tr><tr></c:if>
			</c:forEach>
	</div>
		
	</div>

	<div class="col-md-2"></div>
</div>