<%@ include file="common/header.jspf"%>
<%@ include file="common/navigation.jspf"%>
<div class="container">
	<div>
		<form action="/planificar-tareas-dia" method="post">
			<label for="nombre">Elige dia para planificar</label> <input
			 value="${todo.targetDate} "type="date" id="targetDate" name="targetDate" required>
			<button class="btn btn-success" type="submit">Mostrar
				planificacion</button>
		</form>
		<table class="table table-striped">
			<thead>
			<tr>
			<td>TAREAS: 
			<c:forEach items="${todos}" var="todo">
					<tr>
						<td>${todo.nombre}</td>
					</tr>
				</c:forEach>
				</td>
				<tr>
					<th width="30%">08:00-10:00</th>		
					<td>
						<fieldset class="form-group">
							<label for="opciones">Tarea para 08:00-10:00</label>
							<form:select path="todos" class="form-control"
								required="required">
								<form:option value="Selecciona una tarea"></form:option>
								<form:options items="${todos}" itemLabel="nombre" />
							</form:select>
							<form:errors path="todos" cssClass="text-warning" />
						</fieldset>
					</td>
				<tr>
					<th width="30%">10:00-12:00</th>
					<td>
						<fieldset class="form-group">
							<label for="opciones">Tarea para 10:00-12:00</label>
							<form:select path="todos" class="form-control"
								required="required">
								<form:option value="Selecciona una tarea"></form:option>
								<form:options items="${todos}" itemLabel="nombre" />
							</form:select>
							<form:errors path="todos" cssClass="text-warning" />
						</fieldset>
					</td>
				</tr>
				<tr>
					<th width="30%">12:00-14:00</th>
					<td>
						<fieldset class="form-group">
							<label for="opciones">Tarea para 12:00-14:00</label>
							<form:select path="todos" class="form-control"
								required="required">
								<form:option value="Selecciona una tarea"></form:option>
								<form:options items="${todos}" itemLabel="nombre" />
							</form:select>
							<form:errors path="todos" cssClass="text-warning" />
						</fieldset>
					</td>
				</tr>
				<tr>
					<th width="30%">14:00-16:00</th>
					<td>
						<fieldset class="form-group">
							<label for="opciones">Tarea para 14:00-16:00</label>
							<form:select path="todos" class="form-control"
								required="required">
								<form:option value="Selecciona una tarea"></form:option>
								<form:options items="${todos}" itemLabel="nombre" />
							</form:select>
							<form:errors path="todos" cssClass="text-warning" />
						</fieldset>
					</td>
				</tr>
				<tr>
					<th width="30%">16:00-18:00</th>
					<td>
						<fieldset class="form-group">
							<label for="opciones">Tarea para 16:00-18:00</label>
							<form:select path="todos" class="form-control"
								required="required">
								<form:option value="Selecciona una tarea"></form:option>
								<form:options items="${todos}" itemLabel="nombre" />
							</form:select>
							<form:errors path="todos" cssClass="text-warning" />
						</fieldset>
					</td>
				</tr>
				<tr>
					<th width="30%">18:00-20:00</th>
				<td>
						<fieldset class="form-group">
							<label for="opciones">Tarea para 18:00-20:00</label>
							<form:select path="todos" class="form-control"
								required="required">
								<form:option value="Selecciona una tarea"></form:option>
								<form:options items="${todos}" itemLabel="nombre" />
							</form:select>
							<form:errors path="todos" cssClass="text-warning" />
						</fieldset>
					</td>
				</tr>
			</thead>
		</table>
	</div>
</div>
<%@ include file="common/footer.jspf"%>
