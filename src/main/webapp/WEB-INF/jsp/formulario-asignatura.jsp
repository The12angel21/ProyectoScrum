<%@ include file="common/header.jspf"%>
<%@ include file="common/navigation.jspf"%>
	<div class="container">
	<div>
		<form action="/agregar-asignatura" method="post">
		      <label for="nombre">Nombre de la asignatura:</label>
		      <input type="text" id="nombre" name="nombre" required>
		      <button type="submit">Añadir asignatura</button>
		</form>
		</div>
    </div>
<%@ include file="common/footer.jspf"%> 