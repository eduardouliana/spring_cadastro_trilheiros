<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<label for="nome"> Nome: </label>
<input type="text" name="nome" id="nome" value="${grupo.nome}">
<form:errors path="grupo.nome" /><br/>

<label for="cidade"> Cidade: </label>
<input type="text" name="cidade" id="cidade" value="${grupo.cidade}">
<form:errors path="grupo.cidade" /><br/>

<label for="integrantes"> Numero de integrantes: </label>
<input type="text" name="integrantes" id="integrantes" value="${grupo.integrantes}">
<form:errors path="grupo.integrantes" /><br/>