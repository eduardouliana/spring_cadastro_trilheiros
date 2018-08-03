<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="pt-br">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Cadastro de trilheiros</title>
</head>
<body>
<form action="/trilheiro/salvar" method="post">
	<c:import url="_campos.jsp"></c:import><br/>
	
	<button type="submit">Salvar</button><br/>
	<a href="/trilheiro/listar">Cancelar</a><br/>

</form>
</body>
</html>