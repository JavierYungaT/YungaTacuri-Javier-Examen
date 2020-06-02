<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Buscar</title>


<!-- Latest compiled and minified CSS -->
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css"
	integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u"
	crossorigin="anonymous">
	<!-- Optional theme -->
	<!-- Font Awesome -->
<link rel="stylesheet"
	href="https://use.fontawesome.com/releases/v5.8.2/css/all.css">
	<!-- Google Fonts -->
<link rel="stylesheet"
	href="https://fonts.googleapis.com/css?family=Roboto:300,400,500,700&display=swap">
	<!-- Bootstrap core CSS -->
<link
	href="https://cdnjs.cloudflare.com/ajax/libs/twitter-bootstrap/4.4.1/css/bootstrap.min.css"
	rel="stylesheet">
	<!-- Material Design Bootstrap -->
<link
	href="https://cdnjs.cloudflare.com/ajax/libs/mdbootstrap/4.15.0/css/mdb.min.css"
	rel="stylesheet">
<link
	href="https://fonts.googleapis.com/css2?family=Kaushan+Script&display=swap"
	rel="stylesheet">
<link
	href="/Yunga_Tacuri-Javier-Examen/css/index.css"
	rel="stylesheet" type="text/css" />
<link
	href="/Yunga_Tacuri-Javier-Examen/css/agenda.css"
	rel="stylesheet" type="text/css" />

<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css"
	integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm"
	crossorigin="anonymous">
<link rel="stylesheet"
	href="https://use.fontawesome.com/releases/v5.8.2/css/all.css">
<link href="../css/createAccount.css" rel="stylesheet" type="text/css" />
</head>
<body>

<!--Cabecera-->
	<header>

		<!-- Navbar -->
		<nav
			class="navbar navbar-expand-lg navbar-dark griss row scrolling-navbar fixed-top">

			<ul class="navbar-nav mr-auto" 
				style="margin-left: 35px; font-size: 22px" >
				<li class="active"><a href="#" class="nav-link"
					style="color: black;" > <span
						class="clearfix d-none d-sm-inline-block"  >PAGINA PRINCIPAL</span></a></li>
			</ul>
			<!-- Search form -->
			<form class=" col-xs-8 col-sm-4 col-md-4 col-mg-4 mr-sm-4"
				id="formulario">

				<ul>
					<li class=" col-xs-8 col-sm-4 col-md-4 col-mg-4 mr-sm-4"
						class="btn  btn-block" style="font-size: 20px;"><a
						href="/Yunga_Tacuri-Javier-Examen/JSPs/BuscarTicket.jsp" style="color: black">BUSCAR 
					</a></li>

				</ul>
			</form>





			<!-- Datos extras -->
			

			</ul>
		</nav>
	</header>
	<!--Cabecera-->


	

	<section >
		<div class="container">
			<div class="limiter">
				<div class="container-table100">
					<form action="/Yunga_Tacuri-Javier-Examen/ControladorListarPorCedula" method="post"
						style="margin-top: 60px; padding-top: 30px; width: 539px;">
						<label for="cars" style="font-size: x-large;">BUSCAR</label>
						
						<div class="form-group">
							<select id="cars" name="opcion" style="font-size: 15px;">
							<option value="cedula">Cedula</option>
							<option value="placa">Placa</option>
							

						</select> 
						<input type="text" name="parametro" placeholder="Ingrese dato"
							id="login-name" value="${parInval}"  style="font-size: 15px;">
							
							<input
							class="boton" type="submit" name="Ingresar" value="Buscar"  style="font-size: 13px;"/>
							
						</div>
						
						
						<br>
						

						<C:set var="u" value="${requestScope['usuario']}" />



					</form>
					<div class="wrap-table100">
						<div class="table100 ver1">


							<div class="wrap-table100-nextcols js-pscroll">
								<div class="table100-nextcols">
									<table class="table">
										
										<thead class="while blue-text">
											<tr class="row100 head">
												<th scope="col" style="font-size: 20px;">Numero Ticket</th>
												<th scope="col" style="font-size: 20px;">Fecha Ingreso</th>
												<th scope="col" style="font-size: 20px;">Hora Ingreso</th>
												<th scope="col" style="font-size: 20px;">Fecha Salida</th>
												<th scope="col" style="font-size: 20px;">Hora Salida</th>

											</tr>
										</thead>

										<tbody>

											<C:forEach var="ticket" items="${u.ticket}">

												<tr class="row100 body">

													<td scope="col" style="font-size: 15px; color: black;" ><a
														href="tel:${ticket.numero}">${ticket.numero}</a></td>

													<td scope="col" style="font-size: 15px; color: black;">${ticket.fechaIngreso}</td>
													<td scope="col" style="font-size: 15px; color: black;">${ticket.horaIngreso}</td>
													<td scope="col" style="font-size: 15px; color: black;">${ticket.fechaSalida}</td>
													<td scope="col" style="font-size: 15px; color: black;">${ticket.horaSalida}</td>

												</tr>
											</C:forEach>

										</tbody>
									</table>
								</div>
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>

	</section>

	
	<script src="http://code.jquery.com/jquery-1.7.1.min.js"></script>
	<script src="js/bootstrap.min.js"></script>
	<script src="js/active.js"></script>

</body>
</html>