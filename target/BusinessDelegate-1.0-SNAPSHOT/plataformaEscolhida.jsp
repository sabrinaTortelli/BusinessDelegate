<%--
  Created by IntelliJ IDEA.
  User: Sabrina
  Date: 13/03/2022
  Time: 20:00
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Plataforma Escolhida</title>
    <link rel="stylesheet" href="style.css">
    <link rel="preconnect" href="https://fonts.googleapis.com">
    <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
    <link href="https://fonts.googleapis.com/css2?family=Montserrat:wght@300&display=swap" rel="stylesheet">
</head>
<body>
    <div class="container-plataform">
        <div class="subscribe-wrapper-plataform">
            <h2><%
                String plataform = (String) request.getAttribute("plataformChoosed");
                out.println(plataform);
            %></h2>

            <a href="http://localhost:8080/BusinessDelegate-1.0-SNAPSHOT">Voltar à página inicial</a>
        </div>
    </div>
</body>
</html>
