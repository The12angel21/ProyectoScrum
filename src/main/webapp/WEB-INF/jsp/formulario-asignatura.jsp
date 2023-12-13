<%@ include file="common/header.jspf"%>
<%@ include file="common/navigation.jspf"%>
<div class="container">
	<div>
		<form action="/agregar-asignatura" method="post">
		      <label for="nombre">Nombre de la asignatura:</label>
		      <input type="text" id="nombre" name="nombre" required>
		      <button class="btn btn-success" type="submit">Añadir asignatura</button>
		</form>
	<table class="table table-striped">
    <thead>
     <tr>
     <th width="20%">id</th>
      <th width="80%">Nombre</th>
     </tr>
    </thead>
    <tbody>
     <c:forEach items="${asignaturas}" var="asig">
      <tr>
       <td>${asig.id}</td>
       <td>${asig.nombre}</td>
       <td>
       <a type="button" class="btn btn-warning"
        href="/delete-asignatura?id=${asig.id}">Borrar</a></td>
      </tr>
     </c:forEach>
    </tbody>
   </table>
		</div>
</div>
<%@ include file="common/footer.jspf"%> 