<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="pt-br">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Alterar motos</title>
</head>
<body>
	<form action="/moto/alterar" method="post">
		<input type="hidden" name="codigo" value="${moto.codigo}">
		<c:import url="_campos.jsp"></c:import>

		<button type="submit">Salvar</button><br/>
		
		<a href="/moto/listar">Cancelar</a> <br/>
		<a href="/moto/deletar/${moto.codigo}">Deletar</a><br/>

	</form>
</body>
</html>