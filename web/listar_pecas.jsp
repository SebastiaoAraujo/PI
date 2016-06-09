<%-- 
    Document   : listar_pecas
    Created on : 30/05/2016, 17:39:02
    Author     : SEBASTYANN
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="br.com.oficina.dao.pecas_DAO1" %>
<%@page import="java.util.List" %>
<%@page import="br.com.oficina.modelo.cadastro_pecas1" %>
<!DOCTYPE html>
<%
  pecas_DAO1 cd = new pecas_DAO1();
  List<cadastro_pecas1> lista;
  lista = cd.listpecas();
%>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Oficina</title>
    </head>
    <body>
        <c:import url="cabecalho.jsp"/>
        <div class="corpotexto">
            <h1>Relatorio de Pecas</h1>
            <table border="1">
                <thead>
                    <tr>
                        <th>ID</th>
                        <th>CODIGO_PECA</th>
                        <th>NOME_PECA</th>
                        <th>MARCA</th>
                        <th>QUANTIDADE</th>
                        <th>ESTQ_MINIMO</th>
                        <th>VALOR_COMPRA</th>
                        <th>VALOR_VENDA</th>
                    </tr>
                </thead>
                <tbody>
                </tbody>
            </table>

        </div>
    </body>
</html>
