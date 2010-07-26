<%-- 
    Document   : Alumnos
    Created on : 16/06/2010, 12:15:31 PM
    Author     : DUOTRABAJO
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ page import="java.util.*"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">
<%List<Map> menus = (List<Map>)request.getSession().getAttribute("MENU");%>
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
			<li class="profesores.jsp" ><a href="<%=request.getContextPath()%>/<%=((Map)menus.get(i)).get("url")%>"><%=((Map)menus.get(i)).get("descripcion")%></a></li>
                    <% }%>
		</ul>
	</div>
	<!-- end #menu -->
	<div id="page">
	<div id="page-bgtop">
	<div id="page-bgbtm">
	  <table width="622" border="0">
        <tr>
          <td height="56">&nbsp;</td>
        </tr>
        <tr>
          <td height="30">Noticias de interés </td>
        </tr>
        <tr>
          <td>El grupo de Profesores Particulares te da la bienvenida y agradece tu elección. Este site ha sido creado para beneficiar tanto a  profesores como alumnos que en sus tiempos libres desean dictar y reforzar, respectivamente, algunos temas de interes común. &nbsp;
              Además, permite a los profesores programar sus horarios de dictado de clases según el tiempo que ellos disponga y a los alumnos ver los horarios disponibles segun el curso que elijan.&nbsp;
              Los profesores podran programar el curso, horario y lugar a dictar. Los alumnos aparte de separar y recibir una tutoria, podran evaluar y dejar un comentario sobre el profesor con el que tuvo la clase. Así. otros alumnos veran los comentarios dejados antes de separar una tutoria.</td>
        </tr>
      </table>
	</div>
	</div>
	<!-- end #page -->
</div>
	<!-- end #footer -->
</body>
</html>

