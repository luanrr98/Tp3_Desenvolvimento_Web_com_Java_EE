<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
    <title>Cadastro</title>
</head>
<body>
<div class="container">

    <c:if test="${not empty msg}">
        <div class="alert alert-warning">
            <h3> ${msg} </h3>
        </div>
    </c:if>

    <form action="/cadastrar" method="post">
        <div class="form-group">
            <label>Nome:</label>
            <input type="text" class="form-control" placeholder="Infome seu nome" name="nome" required>
        </div>

        <div class="form-group">
            <label>Email:</label>
            <input type="email" class="form-control" placeholder="Infome seu email" name="email" required>
        </div>

        <div class="form-group">
            <label>Senha:</label>
            <input type="password" class="form-control" placeholder="Infome sua senha" name="senha" required>
        </div>

        <input type="submit" value="Cadastrar" class="btn btn-primary">
    </form>
</div>


</body>
</html>
