

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

                        <li class="alumnos.jsp" ><a href="<%=request.getContextPath()%>/PaginaAlumno.action">Inicio Alumno</a></li>
			<li><a href="<%=request.getContextPath()%>/PaginaRealizarReservasAlumno.action">Realizar Reservas</a></li>
			<li ><a href="<%=request.getContextPath()%>/PaginaConsultaReservasAlumno.action">Reservas Realizadas</a></li>
			<li><a href="<%=request.getContextPath()%>/PaginaPerfilAlumno.action">Perfil</a></li>
			<li><a href="<%=request.getContextPath()%>/PaginaPerfilAlumno.action">Calsificacion Profesores</a></li>

		</ul>
	</div>
	<!-- end #menu -->
	<div id="page">
	<div id="page-bgtop">
	<div id="page-bgbtm">
	  <table width="622" border="0">
        <tr>
          <td height="30" colspan="8"><div align="center">Clasificación de profesores </div></td>
        </tr>
        <tr>
          <td width="55" height="30">&nbsp;</td>
          <td width="76">Profesor</td>
          <td width="225"><label>
            <select name="select">
              </select>
          </label></td>
          <td width="155">&nbsp;</td>
          <td width="19">&nbsp;</td>
          <td width="19">&nbsp;</td>
          <td width="19">&nbsp;</td>
          <td width="20">&nbsp;</td>
        </tr>
        <tr>
          <td>&nbsp;</td>
          <td>clasificacion</td>
          <td><label>
          <select name="select2">
              </select>
          </label></td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
        </tr>
        <tr>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td><label>
            <input type="submit" name="Submit" value="Enviar">
          </label></td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
        </tr>
      </table>
	</div>
	</div>
	<!-- end #page -->
</div>
	<!-- end #footer -->
</body>
</html>

