<%@ include file="common/header.jspf"%>
<%@ include file="common/navigation.jspf"%>

<div class="container">
 <div>
  <a type="button" class="btn btn-primary btn-md" href="/list-todos">Volver</a>
 </div>
 <br>
 <div class="panel panel-primary">
  <div class="panel-heading">
   <h3>Lista de tareas ordenadas por fecha</h3>
  </div>
  <div class="panel-body">
   <table class="table table-striped">
    <thead>
     <tr>
     <th width="40%">Nombre</th>
      <th width="40%">Asignatura</th>
      <th width="40%">Tipo</th>
      <th width="40%">Fecha</th>
      <th width="40%">Duracion</th>
      <th width="40%">Descripcion</th>
      <th width="40%">Prioridad</th>
      <th width="40%">Estado</th>
      <th width="20%"></th>
     </tr>
    </thead>
    <tbody>
     <c:forEach items="${todos}" var="todo">
      <tr>
       <td>${todo.nombre}</td>
       <td>${todo.asignatura}</td>
       <td>${todo.tipo}</td>
       <td><fmt:formatDate value="${todo.targetDate}"
         pattern="dd/MM/yyyy" /></td>
         <td>${todo.duracion}</td>
         <td>${todo.description}</td>
         <td>${todo.prioridad}</td>
        
       <td><a type="button" class="btn btn-success"
        href="/update-todo?id=${todo.id}">Editar</a>
       <a type="button" class="btn btn-warning"
        href="/delete-todo?id=${todo.id}">Borrar</a></td>
      </tr>
     </c:forEach>
    </tbody>
   </table>
  </div>
 </div>

</div>
<%@ include file="common/footer.jspf"%>
