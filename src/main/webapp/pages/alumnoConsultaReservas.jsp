<%-- 
    Document   : AlumnoConsultaReservas
    Created on : 16/06/2010, 12:14:50 PM
    Author     : DUOTRABAJO
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta name="keywords" content="" />
<meta name="description" content="" />
<meta http-equiv="content-type" content="text/html; charset=utf-8" />
<title>Profesores Particulares</title>
<link href="css/style.css" rel="stylesheet" type="text/css" media="screen" />
</head>
<body>
	<div id="header">
		<div id="logo">
			<h1><a href="#">Profesores Particulares   </a></h1>
<!--			<p> design by <a href="http://www.freecsstemplates.org/">Free CSS Templates</a></p>-->
		</div>
	</div>
	<!-- end #header -->
	<div id="menu">
		<ul>
			 <li><a href="<%=request.getContextPath()%>/PaginaAlumno.action">Inicio Alumno</a></li>
			<li><a href="<%=request.getContextPath()%>/PaginaRealizarReservasAlumno.action">Realizar Reservas</a></li>
			<li class="current_page_item"><a href="<%=request.getContextPath()%>/PaginaConsultaReservasAlumno.action">Reservas Realizadas</a></li>
			<li><a href="<%=request.getContextPath()%>/PaginaPerfilAlumno.action">Perfil</a></li>
		</ul>
	</div>
	<!-- end #menu -->
	<div id="page">
	<div id="page-bgtop">
	<div id="page-bgbtm"></div>
	</div>
	<!-- end #page -->
</div>
	<!-- end #footer -->
</body>
</html>
