<%@ include file="common/header.jspf"%>
<%@ include file="common/navigation.jspf"%>
<div class="container">
    <div class="row">
        <div class="col-md-6 col-md-offset-3">
            <div class="panel panel-primary">
                <div class="panel-heading">Editar tarea</div>
                <div class="panel-body">
                    <form action="${pageContext.request.contextPath}/update-todo?id=${todo.id}" method="post">
                        <input type="hidden" name="id" value="${todo.id}" />
                        
                        <fieldset class="form-group">
                            <label for="nombre">Nombre de la tarea:</label>
                            <input type="text" id="nombre" name="nombre" class="form-control" value="${todo.nombre}" required />
                        </fieldset>
                        
                                 
                        
                        <fieldset class="form-group">
                            <label for="asignatura">Asignatura:</label>
                            <select id="asignatura" name="asignatura" class="form-control" required>
                                <option value="${todo.asignatura}">Selecciona una asignatura</option>
                                <!-- Aquí puedes incluir opciones de asignaturas -->
                                <c:forEach items="${asignaturas}" var="asignatura">
            					<option value="${asignatura}">${asignatura}</option>
        						</c:forEach>
                            </select>
                        </fieldset>
                        
                        
                        
                        <fieldset class="form-group">
                            <label for="tipo">Tipo:</label>
                            <input type="text" id="tipo" name="tipo" class="form-control" value="${todo.tipo}" required />
                        </fieldset>
                        
                        <fieldset class="form-group">
                            <label for="targetDate">Fecha objetivo:</label>
                            <input type="text" id="targetDate" name="targetDate" class="form-control" value="${todo.targetDate}" required />
                        </fieldset>
                        
                        <fieldset class="form-group">
                            <label for="duracion">Duración:</label>
                            <input type="text" id="duracion" name="duracion" class="form-control" value="${todo.duracion}" required />
                        </fieldset>
                        
                        <fieldset class="form-group">
                            <label for="description">Descripción:</label>
                            <input type="text" id="description" name="description" class="form-control" value="${todo.description}" required />
                        </fieldset>
                        
                        <fieldset class="form-group">
                            <label for="prioridad">Prioridad:</label>
                            <input type="text" id="prioridad" name="prioridad" class="form-control" value="${todo.prioridad}" required />
                        </fieldset>

                        <button type="submit" class="btn btn-primary">Guardar</button>
                    </form>
                </div>
            </div>
        </div>
    </div>
</div>
<%@ include file="common/footer.jspf"%>
