<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="pt-br">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Alterar grupos</title>
</head>
<body>
	<form action="/grupo/alterar" method="post">
		<input type="hidden" name="codigo" value="${grupo.codigo}">
		<c:import url="_campos.jsp"></c:import>

		<button type="submit">Salvar</button><br/>
		
		<a href="/grupo/listar">Cancelar</a> <br/>
		<a href="/grupo/deletar/${grupo.codigo}">Deletar</a>

	</form>
</body>
</html>