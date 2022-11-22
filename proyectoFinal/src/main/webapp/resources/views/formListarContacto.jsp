<%--
  Created by IntelliJ IDEA.
  User: Rodrigo
  Date: 15-11-2022
  Time: 21:41
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
  <title>Super Ahorro</title>
  <link rel="icon" href="/resources/img/icono.png" class="rounded-0">
  <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet"
        integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
</head>
<div class="container-fluid">
  <%@include file="menu.jsp" %>
  <table class="table table-bordered">
    <thead>
    <tr>
      <th scope="col">Id</th>
      <th scope="col">Nombre</th>
      <th scope="col">Email</th>
      <th scope="col">Teléfono</th>
      <th scope="col">Mensaje</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach var="contactos" items="${contactos}">
      <tr>
        <td>${contactos.idContacto}</td>
        <td>${contactos.nombreContacto}</td>
        <td>${contactos.emailContacto}</td>
        <td>${contactos.telefonoContacto}</td>
        <td>${contactos.mensajeContacto}</td>
      </tr>
    </c:forEach>
    </tbody>
  </table>
  <spring:url value="/contacto/agregar" var="crearURL"/>
  <a class="btn  btn-info" href="${crearURL}" role="button">Agregar contacto</a>
</div>
<%@ include file="footer.jsp" %>
<script src="https://cdn.jsdelivr.net/npm/jquery@3.5.1/dist/jquery.slim.min.js"
        integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj"
        crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js"
        integrity="sha384-9/reFTGAW83EW2RDu2S0VKaIzap3H66lZH81PoYlFhbGU+6BZp6G7niu735Sk7lN"
        crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/js/bootstrap.min.js"
        integrity="sha384-+sLIOodYLS7CIrQpBjl+C7nPvqq+FbNUBDunl/OZv93DB7Ln/533i8e/mZXLi/P+"
        crossorigin="anonymous"></script>
</body>
</html>
