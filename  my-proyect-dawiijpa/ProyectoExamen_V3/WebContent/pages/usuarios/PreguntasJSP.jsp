<%-- 
    Document   : PreguntasJSP
    Created on : 12/01/2011, 03:42:17 PM
    Author     : LENOVO
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link href="<%=request.getContextPath()%>/css/componentes.css"
	rel="stylesheet" type="text/css">

<script language="javascript" type="text/javascript"
	src="<%=request.getContextPath()%>/js/jquery/jquery.js"></script>
<script type="text/javascript"
	src="<%=request.getContextPath()%>/js/jquery/jquery.tablesorter.js"></script>
<script type="text/javascript"
	src="<%=request.getContextPath()%>/js/jquery/jquery.tablesorter.pager.js"></script>
<script type="text/javascript"
	src="<%=request.getContextPath()%>/js/Opciones.js"></script>

<script type="text/javascript">
	$(function() {
		$("#tableOne").tablesorter( {
			widthFixed : true,
			widgets : [ 'zebra' ],
			headers : {

				2 : {
					sorter : false
				}

			}
		}).tablesorterPager( {
			container : $("#pager"),
			positionFixed : false
		});
	});
</script>

</head>
<body>

<div style="width: 500px; border-style: solid;"><s:form
	action="GrabarExamen">
	<table cellspacing="0" cellpadding="0" align="center" border="0"
		class="tableToolBar" width="500px">
		<tr bgcolor="#D6E3F2">

			<td align="right"><c:if test="${!empty lstPregunta}">
				<div id="pager" class="pager"><img alt=""
					src="<%=request.getContextPath()%>/images/jquery_table/first_old_2.png"
					class="first" /> <img alt=""
					src="<%=request.getContextPath()%>/images/jquery_table/prev_old_2.png"
					class="prev" /> <input type="text" class="pagedisplay selectSmall"
					style="text-align: center; width: 35px" /> <img alt=""
					src="<%=request.getContextPath()%>/images/jquery_table/next_old_2.png"
					class="next" /> <img alt=""
					src="<%=request.getContextPath()%>/images/jquery_table/last_old_2.png"
					class="last" /> <select class="pagesize selectSmall">
					<option selected="selected" value="6">1</option>
					<option value="12">2</option>
					<option value="18">3</option>
				</select></div>
			</c:if></td>
		</tr>
	</table>
	<c:if test="${!empty lstPregunta}">
		<table id="tableOne" cellspacing="1" align="center" border="0"
			class="tablesorter" style="width: 500px">
			<thead>
				<!--				<tr>-->
				<!---->
				<!--					<th width="12%">-->
				<!--					<div align="center">Nombre</div>-->
				<!--					</th>-->
				<!--					<th width="10%">-->
				<!--					<div align="center">Puesto</div>-->
				<!--					</th>-->
				<!---->
				<!--					<th width="4%">-->
				<!--					<div align="center">Etapa</div>-->
				<!--					</th>-->
				<!--					<th width="4%">-->
				<!--					<div align="center">Estado</div>-->
				<!--					</th>-->
				<!---->
				<!--				</tr>-->
			</thead>
			<tbody>
				<c:forEach var="jbean" items="${lstPregunta}">
					<tr>
						<td align="left" colspan="2"><c:out
							value="${jbean.strPregunta}"></c:out></td>
					</tr>
					<tr>
						<td><input type="radio"
							value='<c:out value="${jbean.strCodPregunta}_1"/>'
							name='<c:out value="${jbean.strCodPregunta}"/>'
							onclick="SetAlternativaPregunta(this.value)"> <c:out
							value="${jbean.strAlter1}"></c:out></td>
					</tr>
					<tr>
						<td><input type="radio"
							value='<c:out value="${jbean.strCodPregunta}_2"/>'
							name='<c:out value="${jbean.strCodPregunta}"/>'
							onclick="SetAlternativaPregunta(this.value)"
							> <c:out
							value="${jbean.strAlter2}"></c:out></td>
					</tr>
					<tr>
						<td><input type="radio"
							value='<c:out value="${jbean.strCodPregunta}_3"/>'
							name='<c:out value="${jbean.strCodPregunta}"/>'
							onclick="SetAlternativaPregunta(this.value)"><c:out
							value="${jbean.strAlter3}"></c:out></td>
					</tr>
					<tr>
						<td><input type="radio"
							value='<c:out value="${jbean.strCodPregunta}_4"/>'
							name='<c:out value="${jbean.strCodPregunta}"/>'
							onclick="SetAlternativaPregunta(this.value)"><c:out
							value="${jbean.strAlter4}"></c:out></td>
					</tr>
					<tr>
						<td><input type="radio"
							value='<c:out value="${jbean.strCodPregunta}_5"/>'
							name='<c:out value="${jbean.strCodPregunta}"/>'
							onclick="SetAlternativaPregunta(this.value)"><c:out
							value="${jbean.strAlter5}"></c:out></td>

					</tr>
				
				</c:forEach>
			</tbody>
		</table>
		
		<table style="width: 500px">
	<tr>
	<s:submit value="Finalizar" ></s:submit>
	</tr>
	
	</table>
	</c:if>
	
	



</s:form></div>

</body>
</html>
