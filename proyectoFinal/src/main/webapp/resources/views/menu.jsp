<%--
  Created by IntelliJ IDEA.
  User: Rodrigo
  Date: 15-10-2022
  Time: 12:52
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html>
    <title>Super Ahorro</title>

    <link  rel=" stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css"
        integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
    <nav class="navbar navbar-expand-lg navbar-light bg-light">
        <sec:authorize access= "!isAuthenticated()">
            <a class="navbar-brand" href="${pageContext.request.contextPath}/login">Ingresar</a>
            <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarNavDropdown"
                   aria-controls="navbarNavDropdown" aria-expanded="false" aria-label="Toggle navigation">
                <span class="navbar-toggler-icon"></span>
            </button>
        </sec:authorize>
        <div class="container-fluid">
            <div class="collapse navbar-collapse" id="navbarNavDropdown">
                <ul class="navbar-nav me-auto mb-2 mb-lg-0">
                <li class="nav-item active">
                    <a class="nav-link" href="${pageContext.request.contextPath}/begin">Conózcanos</a>
                </li>
                <li class="nav-item active">
                    <a class="nav-link" href="${pageContext.request.contextPath}/contacto/agregar">Contacto</a>
                </li>
                <li class="nav-item active">
                    <a class="nav-link" href="${pageContext.request.contextPath}/partner/ver">Supermercados</a>
                </li>
                <li class="nav-item active">
                    <div class="dropdown">
                        <a class="btn btn-secondary dropdown-toggle" type="button" id="dropdownMenu2Button"
                           data-toggle="dropdown"  aria-haspopup="true" aria-expanded="false">
                            Ver +
                        </a>
                        <div class="dropdown-menu" aria-labelledby="dropdownMenuButton">
                            <a class="dropdown-item" href="${pageContext.request.contextPath}/partner/lista">Listar Partners</a>
                            <sec:authorize access=" hasAnyAuthority('Administrador')">
                            <a class="dropdown-item" href="${pageContext.request.contextPath}/partner/agregar">Crear Partners</a>
                            </sec:authorize>

                        </div>
                    </div>
                <li class="nav-item active">
                    <a class="nav-link" href="${pageContext.request.contextPath}/product/ver">Productos</a>
                </li>
                <li class="nav-item active">
                    <div class="dropdown">
                        <a class="btn btn-secondary dropdown-toggle" type="button" id="dropdownMenu3Button"
                            data-toggle="dropdown"  aria-haspopup="true" aria-expanded="false">
                            Ver +
                        </a>
                        <div class="dropdown-menu" aria-labelledby="dropdownMenuButton">
                            <a class="dropdown-item" href="${pageContext.request.contextPath}/product/lista">Listar Productos</a>
                            <sec:authorize access=" hasAnyAuthority('Administrador')">
                            <a class="dropdown-item" href="${pageContext.request.contextPath}/product/agregar">Crear Productos</a>
                            </sec:authorize>
                        </div>
                    </div>
                <li class="nav-item active">
                    <sec:authorize access=" hasAnyAuthority('Administrador')">
                        <a class="nav-link" href="${pageContext.request.contextPath}/logout">Cerrar Sesión</a>
                    </sec:authorize>
                </li>
                </ul>
            </div>
        </div>

    </nav>
</html>
