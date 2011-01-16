<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib prefix="sj" uri="/struts-jquery-tags"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<script type="text/javascript"
	src="<%=request.getContextPath()%>/js/prototype.js"></script>
<script type="text/javascript"
	src="<%=request.getContextPath()%>/js/Opciones.js"></script>
	<sj:head jqueryui="true" locale="es_PE" jquerytheme="sunny" />
</head>
<body>
<sj:div id="examen"  >
<div style="width: 300px;border-style: solid;">
<s:form action="darExamen">

	<table>
		<tr>
			<td><s:label key="label.tipoExamen"></s:label></td>
			<td><s:select list="lstTipoExamen" listKey="strCodTipo"
				name="strTipo" listValue="strDesTipo"
				onchange="poblarExamenes(this.value)">

			</s:select></td>
		</tr>
		<tr>
			<td><s:label key="label.Examen"></s:label></td>
			<td><s:select id="selExamen" list="#{}" headerKey="0" name="strExamen"
				headerValue="[Seleccione]">


			</s:select> </td>
		</tr>


		<tr>
			<td><sj:submit targets="ExamenJSP" value="DarExamen" /></td>
		</tr>

	</table>


</s:form>
</div>
</sj:div>
<sj:div id="ExamenJSP" >

</sj:div>



</body>
</html>