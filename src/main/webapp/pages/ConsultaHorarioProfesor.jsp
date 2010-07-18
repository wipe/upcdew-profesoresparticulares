<%-- 
    Document   : ConsultaHorarioProfesor
    Created on : 15/06/2010, 08:04:25 PM
    Author     : u201000225
--%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ page import="java.util.*"%>
<%@ page import="pe.edu.upc.dew.profesoresparticulares.model.Horario"%>

<%List<Map> menus = (List<Map>)request.getSession().getAttribute("MENU");%>
<%List<Horario> horariosProfesor = (List<Horario>)request.getSession().getAttribute("horariosProfesor");%>

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
                    <%for(int i=0; i<menus.size(); i++){%>
			<li class="" ><a href="<%=request.getContextPath()%>/<%=((Map)menus.get(i)).get("url")%>"><%=((Map)menus.get(i)).get("descripcion")%></a></li>
                    <% }%>
		</ul>
	</div>
	<!-- end #menu -->
	<div id="page">


        <%for(int i=0; i< horariosProfesor.size(); i++){%>
             <li class="" >
                <%=((Horario)horariosProfesor.get(i)).getCodHorario()%>
             </li>
              <li class="" >
                <%=((Horario)horariosProfesor.get(i)).getLugar()%>
             </li>
             <br></br>
             
         <% }%>

	<div id="page-bgtop">
	<div id="page-bgbtm"></div>
	</div>
	<!-- end #page -->
</div>
	<!-- end #footer -->
</body>
</html>

