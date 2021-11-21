<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">

    <meta charset="ISO-8859-1">
    <title>Cadastro</title>
</head>
<body>

<div class="container">
    <c:if test="${not empty user.nome}">
        <div class="alert alert-success">
            <h3> Usuário ${user.nome}, com email ${user.email} cadastrado com sucesso!! </h3>
        </div>
    </c:if>

    <div>
        <a href="/login"><button class="btn btn-primary">Login</button></a>
    </div>
</div>

</body>
</html>
