<%@ page isELIgnored="false"%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<%@ page contentType="text/html; charset=UTF-8"%>

<div class="product-info row">
    <div class="col-md-2 category"> </div>       
   
    <div class="col-md-6 products">
       <div><img src="<c:out value="/bookstore/static/asset/product-img/${productDetail.imageUrl}"></c:out>" alt="<c:out value="${productDetail.name}"></c:out>"/></div>
       <div><c:out value="${productDetail.name}"></c:out></div>
		<div><c:out value="${productDetail.category.name}"></c:out> - <c:out value="${productDetail.langbook.name}"></c:out></div>              
 		<div class="price">$<c:out value="${productDetail.sallingPrice}"></c:out> 
 				<del> $<c:out value="${productDetail.originalPrice}"></c:out></del>
 				<div> <c:out value="${productDetail.description}"></c:out></div>
          </div>
    </div>
    <div class="col-md-2 "></div>
</div>