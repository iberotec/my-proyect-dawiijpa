<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="sj" uri="/struts-jquery-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
  <link href="<%=request.getContextPath()%>/css/miestilo.css" rel="stylesheet" type="text/css">
</head>
<body>

<table align="center">
	<tr>
		<td>
		<div style="border-style: solid;" >

		<table border="1">
			<tr align="center" background="blue" class="cabeceraDetalle">
				<td colspan="2" ><s:label key="label.Detalle" ></s:label></td>
			</tr>
			<tr>
			<td style="height: 25px"></td>
			</tr>

			<tr>
				<td><s:label key="label.notaObtenida"></s:label></td>
				<td><c:out value="${nota}"></c:out></td>
			</tr>

			<tr>
				<td><s:label key="label.buenas"></s:label></td>
				<td><c:out value="${Buenas}"></c:out></td>
			</tr>

			<tr>
				<td><s:label key="label.malas"></s:label></td>
				<td><c:out value="${malas}"></c:out></td>
			</tr>

			<tr>
				<td><s:label key="label.estado"></s:label></td>
				<td><c:out value="${Stado}"></c:out></td>
			</tr>
		</table>
		</div>
		</td>
	</tr>
</table>

</body>
</html>