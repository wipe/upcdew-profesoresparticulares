<%-- 
    Document   : profesores
    Created on : 04/06/2010, 11:35:53 AM
    Author     : lkina
--%>
<%@ page import="java.util.*"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html >
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
			<li class="profesores.jsp" ><a href="<%=request.getContextPath()%>/PaginaProfesor.action">Inicio Profesores</a></li>
			<li><a href="<%=request.getContextPath()%>/PaginaRegistroHorarioProfesor.action">Registro de Horario</a></li>
			<li ><a href="<%=request.getContextPath()%>/PaginaConsultaHorarioProfesor.action">Consulta Horario</a></li>
			<li><a href="<%=request.getContextPath()%>/PaginaPerfilProfesor.action">Perfil</a></li>

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
          <td height="30">Noticias</td>
        </tr>
        <tr>
          <td>Visiblement pas impressionnés par le déploiement de navires de guerre israéliens   au large de Gaza, six des sept navires qui mouillaient non loin de Chypre ont   pris le départ dimanche après-midi pour l'enclave palestinienne, a annoncé un   membre de Free Gaza, l'organisme à l'origine de la mission. Leur cargaison de   10.000 tonnes comprendrait notamment 100 maisons préfabriquées, 500 fauteuils   roulants électriques et de l'équipement médical, selon les participants. Cinq   parlementaires (d'Irlande, d'Italie, de Suède, de Norvège et de Bulgarie)   figurent aussi parmi les passagers, selon Audrey Bomse, conseillère juridique de   Free Gazasi les bateaux refusent de rebrousser chemin, de les arraisonner et les diriger   vers le port israélien d'Ashdod, au sud de Tel-Aviv, avant d'interpeller les   militants et de les renvoyer dans leur pays. Selon Tsahal, la cargaison sera   ensuite transférée à Gaza </td>
        </tr>
      </table>
	</div>
	</div>
           

	<!-- end #page -->
</div>
	<!-- end #footer -->
</body>
</html>
