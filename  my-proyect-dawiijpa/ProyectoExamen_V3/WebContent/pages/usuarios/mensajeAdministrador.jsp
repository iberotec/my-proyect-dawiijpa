<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<s:form action="enviarMensaje">
<table border="0">
<tr>
<td><s:label  key="label.asunto"/> </td>
<td><s:textfield  name="strAsunto"/> </td>
</tr>
<tr>

<td colspan="2"><s:textarea  name="strMensaje"  cols="30" rows="10"/> </td>
</tr>

<tr>
<td><s:submit value="Enviar" /> </td>
<td><input type="reset" value="Limpiar" /> </td>
</tr>

</table>


</s:form>

</body>
</html>