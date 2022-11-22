<%--
  Created by IntelliJ IDEA.
  User: Rodrigo
  Date: 15-10-2022
  Time: 12:48
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html>
    <head>
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/css/bootstrap.min.css" integrity="sha384-xOolHFLEh07PJGoPkLv1IbcEPTNtaed2xpHsD9ESMhqIYd0nLMwNLD69Npy4HI+N" crossorigin="anonymous">
        <meta name="viewport" content="width=device-width, initial-scale=1,shrink-to-fit=no">
        <meta name="description" content="Formulario de login">
        <title>Formulario de login</title>
    </head>
    <body>
        <main role="main" class="container my-auto">
            <div class="row">
                <div class="col-lg-4 offset-lg-4 col-md-6 offset-md-3 col-12">
                    <h2 class="text-center">Bienvenidos</h2>
                    <img class="img-fluid mx-auto d-block rounded" src="res/img/alimentos.jpg " style="max-width:100%;height:auto;">
                    <form action="login" method="post">
                        <div class="form-group">
                            <label for="correo">Usuario</label>
                            <input id="correo" name="nombreUsuario" class="form-control" type="text" placeholder="Correo electrónico">
                        </div>
                        <div class="form-group">
                            <label for="palabraSecreta">Contraseña </label>
                            <input id="palabraSecreta" name="claveUsuario" class="form-control" type="password" placeholder="Contraseña">
                        </div>
                        <button type="submit" class="btn btn-primary mb-2">Entrar</button>
                        <br>
                        <a href="begin">Inicio</a>
                    </form>
                </div>
            </div>
        </main>
        <%@ include file="footer.jsp"%>
            <script src="https://cdn.jsdelivr.net/npm/jquery@3.5.1/dist/jquery.slim.min.js" integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj" crossorigin="anonymous"></script>
            <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js" integrity="sha384-9/reFTGAW83EW2RDu2S0VKaIzap3H66lZH81PoYlFhbGU+6BZp6G7niu735Sk7lN" crossorigin="anonymous"></script>
            <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/js/bootstrap.min.js" integrity="sha384-+sLIOodYLS7CIrQpBjl+C7nPvqq+FbNUBDunl/OZv93DB7Ln/533i8e/mZXLi/P+" crossorigin="anonymous"></script>
    </body>
</html>
