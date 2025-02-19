<!DOCTYPE html>
<html>
<head>
    <title>Résultat de la conversion</title>
</head>
<body>
    <h1>Conversion de Température</h1>
    
    <!-- Récupération du paramètre "temperature" depuis l'URL -->
    <p>Température en Celsius : ${param.temperature}</p>

    <!-- Récupération du résultat depuis l'attribut "result" -->
    <p>Température en Fahrenheit : ${result}</p>

    <!-- Récupération du résultat depuis l'attribut "result" alternative 
         Rappel : nous pouvons executer du code Java dans les fichier JSP 
    -->
    <%
        String result = (String) request.getAttribute("result");
        if (result != null) {
    %>
        <p><%= result %></p>
    <%
        }
    %>
</body>
</html>