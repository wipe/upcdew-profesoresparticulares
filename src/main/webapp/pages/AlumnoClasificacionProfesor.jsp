<%@ page import="java.util.*,pe.edu.upc.dew.profesoresparticulares.model.*"%>
<%List<Map> menus = (List<Map>) request.getSession().getAttribute("MENU");%>
<%Usuario usuario = (Usuario) request.getSession().getAttribute("USUARIO");%>
<%List<Usuario> profesor = (List<Usuario>) request.getAttribute("PROFESORES");%>
<%List<Calificacion> calificacionAlumno = (List<Calificacion>) request.getAttribute("CALIFICACIONALUMNO");%>

<html xmlns="http://www.w3.org/1999/xhtml">
    <head>
        <meta name="keywords" content="" />
        <meta name="description" content="" />
        <meta http-equiv="content-type" content="text/html; charset=utf-8" />
        <title>Profesores Particulares</title>
        <link href="css/style.css" rel="stylesheet" type="text/css" media="screen" />


        <script type="text/javascript">
            function mostrarCalificaciones() {

                alert("Elemento seleccionado" + this.getElementById.("cmbProfesores").selectedIndex)
                /*
                var form = document.forms[0];
                form.action = "<%=request.getContextPath()%>/borrarHorario.action";
                document.getElementsByTagName("form")[0].submit();*/
            }
        </script>




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
                <%for (int i = 0; i < menus.size(); i++) {%>
                <li class="" ><a href="<%=request.getContextPath()%>/<%=((Map) menus.get(i)).get("url")%>"><%=((Map) menus.get(i)).get("descripcion")%></a></li>
                <% }%>

            </ul>
        </div>
        <!-- end #menu -->
        <div id="page">
            <div id="page-bgtop">
                <div id="page-bgbtm">
                    <table width="622" border="0">
                        <tr>
                            <td height="30" colspan="8"><div align="center"><strong>Calificación de Profesores </strong></div></td>
                        </tr>
                        <tr>
                            <td width="55" height="30">&nbsp;</td>
                            <td width="76">Profesor</td>
                            <td width="255"><label>
                                    <select name="cmbProfesores" id="cmbProfesores" onchange="mostrarCalificaciones">
                                        <option value="1">Juan Perez</option>
                                        <option value="2">Luis Palma</option>

                                    </select>
                                </label></td>
                            <td width="125">&nbsp;</td>
                            <td width="19">&nbsp;</td>
                            <td width="19">&nbsp;</td>
                            <td width="19">&nbsp;</td>
                            <td width="20">&nbsp;</td>
                        </tr>
                        <tr>
                            <td>&nbsp;</td>
                            <td>Calificacion</td>
                            <td><label>
                                    <select name="cmbCalificaciones" id="cmbCalificaciones">
                                        <option value="1">1</option>
                                        <option value="2">2</option>
                                        <option value="3">3</option>
                                        <option value="4">4</option>
                                        <option value="5">5</option>
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
                            <td>Comentario:</td>
                            <td><form name="form1" method="post" action="">
                                    <label>
                                        <textarea name="textarea" cols="70"></textarea>
                                    </label>
                                </form>          </td>
                            <td>&nbsp;</td>
                        </tr>
                        <tr>
                            <td>&nbsp;</td>
                            <td>&nbsp;</td>
                            <td><input type="submit" name="grabar" value="Grabar"/></td>
                            <td>&nbsp;</td>
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
                            <td>&nbsp;</td>
                        </tr>
                        <tr>
                            <td colspan="8">Lista de calificaciones </td>
                        </tr>

                        <table width="500" border=1 cellspacing=0 cellpadding=2 bordercolor="666633">
                            <tr class= "EtiquetaForm">
                                <td width="1600" ><strong>Fecha Calificacion</strong></td>
                                <td width="1200"><strong>Profesor</strong></td>
                                <td width="800"><strong>Calificacion</strong></td>
                                <td width="2000"> <strong>Comentario</strong></td>
                            </tr>
                            <c:forEach var="calificacion" items="${calificacionAlumno}">
                                <tr class= "EtiquetaForm" >
                                    <td>${calificacion.fecha}</td>
                                    <td>${calificacion.codprofesor}</td>
                                    <td>${calificacion.calificacion}</td>
                                    <td>${calificacion.comentario}</td>
                                </tr>
                            </c:forEach>

                        </table>


                        <tr>
                            <td>&nbsp;</td>
                            <td>&nbsp;</td>
                            <td><label>
                                    <!-- <input type="button" value="Salir" onClick="window.location = 'principal.jsp';"> -->

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

