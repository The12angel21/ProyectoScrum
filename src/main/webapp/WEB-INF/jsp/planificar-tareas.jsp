<%@ include file="common/header.jspf"%>
<%@ include file="common/navigation.jspf"%>
<div class="container">
	<div>
		<form action="/agregar-asignatura" method="post">
			<label for="nombre">Elige dia para planificar</label> <input
				type="date" id="idF" name="dia" required>
			<button class="btn btn-success" type="submit">Mostrar
				planificacion</button>
		</form>
		<table class="table table-striped">
			<thead>
				<tr>
					<th width="30%">08:00-10:00</th>
				<tr>
					<th width="30%">10:00-12:00</th>
				</tr>
				<tr>
					<th width="30%">12:00-14:00</th>
				</tr>
				<tr>
					<th width="30%">14:00-16:00</th>
				</tr>
				<tr>
					<th width="30%">16:00-18:00</th>
				</tr>
				<tr>
					<th width="30%">18:00-20:00</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${asignaturas}" var="asig">
					<tr>
						<td>${asig.id}</td>
						<td>${asig.nombre}</td>
						<td><a type="button" class="btn btn-warning"
							href="/delete-asignatura?id=${asig.id}">Borrar</a></td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>
</div>
<%@ include file="common/footer.jspf"%>
