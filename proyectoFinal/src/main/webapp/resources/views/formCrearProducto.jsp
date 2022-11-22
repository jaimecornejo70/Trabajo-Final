<%@ page contentType="text/html;charset=UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%--
  Created by IntelliJ IDEA.
  User: Rodrigo
  Date: 20-10-2022
  Time: 20:07
  To change this template use File | Settings | File Templates.
--%>
<html>
   <body>
        <div class="container-fluid">
            <%@include file="menu.jsp"%>
            <spring:url value ="/product/guardar" var ="guardarURL" htmlEscape = "true"/>
            <form:form modelAttribute="productoForm" method="post" action="${guardarURL}" cssClass="form">
                <form:hidden path="idProducto"/>

                <div class="form-row">
                    <div class="form-group col-md-4">
                        <label for="nombre">Nombre</label>
                        <form:input path="nombreProducto" cssClass="form-control" id="nombre"/>
                    </div>
                    <div class="form-group col-md-4">
                        <label for="marca">Marca</label>
                        <form:input path="marcaProducto" cssClass="form-control" id="marca"/>
                    </div>
                    <div class="form-group col-md-4">
                        <label for="tipo">Tipo</label>
                        <form:input path="tipoProducto" cssClass="form-control" id="tipo"/>
                    </div>
                    <div class="form-group col-md-4">
                        <label for="precio">Precio</label>
                        <form:input path="precioProducto" cssClass="form-control" id="precio"/>
                    </div>
                    <div class="form-group col-md-4">
                        <label for="stock">Stock</label>
                        <form:input path="stockProducto" cssClass="form-control" id="stock"/>
                    </div>
                </div>
                <button type="submit" class="btn btn-primary">Guardar</button>
            </form:form>
        </div>
                <%@ include file="footer.jsp"%>
                <script src="https://cdn.jsdelivr.net/npm/jquery@3.5.1/dist/jquery.slim.min.js" integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj" crossorigin="anonymous"></script>
                <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js" integrity="sha384-9/reFTGAW83EW2RDu2S0VKaIzap3H66lZH81PoYlFhbGU+6BZp6G7niu735Sk7lN" crossorigin="anonymous"></script>
                <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/js/bootstrap.min.js" integrity="sha384-+sLIOodYLS7CIrQpBjl+C7nPvqq+FbNUBDunl/OZv93DB7Ln/533i8e/mZXLi/P+" crossorigin="anonymous"></script>
    </body>
</html>
