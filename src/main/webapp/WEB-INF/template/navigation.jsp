<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<div class="navigation">
    <div class="block-information">
        <h4>BEST SELLER</h4>
        <ul>
            <li><a href="#">
                <span><img alt="Product" src="<c:url value="/static/asset/book.jpg" />"></span></a>
                <span>Java Programming</span>
            </li>
            <li>
                <span><img alt="Product" src="<c:url value="/static/asset/book.jpg" />"></span></a>
                <span>C# Programming</span>
            </li>
            <li>
                <span><img alt="Product" src="<c:url value="/static/asset/book.jpg" />"></span></a>
                <span>Database</span>
            </li>
            <li>
                <span><img alt="Product" src="<c:url value="/static/asset/book.jpg" />"></span></a>
                <span>HTM, CSS & JavaScript</span>
            </li>
            <li>
                <span><img alt="Product" src="<c:url value="/static/asset/book.jpg" />"></span></a>
                <span>Algothirm</span>
            </li>
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