 <%--
    Document   : registroHorario
    Created on : 04/06/2010, 11:39:31 AM
    Author     : lkina
--%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">
<%@ page import="java.util.*, pe.edu.upc.dew.profesoresparticulares.model.*"%>
<%List<Map> menus = (List<Map>)request.getSession().getAttribute("MENU");%>
<%List<Curso> cursos = (List<Curso>)request.getAttribute("CURSOS");%>
<%List<Horario> horarios = (List<Horario>)request.getAttribute("HORARIO");%>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta name="keywords" content="" />
<meta name="description" content="" />
<meta http-equiv="content-type" content="text/html; charset=utf-8" />
<title>Profesores Particulares</title>
<link href="css/style.css" rel="stylesheet" type="text/css" media="screen" />

<script src="js/calendar/jscal2.js"></script>
<script src="js/calendar/lang/es.js"></script>

<link rel="stylesheet" type="text/css" href="css/calendar/jscal2.css" />
<link rel="stylesheet" type="text/css" href="css/calendar/border-radius.css" />
<link rel="stylesheet" id="compact" type="text/css" href="css/calendar/reduce-spacing.css" />

</head>

<body>

<%--<form name="horario" action="<%=request.getContextPath()%>/registrarHorario.action"
      method="post">--%>

<s:form action="registrarHorario">

<table style="float: left; margin: 0 1em 1em 0"><tr><td>
<div id="calendar-container"></div>
<div id="calendar-info" style="text-align: center; margin-top: 0.3em"></div>
</td></tr></table>
<script type="text/javascript">//<![CDATA[
Calendar.setup({
    cont          : "calendar-container",
    weekNumbers   : true,
    selectionType : Calendar.SEL_MULTIPLE,
    selection     : Calendar.dateToInt(new Date()),
    showTime      : 12,
    onSelect      : function() {
        var count = this.selection.countDays();
        if (count == 1) {
            var date = this.selection.get()[0];
            date = Calendar.intToDate(date);
            date = Calendar.printDate(date, "%A, %B %d, %Y");
            $("calendar-info").innerHTML = date;
        } else {

        }
    },
    onTimeChange  : function(cal) {
        var h = cal.getHours(), m = cal.getMinutes();
        // zero-pad them
        if (h < 10) h = "0" + h;
        if (m < 10) m = "0" + m;
        $("calendar-info").innerHTML = Calendar.formatString("Time changed to ${hh}:${mm}", {
            hh: h,
            mm: m
        });
    }
});
//]]></script>
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
	  <table width="617" border="0">
        <tr>
          <td width="55" height="42">&nbsp;</td>
          <td width="371">&nbsp;</td>
          <td width="177">&nbsp;</td>
        </tr>
        <tr>
          <%--<td height="35"><strong>Curso</strong></td>--%>
          <td>
              <s:select name="curso" list="cursos" listKey="codCurso" listValue="nomCurso" label="Curso"/>
          </td>
          </tr>
          <tr>
          <td height="35"><strong>Fecha</strong></td>
          <td><table width="200" border="0">
            <tr>
              <td><input id="fecha" name="fecha"/></td>
              <td><button type="button" id="calendar-trigger">...</button></td>
              <td></td>
              <td></td>
              <td></td>
              <td></td>
            </tr>
          </table></td>
          <td>&nbsp;</td>
        </tr>

        <tr>
          <td height="17"><strong>Lugar</strong></td>
          <td><label>
            <input type="text" name="lugar" />
          </label></td>
          <td>&nbsp;</td>
        </tr>
        <tr>
          <td><strong>Costo</strong></td>
          <td><input type="text" name="costo" /></td>
          <td>&nbsp;</td>
        </tr>
        <tr>
          <%--<td><strong>Hora Inicio</strong></td>--%>
          <td><s:select name="hora" list="horaList" listKey="clave" listValue="descripcion" label="Hora Inicio"/>
          </td>
          <td>&nbsp;</td>
        </tr>
        <tr>
          <%--<td><strong>Horas</strong></td>--%>
          <td><s:select name="horas" list="horasList" listKey="clave" listValue="descripcion" label="Horas"/>
          </td>
          <td>&nbsp;</td>
        </tr>
        <tr>
          <%--<td>&nbsp;</td>--%>
          <%--<td>--%>
              <s:submit value="Grabar"/>
              <%--<input name="submit2" type="button" id="submit" value="Borrar" /></td>--%>
          <%--<td>&nbsp;</td>--%>
        </tr>
        <tr>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
        </tr>
        <tr>
            <td><s:actionerror /></td>
         <td><s:fielderror /></td>
        </tr>
      </table>
              <script>//<![CDATA[
Calendar.setup({ trigger: "calendar-trigger", inputField: "fecha" });
//]]></script>

        <%if(horarios!=null&&horarios.size()>0){%>

        <table border="1" cellspacing="1" cellpadding="1">
                 <thead>
                 <th>Curso</th>
                 <th>Fecha</th>
                 <th>Lugar</th>
                 <th>Costo</th>
                 <th>Horas</th>
                 </thead>
                 <tbody>
                     <%for(Horario horario : horarios){%>
                     <tr id="patron">
                         <td id="curso"><%=horario.getNomCurso()%></td>
                         <td id="fecha"><%=horario.getFecha()%></td>
                         <td id="lugar"><%=horario.getLugar()%></td>
                         <td id="costo"><%=horario.getCosto()%></td>
                         <td id="horas"><%=horario.getDescHora()%></td>
                     </tr>
                     <%}%>
                 </tbody>
             </table>
        <%}%>

	</div>
	</div>
	<!-- end #page -->
</div>
	<!-- end #footer -->
    <%--</form>--%>
    </s:form>
</body>

</html>