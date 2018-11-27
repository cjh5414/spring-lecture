<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>

<div class="contain-wrapper">
    <div class="container">
        <h1>Edit Product</h1>
        <p class="lead">Fill the below information to edit a product:</p>

        <sf:form action="${pageContext.request.contextPath}/admin/productInventory/editProduct/${product.id}" method="post"
                 modelAttribute="product">

            <%--<sf:hidden path="id"/>--%>

            <div class="form-group">
                <label for="name">Name</label>
                <sf:input path="name" id="name" class="form-control"/>
            </div>
            <div class="form-group">
                <label for="category">Category: </label>
                <sf:radiobutton path="category" id="category" value="컴퓨터"/> 컴퓨터
                <sf:radiobutton path="category" id="category" value="가전"/> 가전
                <sf:radiobutton path="category" id="category" value="신발"/> 신발
            </div>

            <div class="form-group">
                <label for="description">Description</label>
                <sf:textarea path="description" id="description" class="form-control"/>
            </div>

            <div class="form-group">
                <label for="price">Price</label>
                <sf:input path="price" id="price" class="form-control"/>
            </div>

            <div class="form-group">
                <label for="unitInStock">UnitInStock</label>
                <sf:input path="unitInStock" id="unitInStock" class="form-control"/>
            </div>

            <div class="form-group">
                <label for="manufacturer">manufacturer</label>
                <sf:input path="manufacturer" id="manufacturer" class="form-control"/>
            </div>

            <input type="submit" value="submit" class="btn btn-default">
            <a href="<c:url value="/admin/productInventory"/>" class="btn btn-default">Cancel</a>
        </sf:form>
    </div>
</div>