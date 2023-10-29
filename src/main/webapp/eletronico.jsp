<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page import="br.com.activity.classes.Eletronico"%>



<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
  <link rel="stylesheet" href="styles.css"/>
<title>Lista de produtos</title>

</head>
<body>

<h1>Lista de eletrônicos </h1>
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


<c:forEach var="electronics" items="${eletros}">

<div class="item">
<tr>
<td>${electronics.getNome()}<br/></td>
<td>${electronics.getPreco()}<br/></td>
<td>${electronics.getDescricao()}<br/></td>
</div>
</tr>
 </c:forEach>


<a href="/">Voltar página inicial</a>
</body>
</html>