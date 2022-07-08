<%--
  Created by IntelliJ IDEA.
  User: Administrador
  Date: 08-07-2022
  Time: 11:14
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

    <title>citaMédica</title>
</head>
<body>
<%--@elvariable id="citaMedica" type="java"--%>
<form:form action="/paciente/mostrarRegistroPaciente" method="post" modelAttribute="citaMedica">
    <h1>Ingrese datos de su cita medica.</h1>
    <br>
    <hr>
    <h5>Ingrese hora en formato hh:mm.</h5>
    <br>
    <hr>
    <form:label path="hora" >Hora: </form:label>
    <br>
    <form:input path="hora"/>
    <br>
    <form:label path="areaMedica">Especialidad: </form:label>
    <br>
    <form:input path="areaMedica"/>
    <br>
    <br>
    <button type="submit" class="btn btn-primary" text-center>Registrar</button>
</form:form>

</body>
</html>
