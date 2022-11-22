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
    <spring:url value ="/partner/guardar" var ="guardarURL" htmlEscape = "true"/>
    <form:form modelAttribute="partnerForm" method="post" action="${guardarURL}" cssClass="form">
        <form:hidden path="idPartner"/>
        <div class="form-row">

            <div class="form-group col-md-4">
                <label for="nombre">Nombre partner</label>
                <form:input path="nombrePartner" cssClass="form-control" id="nombre"/>
            </div>
            <div class="form-group col-md-4">
                <label for="rut">Rut partner</label>
                <form:input path="rutPartner" cssClass="form-control" id="rut"/>
            </div>
            <div class="form-group col-md-4">
                <label for="direccion">Direccion partner</label>
                <form:input path="direccionPartner" cssClass="form-control" id="direccion"/>
            </div>
            <div class="form-group col-md-4">
                <label for="telefono">Teléfono partner</label>
                <form:input path="telefonoPartner" cssClass="form-control" id="telefono"/>
            </div>
            <div class="form-group col-md-4">
                <label for="email">Email partner</label>
                <form:input path="emailPartner" cssClass="form-control" id="email"/>
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
</html><%--
  Created by IntelliJ IDEA.
  User: Rodrigo
  Date: 15-11-2022
  Time: 16:03
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

</body>
</html>
