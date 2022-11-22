<%--
  Created by IntelliJ IDEA.
  User: Rodrigo
  Date: 16-10-2022
  Time: 7:52
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html>
  <body>
    <div class="container-fluid">
      <%@include file="menu.jsp"%>
      <spring:url value ="/contacto/guardar" var ="guardarURL" htmlEscape = "true"/>
      <form:form modelAttribute="contactoForm" method="post" action="${guardarURL}" cssClass="form">
        <form:hidden path="idContacto"/>
        <div class="row justify-content-center align-items-center h-100">
           <div class="col-sm-6" id="contact-form">
                <h1>Formulario de contacto</h1>
                <h3>Escríbenos y en breve nos pondremos en contacto</h3>

                <div class="form-group">
                  <label for="nombre">Nombre Contacto</label>
                  <form:input path="nombreContacto" cssClass="form-control" id="nombre"
                              required="obligatorio" placeholder="Tu nombre"/>
                </div>

                <div class="form-group">
                  <label for="email">Email Contacto</label>
                  <form:input path="emailContacto" cssClass="form-control" id="email"
                              required="obligatorio" placeholder="Tu Email"/>
                </div>

                <div class="form-group">
                  <label for="telefono">Telefono Contacto</label>
                  <form:input path="telefonoContacto" cssClass="form-control" id="telefono"
                              required="obligatorio" placeholder="Tu telefono"/>
                </div>

                <div class="form-group">
                  <label for="mensaje">Mensaje Contacto</label>
                  <form:input path="mensajeContacto" cssClass="form-control" id="mensaje"
                              required="obligatorio" placeholder="Tu mensaje"/>
                </div>
                <div class="btn-group">
                  <button type="submit"  class="btn btn-primary btn-sm">Enviar</button>
                </div>
                <div class="btn-group">
                  <button type="reset"  class="btn btn-primary btn-sm">Limpiar</button>
                </div>
           </div>
        </div>
      </form:form>
    </div>
    <%@ include file="footer.jsp"%>
    <script src="https://cdn.jsdelivr.net/npm/jquery@3.5.1/dist/jquery.slim.min.js" integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js" integrity="sha384-9/reFTGAW83EW2RDu2S0VKaIzap3H66lZH81PoYlFhbGU+6BZp6G7niu735Sk7lN" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/js/bootstrap.min.js" integrity="sha384-+sLIOodYLS7CIrQpBjl+C7nPvqq+FbNUBDunl/OZv93DB7Ln/533i8e/mZXLi/P+" crossorigin="anonymous"></script>
  </body>
</html>
