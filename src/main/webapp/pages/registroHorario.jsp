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
<%List<Horario> horarios = (List<Horario>)request.getAttribute("HORARIOS");%>
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
<script type="text/javascript">
    function borrar() {
        var form = document.forms[0];
        form.action = "<%=request.getContextPath()%>/borrarHorario.action";
        document.getElementsByTagName("form")[0].submit();
    }
</script>
<body><form name="horario" action="<%=request.getContextPath()%>/registrarHorario.action" method="post">


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
          <td height="35"><strong>Curso</strong></td>
          <td><select name="curso">
                  <%for(int i=0; i<cursos.size(); i++){%>
                    <option value="<%=((Curso)cursos.get(i)).getNomCurso()%>"><%=((Curso)cursos.get(i)).getNomCurso()%></option>
                  <% }%>
              </select>
          </td>
          </tr>
          <tr>
          <td height="35"><strong>Fecha</strong></td>
          <td><table width="200" border="0">
            <tr>
              <td id="cal"></td>
              <td></td>
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
          <td><strong>Horas</strong></td>
          <td><select name="horas">
                  <option value="1">1</option>
                  <option value="2">2</option>
                  <option value="3">3</option>
                  <option value="4">4</option>
                  <option value="5">5</option>
                  <option value="6">6</option>
              </select>
          </td>
          <td>&nbsp;</td>
        </tr>
        <tr>
          <td>&nbsp;</td>
          <td><input name="submit" type="submit" id="search-submit" value="Grabar" />
              <input name="submit2" type="button" id="submit" value="Borrar" 
                     onclick="borrar()" /></td>
          
          <td>&nbsp;</td>
        </tr>
        <tr>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
          <td>&nbsp;</td>
        </tr>
      </table>

              <table>

              </table>
	</div>
	</div>
	<!-- end #page -->
</div>
	<!-- end #footer -->
    </form>
</body>
<script>//<![CDATA[

// initial dates
      var now = new Date();

      // create the calendars
      var cal1 = Calendar.setup({ 
          cont: "cal",
          date: now,
          stylesheet: "compact",
          weekNumbers: true
        });

      // this hack is necessary to prevent infinite recursion
      var updating = false;
 //]]></script>


</html>
