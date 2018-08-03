<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="pt-br">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Lista de grupos</title>
</head>
<body>

	<a href="/grupo/novo">Novo grupo</a>
	<table>
		<thead>
			<tr>
				<th>Código</th>
				<th>Nome</th>
				<th>Cidade</th>
				<th>Número de integrantes</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${grupos}" var="grupo">
				<tr>
					<td>
						<a href="/grupo/visualizar/${grupo.codigo}">${grupo.codigo}</a>
					</td>
					<td>${grupo.nome}</td>
					<td>${grupo.cidade}</td>
					<td>${grupo.integrantes}</td>
				</tr>
			</c:forEach>
		</tbody>
	</table>


</body>
</html>