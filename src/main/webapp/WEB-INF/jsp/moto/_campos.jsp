<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<label for="marca"> Marca: </label>
<input type="text" name="marca" id="marca" value="${moto.marca}">
<form:errors path="moto.marca" /><br/>

<label for="modelo"> Modelo: </label>
<input type="text" name="modelo" id="modelo" value="${moto.modelo}">
<form:errors path="moto.modelo" /><br/>

<label for="cilindrada"> Cilindradas: </label>
<input type="text" name="cilindrada" id="cilindrada" value="${moto.cilindrada}">
<form:errors path="moto.cilindrada" /><br/>

<label for="cor"> Cor: </label>
<input type="text" name="cor" id="cor" value="${moto.cor}">
<form:errors path="moto.cor" /><br/>