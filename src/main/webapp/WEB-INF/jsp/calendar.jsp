<%@ include file="common/header.jspf"%>
<%@ include file="common/navigation.jspf"%>

<div class="container">
    <div>
        <a type="button" class="btn btn-primary btn-md" href="/add-todo">Volver</a>
    </div>
    <br>
    <div class="panel panel-primary">
        <div class="panel-heading">
            <h3>Calendario</h3>
        </div>
        <div class="panel-body">
        	<form action="/calendar-week" method="post">
				<label for="nombre">Elige un dia de una semana para mostrar su calendario semanal</label> <input
				type="date"  name="targetDate" required>
				<button class="btn btn-success" type="submit">Mostrar calendario</button>
			</form>
            <table class="table table-striped">
                <tr>
                    <th>Lunes</th>
                    <th>Martes</th>
                    <th>Miercoles</th>
                    <th>Jueves</th>
                    <th>Viernes</th>
                    <th>Sabado</th>
            		<th>Domingo</th>
                </tr>
                
                <tr>
                	<td>                	
	                	<c:forEach var="todo" items="${lunes}">
				        	<div>${todo.nombre}</div>
				    	</c:forEach>
	                </td>
	                <td>
	                	<c:forEach var="todo" items="${martes}">
				        	<div>${todo.nombre}</div>
				    	</c:forEach>
				    </td>
				    <td>
				    	<c:forEach var="todo" items="${miercoles}">
				        	<div>${todo.nombre}</div>
				    	</c:forEach>
				    </td>
				    <td>
				    	<c:forEach var="todo" items="${jueves}">
				        	<div>${todo.nombre}</div>
				    	</c:forEach>
	                </td>
	                <td>
	                	<c:forEach var="todo" items="${viernes}">
				        	<div>${todo.nombre}</div>
				    	</c:forEach>
				    </td>
				    <td>
				    	<c:forEach var="todo" items="${sabado}">
				        	<div>${todo.nombre}</div>
				    	</c:forEach>
				    </td>
				    <td>
				    	<c:forEach var="todo" items="${domingo}">
				        	<div>${todo.nombre}</div>
				    	</c:forEach>
                </tr>
            </table>
        </div>
    </div>
</div>
<%@ include file="common/footer.jspf"%>
