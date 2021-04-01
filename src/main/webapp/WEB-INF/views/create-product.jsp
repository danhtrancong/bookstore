<%@ page isELIgnored="false"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>

<div class="create-product">
	<div class="col-md-9 create-product-detail">
	            <form:form method="post" modelAttribute="product" action="save" enctype="multipart/form-data">
                     <table>
                         <tr>
                            <td>id: </td>
                            <td><input type="text" name="id" /></td>
                        </tr>
                        <tr>
                           <td>Book Name: </td>
                           <td><input type="text" name="name" /></td>
                        </tr>
                        <tr>
                            <td>Original price: </td>
                            <td><input type="text" name="originalPrice" /></td>
                        </tr>
                        <tr>
                            <td>Selling price: </td>
                            <td><input type="text" name="sallingPrice" /></td>
                        </tr>
                        <tr>
                            <td>Book image: </td>
                            <td><input type="text" name="imageUrl" /></td>
                        </tr>
                        <tr>
                            <td>File: </td>
                            <td><input type="file" name="file" /></td>
                        </tr>
                        <tr>
                            <td>category: </td>
                            <td><input type="text" name="category" /></td>
                        </tr>
                        <tr>
                            <td>Language: </td>
                            <td><input type="text" name="language" /></td>
                        </tr>
                        <tr>
                            <td>Summary: </td>
                            <td><textarea name="summary" />Enter book summary here...</textarea></td>
                        </tr>
                        <tr>
                            <td></td>
                            <td>
                              <button class="btn-save button" type="submit">Create</button>
                            </td>
                        </tr>
                     </table>
                  </form:form>
	</div>
	<div class="col-md-3 right-ads"></div>
</div>