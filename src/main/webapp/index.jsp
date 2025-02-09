<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="fr">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Convertisseur Celsius ➝ Fahrenheit</title>
</head>
<body>
    <h2>Convertisseur Celsius ➝ Fahrenheit</h2>

    <form action="convert" method="post">
        <label for="celsius">Entrez la température en Celsius :</label>
        <input type="text" id="celsius" name="celsius" required>
        <button type="submit">Convertir</button>
    </form>
</body>
</html>