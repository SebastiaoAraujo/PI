<%-- 
    Document   : pagina1
    Created on : 27/04/2016, 16:39:49
    Author     : SEBASTYANN
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="cabecalho.jsp" %>
<!DOCTYPE html>
<html>
    <head>
        <title>Ofician SA</title>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="CSS/layout.css" rel="stylesheet">
    </head>
    <body>
        <div class="corpotexto">
        <h1>Cadastro de Peças</h1>
                <form name="controle_pecas" action="controle_pecas1" method="POST">
                    <table class="cadastro">
                        <thead>
                            <tr>
                                <th></th>
                                <th></th>
                                <th></th>
                                <th></th>
                            </tr>
                        </thead>
                        <tbody>
                            <tr>
                                <td>ID:<input type="text" name="id" size="10" disabled=""/></td>
                            </tr>
                            <tr>
                                <td>Nome da Peca:</td>
                                <td><input type="text" name="nomepeca" value="" size="30" /></td>
                                <td>Marca da Peça:</td>
                                <td><input type="text" name="marcapeca" size="30"/></td>
                            </tr>
                            <tr>
                                <td>Codigo da Peça:</td>
                                <td><input type="text" name="codigopeca" value="" size="10" /></td>
                                <td>Quantidade:</td>
                                <td><input type="text" name="quantidade" value="" size="10" /></td>
                            </tr>
                            <tr>
                                <td>Estoque Minimo:</td>
                                <td><input type="text" name="estoqueminimo" value="" size="10" /></td>
                            </tr>
                            <tr>
                                <td>Valor de Compra:</td>
                                <td><input type="text" name="valocompra" value="" size="10" /></td>
                                <td>Valor de Venda:</td>
                                <td><input type="text" name="valorvenda" value="" size="10" /></td>
                            </tr>
                            <tr>
                                <td>Observação:</td>
                                <td><textarea name="observacao" rows="4" cols="50"></textarea></td>
                            </tr>
                            <tr>
                                <td><input class="button-1" type="submit" value="Salvar" name="salvar" /></td>
                                <td></td>
                                <td><input class="button-1" type="reset" value="Cancelar" name="cancelar" /></td>
                            </tr>
                    </table>
                </form>
        </div>
        <c:import url="rodape.jsp"/>
    </body>
</html>
