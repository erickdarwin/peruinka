<%@ page import="org.springframework.web.util.UrlPathHelper"%>
<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%--@ taglib uri="http://java.sun.com/jstl/fmt" prefix="fmt" --%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<%@ taglib uri="http://displaytag.sf.net" prefix="display" %>
<%@ taglib uri="http://www.opensymphony.com/sitemesh/decorator" prefix="decorator" %>

Formulario Persona : ${opc}<br>

<form:form commandName="person" action="savePerson" method="POST">

id: <form:input path="id" id="id"/><br>
Nombre: <form:input path="name" id="name"/><br>
ApePateno: <form:input path="lastNameP" id="lastNameP"/><br>
ApeMateno: <form:input path="lastNameM" id="lastNameM"/><br>
DNI: <form:input path="dni" id="dni"/><br>

<input type="text" name="opc" id="opc" value="${opc}"><br>

<button type="submit">Guardar</button>

</form:form>
