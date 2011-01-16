<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<s:form action="modificar">

	<table>
	
		<tr>
			<td><s:label key="label.nombre"  /></td>
			<td><s:textfield name="strNombre"  /></td>
		</tr>
		<tr>
			<td><s:label key="label.apepat"/></td>
			<td><s:textfield name="strApepat" /></td>
		</tr>
		<tr>
			<td><s:label key="label.apemat" /></td>
			<td><s:textfield name="strApemat"  /></td>
		</tr>
		<tr>
			<td><s:label key="label.documento"/></td>
			<td><s:textfield name="intDocuIden"  /></td>
		</tr>
		<tr>
			<td><s:label key="label.edad"/></td>
			<td><s:textfield name="intedad" /></td>
		</tr>
		<tr>
			<td><s:label key="label.ginstruccion" /></td>
			<td><s:textfield name="strgradoInstruccion" /></td>
		</tr>
		<tr>
			<td><s:label key="label.email" /></td>
			<td><s:textfield name="strEmail" /></td>
		</tr>
		<tr>
			<td><s:label key="label.celular"/></td>
			<td><s:textfield name="strcelular"  /></td>
		</tr>
	
		<tr>
		<td><s:submit value="Modificar"/> </td>
		<td><input type="reset" value="Limpiar"  /> </td>
		</tr>
		<tr>
		<td colspan="2">
		<c:if test="${mensaje != null}">
		<font color="red"><c:out value="${mensaje}"></c:out></font>
		</c:if>
		</td>
		</tr>


	</table>
</s:form>

</body>
</html>