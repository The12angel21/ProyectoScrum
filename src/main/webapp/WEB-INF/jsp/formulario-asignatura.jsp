<%@ include file="common/header.jspf"%>
<%@ include file="common/navigation.jspf"%>
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
        <button type="submit">A�adir asignatura</button>
    </form>
</body>
</html>





<!-- 
<div class="container">
    <div class="row">
        <div class="col-md-6 col-md-offset-3 ">
            <div class="panel panel-primary">
                <div class="panel-heading">A�adir asignatura</div>
                <div class="panel-body">
                
                    <form:form method="post" modelAttribute="asignatura">
                        <form:hidden path="id" />

                        <fieldset class="form-group">
                            <form:label path="nombre">Nombre de la asignatura: </form:label>
                            <form:input path="nombre" type="text" class="form-control" required="required" />
                            <form:errors path="nombre" cssClass="text-warning" />
                        </fieldset>

                        <button type="submit" class="btn btn-success">Guardar</button>
                    </form:form>
                     
                </div>
            </div>
        </div>

        <div class="col-md-6">
            <div class="panel panel-primary">
                <div class="panel-heading">
                    <h3>Lista de asignaturas</h3>
                </div>
                <div class="panel-body">
                
                    <ul class="list-group">
                        <c:forEach items="${asignaturas}" var="asignatura">
                            <li class="list-group-item">${asignatura.nombre}</li>
                        </c:forEach>
                    </ul>
                    
                </div>
            </div>
        </div>
    </div>
</div>

-->
<%@ include file="common/footer.jspf"%> 