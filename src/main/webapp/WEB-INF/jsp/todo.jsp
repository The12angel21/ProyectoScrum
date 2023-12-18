	<%@ include file="common/header.jspf"%>
<%@ include file="common/navigation.jspf"%>
<div class="container">
 <div class="row">
  <div class="col-md-6 col-md-offset-3 ">
   <div class="panel panel-primary">
    <div class="panel-heading">Añadir tarea</div>
    <div class="panel-body">
     <form:form method="post" modelAttribute="todo">
      <form:hidden path="id" />
     
      <fieldset class="form-group">
       <form:label path="nombre">Nombre de la tarea: </form:label>
       <form:input path="nombre" type="text" class="form-control"
        required="required" />
       <form:errors path="nombre" cssClass="text-warning" />
      </fieldset>
      
        <fieldset class="form-group">
       <form:label path="asignatura">Asignatura: </form:label>
       <form:select path="asignatura" type="text" class="form-control" required="required">
        <form:option value="Selecciona una asignatura"></form:option>
        <form:options items = "${asignaturas}" />
        </form:select>
       <form:errors path="asignatura" cssClass="text-warning" />
      </fieldset>
      
       <fieldset class="form-group">
       <form:label path="tipo">Tipo: </form:label>
       <form:input path="tipo" type="text" class="form-control"
        required="required" />
       <form:errors path="tipo" cssClass="text-warning" />
      </fieldset> 
      
      
      <fieldset class="form-group">
       <form:label path="targetDate">Fecha</form:label>
       <form:input path="targetDate" type="text" class="form-control"
        required="required" />
       <form:errors path="targetDate" cssClass="text-warning" />
      </fieldset>
      
        <fieldset class="form-group">
       <form:label path="duracion">Duracion</form:label>
       <form:input path="duracion" type="text" class="form-control"
        required="required" />
       <form:errors path="duracion" cssClass="text-warning" />
      </fieldset> 
      
       <fieldset class="form-group">
       <form:label path="description">Description</form:label>
       <form:input path="description" type="text" class="form-control"
        required="required" />
       <form:errors path="description" cssClass="text-warning" />
      </fieldset>
      
       <fieldset class="form-group">
       <form:label path="prioridad">Prioridad</form:label>
       <form:input path="prioridad" type="text" class="form-control"
        required="required" />
       <form:errors path="prioridad" cssClass="text-warning" />
      </fieldset>


      <button type="submit" class="btn btn-success">Guardar</button>
     </form:form>
    </div>
   </div>
  </div>
 </div>
</div>
<%@ include file="common/footer.jspf"%>
