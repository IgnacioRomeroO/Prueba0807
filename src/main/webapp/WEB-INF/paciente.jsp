<%--
  Created by IntelliJ IDEA.
  User: Administrador
  Date: 08-07-2022
  Time: 10:52
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html>
<head>
    <link
            href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css"
            rel="stylesheet">

    <title>paciente</title>
</head>
<body>
<div>
    <%--@elvariable id="paciente" type="java"--%>
    <form:form action="/paciente/citaMedica" method="post" modelAttribute="paciente">
        <h1>Ingrese datos de paciente.</h1>
        <br>
        <hr>
        <h5>Ingrese su Rut sin puntos y con guión.</h5>
        <br>
        <h5>Ingrese su fecha de nacimiento en formato dd-mm-aa, entre guiones.</h5>
        <br>
        <hr>
        <form:label path="nombre" >Nombre: </form:label>
        <br>
        <form:input path="nombre"/>
        <br>
        <form:label path="rut">Rut: </form:label>
        <br>
        <form:input path="rut"/>
        <br>
        <form:label path="fechaNacimiento">Fecha de nacimiento: </form:label>
        <br>
        <form:input path="fechaNacimiento"/>
        <br>
        <br>
        <button type="submit" class="btn btn-primary" text-center>Registrar</button>
    </form:form>
</div>

</body>
</html>
