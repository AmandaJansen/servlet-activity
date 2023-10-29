<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>


<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
  <link rel="stylesheet" href="styles.css"/>
<title>Lista de Livros em estoque</title>
</head>
<body>

<h1>Lista de produtos em estoque</h1>

<style>
.item{
background-color: #f0f0f0;
padding: 10px;
border:10px solid #ccc;
margin:10px;
border-radius: 5px;
box-shadow: 0 0 5px rgba(0,0,0,0.2)
}
</style>

<c:forEach var="produto" items="${produtos}">
<tr>
<div class="item">
<td>${produto.getNome()}<br/></td>

<td>${produto.getPreco()}<br/></td>

<td>${produto.getDescricao()}</td>

</div>

</tr>
        </c:forEach>

<a href="/">Voltar página inicial</a>
</body>
</html>