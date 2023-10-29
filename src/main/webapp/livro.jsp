<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page import="br.com.activity.classes.Livro"%>



<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
  <link rel="stylesheet" href="styles.css"/>

<title>Lista de produtos</title>

</head>
<body>


<h1>Lista de livros </h1>

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

<c:forEach var="livros" items="${livros}">
<div class="item">
<tr>
<td>${livros.getNome()}<br/></td>
<td>${livros.getPreco()}<br/></td>
<td>${livros.getDescricao()}<br/></td>
<td>${livros.getAutor()}<br/></td>
<td>${livros.mostrarPaginas()}<br/></td>

</div>
</tr>

 </c:forEach>
<a href="/">Voltar página inicial</a>
</body>
</html>