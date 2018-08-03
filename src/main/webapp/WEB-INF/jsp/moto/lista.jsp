<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="pt-br">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Lista de Motos</title>
</head>
<body>

	<a href="/moto/novo">Nova moto</a>
	<table>
		<thead>
			<tr>
				<th>Código</th>
				<th>Marca</th>
				<th>Modelo</th>
				<th>Cilindradas</th>
				<th>Cor</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${motos}" var="moto">
				<tr>
					<td>
						<a href="/moto/visualizar/${moto.codigo}">${moto.codigo}</a>
					</td>
					<td>${moto.marca}</td>
					<td>${moto.modelo}</td>
					<td>${moto.cilindrada}</td>
					<td>${moto.cor}</td>
				</tr>
			</c:forEach>
		</tbody>
	</table>


</body>
</html>