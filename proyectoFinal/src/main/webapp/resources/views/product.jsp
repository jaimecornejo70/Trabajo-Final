<%--
  Created by IntelliJ IDEA.
  User: Rodrigo
  Date: 16-10-2022
  Time: 7:56
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" %>
<html>
        <div class="container-fluid">
            <%@include file="menu.jsp"%>
            <div class = "row">
                <div class = "col-6">
                    <h1> Productos </h1>
                    <div class="col-lg-6">
                        <img src="res/img/productos.jpg" style="max-width:100%;height:auto;">
                    </div>
                    <p> Resalta la importancia de las frutas, las verduras, los cereales integrales, la leche y los productos lácteos sin grasa o bajos en grasa. Incluye una variedad de alimentos con proteínas como mariscos, carnes magras, huevos, legumbres, nueces y semillas.</p>
                </div>
                <div class = "col-6">
                    <h1> Marcas </h1>
                    <div class="col-lg-6">
                        <img src="res/img/marcas.jpg" style="max-width:100%;height:auto;">
                    </div>

                    <p> Cuando vas al supermercado ¿compras lo estrictamente necesario?, ¿sabes realmente lo que estás eligiendo?, ¿qué proporción de su carro corresponde a frutas y verduras? Aquí entregamos algunos consejos para comprar bien y comer alimentos muy sanos.</p>
                </div>
            </div>
        </div>

        <script src="https://cdn.jsdelivr.net/npm/jquery@3.5.1/dist/jquery.slim.min.js" integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj" crossorigin="anonymous"></script>
        <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js" integrity="sha384-9/reFTGAW83EW2RDu2S0VKaIzap3H66lZH81PoYlFhbGU+6BZp6G7niu735Sk7lN" crossorigin="anonymous"></script>
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/js/bootstrap.min.js" integrity="sha384-+sLIOodYLS7CIrQpBjl+C7nPvqq+FbNUBDunl/OZv93DB7Ln/533i8e/mZXLi/P+" crossorigin="anonymous"></script>
        <%@ include file="footer.jsp"%>
    </body>
</html>
