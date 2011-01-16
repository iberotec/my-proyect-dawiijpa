<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>

<head>
<title><tiles:insertAttribute name="title" ignore="true" /></title>
<META HTTP-EQUIV="CACHE-CONTROL" CONTENT="NO-CACHE">
</head>

<body>
<table border="0" width="*" cellspacing="5">
	<tbody>
		<tr>
			<td><tiles:insertAttribute name="header" /></td>

		</tr>
		<tr>
			<td width="30%" valign="top" align="left"><tiles:insertAttribute
				name="navigation" /></td>
			<td width="70%" valign="top" align="center"><tiles:insertAttribute
				name="body" /></td>

		</tr>
		<tr>
			<td><tiles:insertAttribute name="footer" /></td>

		</tr>

	</tbody>
</table>

</body>
