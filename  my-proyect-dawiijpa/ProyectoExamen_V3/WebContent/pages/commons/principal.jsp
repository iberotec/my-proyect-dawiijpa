
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>




<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" href="css/formatos.css" type="text/css"
	charset="utf-8" />
</head>
<body>


<table align="center" border="0">
	<tr>
		<td class="subtitulo" colspan="2">Bienvenido al Sistema</td>
	</tr>
	<tr>
		<td class="column_header">Usted es:</td>

		<td class="column_data1"><c:out
			value="${sessionScope.usuario.strnombreBD } ${sessionScope.usuario.strapePatBD }"></c:out>

		</td>
	</tr>
	<tr>
		<td class="column_header"><s:label key="label.dia" /></td>
		<jsp:useBean id="deldia" class="java.util.Date" />
		<td class="column_data1"><fmt:formatDate type="date"
			dateStyle="full" value="${deldia}" /></td>
	</tr>
	<tr>
		<td class="column_header" colspan="2" valign="middle" align="center">

		<s:label key="label.mensaje.principal" /></td>
	</tr>

</table>
</table>



</body>
</html>