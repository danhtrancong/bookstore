<%@ page contentType="text/html; charset=UTF-8"%>
<%@ page isELIgnored="false"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<div class="col-md-9 add-product-detail">
    <form:form action = "save" modelAttribute="product" method='POST'>
         <h1>Creat Book </h1>
            <h3>Book Name</h3></br>
            <input type="text" name="name" class="form-control" placeholder="Enter book name here"/></br>

            <h3>Original price </h3></br>
            <input type="text" name="originalPrice" class="form-control" placeholder="Enter original price here"/></br>

            <h3>Selling price  </h3></br>
            <input type="text" name="sallingPrice" class="form-control" placeholder="Enter selling price here"/></br>

            <h3 for="category">Thể Loại</h3></br>
             <select name="category">
            <c:forEach items="${commonData.categories}" var="category">
             <option value="${category.id}">${category.name}</option>
            </c:forEach>
          </select>

            </br>

            <h3>Description book </h3></br>
              <textarea rows="10" type="text" placeholder="Enter book summary here" ></textarea></br>

            <h3>Book image </h3></br>
              <input type="text" name="imageUrl" /></br>
            <tr>
                 <td>Language: </td>
                 <td><input type="text" name="language" /></td>
            </tr>

            <p>
              <button class="btn-save button" type="submit">Create</button>
            </p>
    </form:form>
</div>



