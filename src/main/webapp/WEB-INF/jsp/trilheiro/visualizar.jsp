<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="pt-br">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Alterar trilheiro</title>
</head>
<body>
	<form action="/trilheiro/alterar" method="post">
		<input type="hidden" name="codigo" value="${trilheiro.codigo}">
		<c:import url="_campos.jsp"></c:import><br/>

		<button type="submit">Salvar</button><br/>
		
		<a href="/trilheiro/listar">Cancelar</a> <br/>
		<a href="/trilheiro/deletar/${trilheiro.codigo}">Deletar</a><br/>

	</form>
</body>
</html>