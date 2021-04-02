<%@ page contentType="text/html; charset=UTF-8"%>
<%@ page isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<div class="home">
    <div class="banner"><img alt="Product" src="<c:url value="/static/asset/banner.jpg"/>"></div>
    <div class="products">
        <ul>
            <c:forEach items="${commonData.products}" var="product">
                <li >
                    <div class="product">
                        <a href="/bookstore/product/${product.id}"><img alt="Product" src="${product.imageUrl}"></a>
                        <h3>${product.name}</h3>
                        <h4>${product.category}</h4>
                        <b><i>${product.sallingPrice}</i></b>
                    </div>
                </li>
            </c:forEach>
         </ul>
    </div>
</div>