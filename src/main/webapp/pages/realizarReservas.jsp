<%-- 
    Document   : RealizarReservas
    Created on : 16/06/2010, 12:16:17 PM
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
			<li class="current_page_item"><a href="<%=request.getContextPath()%>/PaginaRealizarReservasAlumno.action">Realizar Reservas</a></li>
			<li ><a href="<%=request.getContextPath()%>/PaginaConsultaReservasAlumno.action">Reservas Realizadas</a></li>
			<li><a href="<%=request.getContextPath()%>/PaginaPerfilAlumno.action">Perfil</a></li>
		</ul>
	</div>
	<!-- end #menu -->
	<div id="page">
	<div id="page-bgtop">
	<div id="page-bgbtm">
	  <table width="622" height="216" border="0">
	  			<tr><td height="28"></td>
	   <td colspan="7">
	   </tr>
        <tr>
          <td colspan="7"><div align="center"><strong>Reservas de Tutorias </strong></div></td>

        <tr>
          <td width="61" height="24">&nbsp;</td>
          <td width="132">&nbsp;</td>
          <td width="314">&nbsp;</td>
          <td width="1">&nbsp;</td>
          <td width="1">&nbsp;</td>
          <td width="2">&nbsp;</td>
          <td width="65">&nbsp;</td>
        </tr>
        <tr>
          <td height="41">&nbsp;</td>
          <td>Seleccione un profesor: </td>
          <td>

                <select name="select">
                  <option>Edgar alvarado</option>
                  <option>Giomar Martinez</option>
                  <option>Javier Flores</option>
                  <option>Elmer Otiniano</option>
                </select>
          </td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
        </tr>
        <tr>
          <td height="30">&nbsp;</td>
          <td>Horario:</td>
          <td><table width="200" border="0">
            <tr>
              <td>Dia</td>
              <td><select name="select2" size="1">
                  <option value="1">1</option>
                  <option value="2">2</option>
                  <option value="3">3</option>
                  <option value="4">4</option>
                  <option value="5">5</option>
                  <option value="6">6</option>
                  <option value="7">7</option>
                  <option value="8">8</option>
                  <option value="9">9</option>
                  <option value="10">10</option>
                  <option value="11">11</option>
                  <option value="12">12</option>
                  <option value="13">13</option>
                  <option value="14">14</option>
                  <option value="15">15</option>
                  <option value="16">16</option>
                  <option value="17">17</option>
                  <option value="18">18</option>
                  <option value="19">19</option>
                  <option value="20">20</option>
                  <option value="21">21</option>
                  <option value="22">22</option>
                  <option value="23">23</option>
                  <option value="24">24</option>
                  <option value="25">25</option>
                  <option value="26">26</option>
                  <option value="27">27</option>
                  <option value="28">28</option>
                  <option value="29">29</option>
                  <option value="30">30</option>
                  <option value="31">31</option>
              </select></td>
              <td>Mes</td>
              <td><select name="select2">
                  <option value="Enero">Enero</option>
                  <option value="Febrero">Febrero</option>
                  <option value="Marzo">Marzo</option>
                  <option value="Abril">Abril</option>
                  <option value="Mayo">Mayo</option>
                  <option value="Junio">Junio</option>
                  <option value="Julio">Julio</option>
                  <option value="Agosto">Agosto</option>
                  <option value="Septiembre">Septiembre</option>
                  <option value="Octubre">Octubre</option>
                  <option value="Noviembre">Noviembre</option>
                  <option value="Diciembre">Diciembre</option>
              </select></td>
              <td>Año:</td>
              <td><select name="select3">
                  <option value="2010">2010</option>
                  <option value="2011">2011</option>
                  <option value="2013">2012</option>
              </select></td>
            </tr>
          </table>		  </td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
        </tr>
        <tr>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td><label>
            <input type="submit" name="Submit" value="Buscar" />
          </label></td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
        </tr>
        <tr>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
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
