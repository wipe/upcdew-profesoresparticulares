
<%@taglib prefix="s" uri="/struts-tags"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">
<%@ page import="java.util.*"%>
<%@ page import="pe.edu.upc.dew.profesoresparticulares.model.Horario"%>
<%@ page import="pe.edu.upc.dew.profesoresparticulares.model.Usuario"%>
<%@ page import="pe.edu.upc.dew.profesoresparticulares.util.Constantes"%>


<%List<Map> menus = (List<Map>)request.getSession().getAttribute("MENU");%>
<%ArrayList<Horario> horariosProfesor = (ArrayList<Horario>) request.getAttribute("horariosReservados");%>
<%Usuario objUsuario = (Usuario)request.getSession().getAttribute(Constantes.USUARIO);%>


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
                    <%for(int i=0; i<menus.size(); i++){%>
			<li class="" ><a href="<%=request.getContextPath()%>/<%=((Map)menus.get(i)).get("url")%>"><%=((Map)menus.get(i)).get("descripcion")%></a></li>
                    <% }%>
		</ul>
	</div>
	<!-- end #menu -->
	<div id="page">
             <table width="500" border="0" align="center">
              <tr>
                    <td></td>
                    <td></td>
                    <td>&nbsp;</td>
                    <td>&nbsp;</td>
                </tr>
                <tr>
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
                </tr>
             </table>

        

            <s:form action="cancelarReserva">

            <table width="500" border="1" align="center">

                 <tr>
                    <td><strong>Codigo Horario</strong></td>
                    <td><strong>Profesor</strong></td>
                    <td><strong>Fecha</strong></td>
                    <td><strong>Hora</strong></td>
                    <td><strong>Lugar</strong></td>
                     <td></td>

                </tr>

                  <%for(Horario h : horariosProfesor){%>
                    <%if (h.getCodAlumno()== objUsuario.getCodUsuario()) {%>

                        <tr>
                             <td><%=h.getCodHorario()%></td>
                             <td><%=h.getNomProfesor()%></td>
                             <td><%=h.getFecha()%></td>
                             <td><%=h.getDescHora()%></td>
                             <td><%=h.getLugar()%></td>
                             <td><input type="radio" name="codHorarioReserva" value= <%=h.getCodHorario()%> /></td>
                        </tr>
                    <% }%>
                <% }%>

            </table>


                <table width="500" border="0" align="center">
                            <td>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</td>
                            <td>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</td>
                            <td>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</td>
                            <td>
                                 <input type="submit" name="BorrarHorario" value="Borrar Horario" />
                            </td>
                            <td>&nbsp;</td>
                 </table>
                 
        </s:form>

	<div id="page-bgtop">
	<div id="page-bgbtm"></div>
	</div>
	<!-- end #page -->
</div>
	<!-- end #footer -->
</body>
</html>
