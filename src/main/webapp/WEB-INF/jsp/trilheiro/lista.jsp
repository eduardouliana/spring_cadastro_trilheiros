<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="pt-br">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Lista de Trilheiros</title>
</head>
<body>

	<a href="/trilheiro/novo">Novo Trilheiro</a>
	<table>
		<thead>
			<tr>
				<th>Código</th>
				<th>Nome</th>
				<th>Idade</th>
				<th>Moto</th>
				<th>Grupo</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${trilheiros}" var="trilheiro">
				<tr>
					<td>
						<a href="/trilheiro/visualizar/${trilheiro.codigo}">${trilheiro.codigo}</a>
					</td>
					<td>${trilheiro.nome}</td>
					<td>${trilheiro.idade}</td>
					<td>${trilheiro.moto.modelo}</td>
					<td>${trilheiro.grupo.nome}</td>
				</tr>
			</c:forEach>
		</tbody>
	</table>


</body>
</html>