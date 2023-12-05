<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="/agregar-asignatura" method="post">
        <label for="nombre">Nombre de la asignatura:</label>
        <input type="text" id="nombre" name="nombre" required>
        <button type="submit">Añadir asignatura</button>
    </form>
</body>
</html>