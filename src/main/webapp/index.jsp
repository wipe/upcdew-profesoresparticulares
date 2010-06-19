<%@ taglib prefix="s" uri="/struts-tags"%>
<html>
    <title>Profesores Particulares</title>
    <head>
        <link href="css/style.css" rel="stylesheet" type="text/css" media="screen" />
    </head>
    <body>
        <div id="wrapper">
            <div id="header">
                <div id="logo">
                    <h1><a href="#">Profesores Particulares   </a></h1>
                    <!--			<p> design by <a href="http://www.freecsstemplates.org/">Free CSS Templates</a></p>-->
                </div>
            </div>
            <!-- end #header -->
            <div id="menu">
                <ul>
                    <li class="current_page_item"><a href="#">Inicio</a></li>

                </ul>
            </div>
            <!-- end #menu -->
            <div id="page">
                <div id="page-bgtop">
                    <div id="page-bgbtm">
                        <div id="content">
                            <!-- <div class="post">
				<h2 class="title"><a href="#">Lorem ipsum sed aliquam</a></h2>
				<p class="meta"><span class="date">September 10, 2009</span><span class="posted">Posted by <a href="#">Someone</a></span></p>
				<div style="clear: both;">&nbsp;</div>
				<div class="entry">
					<p>Sed lacus. Donec lectus. Nullam pretium nibh ut turpis. Nam bibendum. In nulla tortor, elementum vel, tempor at, varius non, purus. Mauris vitae nisl nec metus placerat consectetuer. Donec ipsum. Proin imperdiet est. Phasellus <a href="#">dapibus semper urna</a>. Pellentesque ornare, orci in consectetuer hendrerit, urna elit eleifend nunc, ut consectetuer nisl felis ac diam. Etiam non felis. Donec ut ante. In id eros. Suspendisse lacus turpis, cursus egestas at sem.  Mauris quam enim, molestie in, rhoncus ut, lobortis a, est.</p>
					<p class="links"><a href="#">Read More</a>&nbsp;&nbsp;&nbsp;&nbsp;|&nbsp;&nbsp;&nbsp;&nbsp;<a href="#">Comments</a></p>
				</div>
			</div>
			<div class="post">
				<h2 class="title"><a href="#">Consecteteur hendrerit </a></h2>
				<p class="meta"><span class="date">September 10, 2009</span><span class="posted">Posted by <a href="#">Someone</a></span></p>
				<div style="clear: both;">&nbsp;</div>
				<div class="entry">
					<p>Sed lacus. Donec lectus. Nullam pretium nibh ut turpis. Nam bibendum. In nulla tortor, elementum vel, tempor at, varius non, purus. Mauris vitae nisl nec metus placerat consectetuer. Donec ipsum. Proin imperdiet est. Phasellus <a href="#">dapibus semper urna</a>. Pellentesque ornare, orci in consectetuer hendrerit, urna elit eleifend nunc, ut consectetuer nisl felis ac diam. Etiam non felis. Donec ut ante. In id eros. Suspendisse lacus turpis, cursus egestas at sem.  Mauris quam enim, molestie in, rhoncus ut, lobortis a, est.</p>
					<p class="links"><a href="#">Read More</a>&nbsp;&nbsp;&nbsp;&nbsp;|&nbsp;&nbsp;&nbsp;&nbsp;<a href="#">Comments</a></p>
				</div>
			</div>-->
                            <div id="login">
                                <form id="form1" name="login" method="post"
                                      action="<%=request.getContextPath()%>/login.action" onSubmit="">
                                    <div>
                                        <table width="200" border="0">
                                            <tr>
                                                <td width="38">Login</td>
                                                <td width="146"><input type="text" name="usuario" id="usuario"  /></td>
                                            </tr>
                                            <tr>
                                                <td>Password</td>
                                                <td><input type="password" name="password" id="password"  /></td>
                                            </tr>
                                            <tr>
                                                <td>&nbsp;</td>
                                                <td><input name="submit" type="submit" id="search-submit" value="Ingresar" /></td>
                                            </tr>
                                            <tr>
                                                <td>&nbsp;</td>
                                                <td><a href="#">Registro Profesores</a></td>
                                            </tr>
                                            <tr>
                                                <td>&nbsp;</td>
                                                <td><a href="#">Regsitro Alumnos</a></td>
                                            </tr>
                                        </table>
                                    </div>
                                </form>
                            </div>
                            <div style="clear: both;">&nbsp;</div>
                        </div>
                        <!-- end #content -->
                        <!-- end #sidebar -->
                        <div style="clear: both;">&nbsp;
                            <p>&nbsp;</p>
                        </div>
                    </div>
                </div>
            </div>
            <!-- end #page -->
        </div>
        <div id="footer">
            <p>Copyright (c) 2008 Sitename.com. All rights reserved. Design by <a href="http://www.freecsstemplates.org/">Free CSS Templates</a>.</p>
        </div>
        <!-- end #footer -->


    </body>
</html>
