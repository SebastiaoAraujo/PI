<%-- 
    Document   : teste_1
    Created on : 09/05/2016, 11:12:17
    Author     : SEBASTYANN
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page import="br.com.oficina.modelo.Cadastro_fornecedores1"%>
<%@page import="br.com.oficina.dao.fornecedor_DAO1"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" type="text/css" href="CSS/layout.css"/>
        <title>Oficina</title>
    </head>
    <body>
        <c:import url="cabecalho.jsp"/>
        <div class="corpotexto">
            <h1>Relatorio de Fornecedores</h1>
            <table class="cadastro" border="1">
                <thead>
                <tr>
                    <th>Codigo</th>
                    <th>Razao Social</th>
                    <th>CNPJ</th>
                    <th>Endereço</th>
                    <th>Bairro</th>
                    <th>Telefone</th>
                    <th>Cidade</th>
                    <th>Estado</th>
                    <th>E-mail</th>
                    <th>Contato</th>
                  <!--  <th>Observação</th>-->
                  <th colspan="=2">Ação</th>
                </tr>
                </thead>
                <tbody>
                    <c:forEach items="${fornecedores}" var="fornecedor">
                <tr>
                    <td><c:out value="${fornecedor.codigo}"/></td> <!--o valor que coloca em chaves{} é o valor da var="" -->
                    <td><c:out value="${fornecedor.razaosocial}"/></td>
                    <td><c:out value="${fornecedor.cnpj_cpf}"/></td>
                    <td><c:out value="${fornecedor.endereco}"/></td>
                    <td><c:out value="${fornecedor.bairro}"/></td>
                    <td><c:out value="${fornecedor.telefone}"/></td>
                    <td><c:out value="${fornecedor.cidade}"/></td>
                    <td><c:out value="${fornecedor.estado}"/></td>
                    <td><c:out value="${fornecedor.email}"/></td>
                    <td><c:out value="${fornecedor.contato}"/></td>
                    <td><a href="Controle_fornecedores1?action=edit&codigo=<c:out value="${fornecedor.codigo}"/>"><button>Alterar</button></a></td>
                    <td><a href="Controle_fornecedores1?action=delete&codigo=<c:out value="${fornecedor.codigo}"/>"><button>Deletar</button></a></td>
                </tr>
                    </c:forEach>
                </tbody>
            </table>
        </div>
                <c:import url="rodape.jsp"/>
    </body>
</html>
