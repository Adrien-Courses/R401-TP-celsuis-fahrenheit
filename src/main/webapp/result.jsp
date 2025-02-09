<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="fr">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Résultat</title>
</head>
<body>
    <h2>Résultat de la Conversion</h2>

    <%
        String result = (String) request.getAttribute("result");
        if (result != null) {
    %>
        <p><%= result %></p>
    <%
        }
    %>

    <a href="index.jsp">Retour</a>
</body>
</html>