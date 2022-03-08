
<%@ page import="java.util.List,br.com.alura.gerenciador.modelo.Empresa" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>

<html>
<head>
<title>Java Standard Taglib</title>
<style>

*{

padding: 0;
margin: 0;

}

</style>
</head>
<body>

	<c:import url="logout-parcial.jsp"/>

	Usuário Logado: ${usuarioLogado.login}
	
	<br><br><br>

	<c:if test="${not empty empresa}">
		Empresa ${empresa} cadastrada com sucesso!	
	</c:if> <br/>
		
	Lista de empresas: <br/><br/>
	<ul>
		<c:forEach items="${empresas}" var="empresa">
			<li>
			${empresa.nome} - <fmt:formatDate value="${empresa.dataAbertura}"
			pattern="dd/MM/yyyy"/> 
			<a href="/gerenciador/entrada?acao=MostraEmpresa&id=${empresa.id}">editar</a>
			<a href="/gerenciador/entrada?acao=RemoveEmpresa&id=${empresa.id}">remover</a>
			</li> 
			<hr/><br/>
		</c:forEach>
	</ul>

</body>
</html>