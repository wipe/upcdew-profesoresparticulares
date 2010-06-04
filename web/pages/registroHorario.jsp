<%-- 
    Document   : registroHorario
    Created on : 04/06/2010, 11:39:31 AM
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
			<li  class="current_page_item"><a href="#">Registro de Horario</a></li>
			<li ><a href="ConsultaHorarioProfesor.html">Consulta Horario</a></li>
			<li><a href="perfilProfesor.html">Perfil</a></li>

		</ul>
	</div>
	<!-- end #menu -->
	<div id="page">
	<div id="page-bgtop">
	<div id="page-bgbtm">
	  <table width="617" border="0">
        <tr>
          <td width="55" height="42">&nbsp;</td>
          <td width="371">&nbsp;</td>
          <td width="177">&nbsp;</td>
        </tr>
        <tr>
          <td height="35"><strong>Fecha</strong></td>
          <td><table width="200" border="0">
            <tr>
              <td>Dia</td>
              <td><select name="select" size="1">
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
          </table></td>
          <td>&nbsp;</td>
        </tr>
        <tr>
          <td><strong>Hora</strong></td>
          <td><label>
            <select name="hora">
			  	 <option value="1">8:00  - 9:00</option>
				 <option value="2">9:00  - 10:00</option>
				 <option value="3">10:00 - 11:00</option>
				 <option value="4">11:00 - 12:00</option>
				 <option value="5">12:00 - 13:00</option>
				 <option value="6">13:00 - 14:00</option>
				 <option value="7">14:00 - 15:00</option>
				 <option value="8">15:00 - 16:00</option>
				 <option value="9">16:00 - 17:00</option>
				 <option value="9">17:00 - 18:00</option>
				 <option value="9">18:00 - 19:00</option>
				 <option value="9">19:00 - 20:00</option>
				 <option value="9">20:00 - 21:00</option>
				 <option value="9">21:00 - 22:00</option>
				 <option value="9">22:00 - 23:00</option>
              </select>
          </label></td>
          <td>&nbsp;</td>
        </tr>
        <tr>
          <td height="17"><strong>Lugar</strong></td>
          <td><label>
            <input type="text" name="textfield" />
          </label></td>
          <td>&nbsp;</td>
        </tr>
        <tr>
          <td><strong>costo</strong></td>
          <td><input type="text" name="txtCosto" /></td>
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