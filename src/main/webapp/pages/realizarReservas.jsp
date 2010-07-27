<%-- 
    Document   : RealizarReservas
    Created on : 16/06/2010, 12:16:17 PM
    Author     : DUOTRABAJO
--%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">
<%@ page import="java.util.*"%>
<%@ page import="pe.edu.upc.dew.profesoresparticulares.model.Usuario"%>
<%@ page import="pe.edu.upc.dew.profesoresparticulares.service.UsuarioServiceImpl"%>
<%@ page import="pe.edu.upc.dew.profesoresparticulares.model.Horario"%>

<%List<Map> menus = (List<Map>)request.getSession().getAttribute("MENU");%>
 <%List<Horario> horarioDisponible = new ArrayList();%>

<%UsuarioServiceImpl objUsusarioImpl = new UsuarioServiceImpl();%>

<%List<Usuario> profesores = (List<Usuario>) objUsusarioImpl.getUsuarioProfesores();%>

<%
    if (request.getAttribute("horariosDisponibles") != null){
        horarioDisponible = (List<Horario>)request.getAttribute("horariosDisponibles");
        out.print(horarioDisponible.size() + " HORARIO");
    }
%>


<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta name="keywords" content="" />
<meta name="description" content="" />
<meta http-equiv="content-type" content="text/html; charset=utf-8" />
<title>Profesores Particulares</title>
<link href="css/style.css" rel="stylesheet" type="text/css" media="screen" />
</head>
<body>

    <s:form action="buscarHorarioDisponibleProfesor">

	<div id="header">
		<div id="logo">
			<h1><a href="#">Profesores Particulares   </a></h1>
<!--			<p> design by <a href="http://www.freecsstemplates.org/">Free CSS Templates</a></p>-->
		</div>
	</div>
	<!-- end #header -->
	<div id="menu">
		<ul>
                    <%for(int i=0; i<menus.size(); i++){%>
			<li class="" ><a href="<%=request.getContextPath()%>/<%=((Map)menus.get(i)).get("url")%>"><%=((Map)menus.get(i)).get("descripcion")%></a></li>
                    <% }%>
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

                <select name="profesor">

                     <%for(int i=0; i<profesores.size(); i++){%>
                        <option value= <%= profesores.get(i).getCodUsuario()%> >  <%= profesores.get(i).getNomUsuario()%> &nbsp;  <%= profesores.get(i).getApePaterno()%> </option>
                     <% }%>
             
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
              <td><select name="dia" size="1">
                  <option value="01">1</option>
                  <option value="02">2</option>
                  <option value="03">3</option>
                  <option value="04">4</option>
                  <option value="05">5</option>
                  <option value="06">6</option>
                  <option value="07">7</option>
                  <option value="08">8</option>
                  <option value="09">9</option>
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
              <td><select name="mes">
                  <option value="01">Enero</option>
                  <option value="02">Febrero</option>
                  <option value="03">Marzo</option>
                  <option value="04">Abril</option>
                  <option value="05">Mayo</option>
                  <option value="06">Junio</option>
                  <option value="07">Julio</option>
                  <option value="08">Agosto</option>
                  <option value="09">Septiembre</option>
                  <option value="10">Octubre</option>
                  <option value="11">Noviembre</option>
                  <option value="12">Diciembre</option>
              </select></td>
              <td>Año:</td>
              <td><select name="anho">
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

</s:form>

<s:form action="reservaHorarioDisponible">
        <table width="500" border="1" align="center">

                <tr>
                    <td><strong>Codigo Horario</strong></td>
                    <td><strong>Fecha</strong></td>
                    <td><strong>Hora</strong></td>
                    <td><strong>Lugar</strong></td>
                    <td><strong>Alumno</strong></td>
                </tr>


             <%for(int i=0; i< horarioDisponible.size(); i++){%>
                     <li class="" >

                         <%String color; %>
                         <%if(((Horario)horarioDisponible.get(i)).getNomAlumno().equals("")){
                             color = "#FFFFFF";
                         }
                         else {
                             color = "#00FFFF";
                         }
                         %>

                     <tr bgcolor=<%= color %>
                        <td> <%=((Horario)horarioDisponible.get(i)).getCodHorario()%> </td>
                        <td><%=((Horario)horarioDisponible.get(i)).getFecha()%></td>
                        <td><%=((Horario)horarioDisponible.get(i)).getHora()%></td>
                        <td><%=((Horario)horarioDisponible.get(i)).getLugar()%></td>
                        <td> <input type="submit" name="submit" value=Reservar  id=  <%=((Horario)horarioDisponible.get(i)).getCodHorario()%> /></td>
                        </tr>
                    </li>
                <% }%>
              </table>
    </s:form>
        </tr>

      </table>
	</div>
	</div>
	<!-- end #page -->
</div>
	<!-- end #footer -->
</body>


</html>
