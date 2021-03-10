<%@ page contentType="text/html; charset=UTF-8"%>
<%@ page isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<div class="navigation">
    <div class="block-information">
        <h4>BEST SELLER</h4>
        <ul>
             <c:forEach items="${commonData.bestSellingProducts}" var="product">
                 <li>
                     <span><img alt="Best-Selling-Product" src="<c:url value="${product.imageUrl}" />"></span>
                     <a href="#${product.id}"><c:out value="${product.name}" /></a>
                 </li>
             </c:forEach>
        </ul>
    </div>
    <div class="block-information">
        <h4>FILTER</h4>
        <div class="filter">
            <label>Prices</label><br/>
            <input type="checkbox"> $ 10 - $ 50<br/>
            <input type="checkbox"> $ 50 - $ 100<br/>
            <input type="checkbox"> $ 100 - $ 200<br/>
        </div>
        <div class="filter">
            <label>Langues</label><br/>
            <input type="checkbox"> English<br/>
            <input type="checkbox"> Vietnamese<br/>
        </div>
        <div class="filter">
            <label>Sizes</label><br/>
            <input type="checkbox"> Small<br/>
            <input type="checkbox"> Medium<br/>
            <input type="checkbox"> Large<br/>
        </div>
        <div class="btn-search"><button class="btn btn-info">SEARCH</button></div>
    </div>
</div>