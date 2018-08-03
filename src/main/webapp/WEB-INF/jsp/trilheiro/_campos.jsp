<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<label for="nome"> Nome: </label>
<input type="text" name="nome" id="nome" value="${trilheiro.nome}">
<form:errors path="trilheiro.nome" /><br/>

<label for="idade"> Idade: </label>
<input type="text" name="idade" id="idade" value="${trilheiro.idade}">
<form:errors path="trilheiro.idade" /><br/>

<label for="moto">Moto:</label>
<select id="moto" name="moto.codigo">
	<c:forEach items="${motos}" var="moto">
		<c:set var="selecionado" value="" />
		<c:if test="${moto.codigo eq trilheiro.moto.codigo}">
			<c:set var="selecionado" value="selected" />
		</c:if>
		<option value="${moto.codigo}" ${selecionado}>${moto.modelo}
	</c:forEach>
</select><br/>

<label for="grupo">Grupo:</label>
<select id="grupo" name="grupo.codigo">
	<c:forEach items="${grupos}" var="grupo">
		<c:set var="selecionado" value="" />
		<c:if test="${grupo.codigo eq trilheiro.grupo.codigo}">
			<c:set var="selecionado" value="selected" />
		</c:if>
		<option value="${grupo.codigo}" ${selecionado}>${grupo.nome}
	</c:forEach>
</select><br/>

