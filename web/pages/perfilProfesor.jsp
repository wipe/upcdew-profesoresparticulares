<%-- 
    Document   : perfilProfesor
    Created on : 04/06/2010, 11:41:19 AM
    Author     : lkina
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
<link href="css/style.css" rel="stylesheet" type="text/css" media="screen" /></head>
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
			<li ><a href="profesores.html">Inicio Profesores</a></li>
			<li  ><a href="registrohorario.html">Registro de Horario</a></li>
			<li ><a href="ConsultaHorarioProfesor.html">Consulta Horario</a></li>
			<li  class="current_page_item"><a href="perfilProfesor.html">Perfil</a></li>

		</ul>
	</div>
	<!-- end #menu -->
	<div id="page">
	<div id="page-bgtop">
	<div id="page-bgbtm">
	  <table width="617" border="0">
        <tr>
          <td width="110" height="42">&nbsp;</td>
          <td width="316">&nbsp;</td>
          <td width="177">&nbsp;</td>
        </tr>
        <tr>
          <td height="30"><strong>Codigo</strong></td>
          <td><input type="text" name="txtCodigo" /></td>
          <td>&nbsp;</td>
        </tr>
        <tr>
          <td><strong>Nombre</strong></td>
          <td><label>
          <input type="text" name="txtNombre" />
          </label></td>
          <td>&nbsp;</td>
        </tr>
        <tr>
          <td height="17"><strong>Apellido Paterno </strong></td>
          <td><label>
            <input type="text" name="txtApellidoPaterno" />
          </label></td>
          <td>&nbsp;</td>
        </tr>
        <tr>
          <td><strong>Apellido Materno </strong></td>
          <td><input type="text" name="txtApelidoMaterno" /></td>
          <td>&nbsp;</td>
        </tr>
        <tr>
          <td><strong>Mail</strong></td>
          <td><input type="text" name="txtmail" /></td>
          <td>&nbsp;</td>
        </tr>
        <tr>
          <td><strong>contraseña</strong></td>
          <td><input type="text" name="txtpassword" /></td>
          <td>&nbsp;</td>
        </tr>
        <tr>
          <td><strong>Curso</strong></td>
          <td><select name="select">
            <option value="1">Calculo 1</option>
            <option value="2">Calculo 2</option>
            <option value="3">Fisica 1</option>

          </select></td>
          <td>&nbsp;</td>
        </tr>
        <tr>
          <td>&nbsp;</td>
          <td><input name="submit" type="submit" id="search-submit" value="Grabar" />
          <input name="submit2" type="submit" id="submit" value="Borrar" /></td>
          <td>&nbsp;</td>
        </tr>
        <tr>
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