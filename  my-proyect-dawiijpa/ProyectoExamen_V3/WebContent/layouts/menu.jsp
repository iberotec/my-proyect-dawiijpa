
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib prefix="s" uri="/struts-tags"%>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" href="css/menu.css" type="text/css" />
<title>Menú de Opciones</title>
</head>
<body>
<div id="menu">
<ul>
	<li><s:a action="DarExamen">
		<s:label key="label.examen" />
	</s:a></li>
	<li><s:a action="a_buscarLibros">
		<s:label key="label.nota" />
	</s:a></li>
	<li><s:a action="CargarDatosUsuario">
		<s:label key="label.datos" />
	</s:a></li>
	<li><s:a action="MensajeAdministrador">
		<s:label key="label.mensaje" />
	</s:a></li>


</ul>
</div>
</body>
</html>