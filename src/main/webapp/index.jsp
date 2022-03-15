<%--
  Created by IntelliJ IDEA.
  User: Sabrina
  Date: 13/03/2022
  Time: 18:11
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Exemplo Business Delegate</title>
    <link rel="stylesheet" href="style.css">
    <link rel="preconnect" href="https://fonts.googleapis.com">
    <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
    <link href="https://fonts.googleapis.com/css2?family=Montserrat:wght@300&display=swap" rel="stylesheet">

</head>
<body>
    <div class="container">
        <div class="subscribe-wrapper">
            <form action="plataform">

                <h4>Escolha o filme que você deseja assistir:</h4>

                    <select name="plataform" class="select-movie" style="width:200px;">
                        <option value="netflix">Ataque dos Cães</option>
                        <option value="hbo">Warning</option>
                        <option value="amazon">Pânico 5</option>
                        <option value="netflix">Alerta Vermelho</option>
                        <option value="hbo">Escape Room 2</option>
                        <option value="amazon">Emboscada</option>
                        <option value="netflix">O Culpado</option>
                        <option value="hbo">Matrix Resurrections</option>
                        <option value="amazon">A Guerra do Amanhã</option>
                    </select>


                <input type="submit" class="signin" value="Enviar">

            </form>
        </div>
    </div>
</body>
</html>



