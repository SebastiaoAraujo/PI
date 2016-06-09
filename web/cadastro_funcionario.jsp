<%-- 
    Document   : pagina1
    Created on : 27/04/2016, 16:39:49
    Author     : SEBASTYANN
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="cabecalho.jsp" %>
<html>
    <head>
        <title>Ofician SA</title>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="CSS/layout.css" rel="stylesheet">
    </head>
    <body>
        <div class="corpotexto">
            
            <h1>Cadastro Funcionario</h1>
            
            <div id="formfuncionario">
            <form name="cadastro_funcionario" action="" method="POST">
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
                            <td>Codigo <input type="text" name="codigo" value="" size="8" disabled="disabled" /></td>
                        </tr>
                            <td>Nome Completo:</td>
                            <td><input type="text" name="nome_completo" value="" size="50" /></td>
                            <tr>
                                <td>Endereço:</td>
                    <td><input type="text" name="endereco" value="" size="50" /></td>
                            
                    <td>Bairro:</td>
                    <td><input type="text" name="bairro" value="" size="30" /></td>
                            </tr>
                            <tr>
                    <td> E-mail:</td>
                            <td><input type="text" name="email" value="" size="25" /></td>
                    <td>Telefone:</td>
                            <td><input type="text" name="telefone" value="" size="30" /></td>
                            </tr>
                            <tr>
                                <td>Cidade:</td>
                                <td><input type="text" name="cidade" value="" size="25" /></td>
                                <td>Estado:
                                <select name="estado">
                    <option></option>
                    <option value="GO" ${fornecedor.estado == 'GO' ? 'selected' : ''}>GO</option>
                    <option value="DF" ${fornecedor.estado == 'DF' ? 'selected' : ''}>DF</option>
                    <option value="ES" ${fornecedor.estado == 'ES' ? 'selected' : ''}>ES</option>
                    <option value="RJ" ${fornecedor.estado == 'RJ' ? 'selected' : ''}>RJ</option>
                    <option value="BH" ${fornecedor.estado == 'BH' ? 'selected' : ''}>BH</option>
                    <option value="TO" ${fornecedor.estado == 'TO' ? 'selected' : ''}>TO</option>
                    <option value="SP" ${fornecedor.estado == 'SP' ? 'selected' : ''}>SP</option>
                    <option value="RS" ${fornecedor.estado == 'RS' ? 'selected' : ''}>RS</option>
                    <option value="SC" ${fornecedor.estado == 'SC' ? 'selected' : ''}>SC</option>
                </select>
                                </td>
                            <tr>
                                <td>Usuario:</td>
                                <td><input type="text" name="usuario" value="" size="25" /></td>
                        
                            </tr>
                            <tr>
                                <td>Senha:</td>
                                <td><input type="text" name="senha" value="" size="25" /></td>
                            </tr>
                            <tr>
                                <td>Departamento:</td>
                                <td><input type="text" name="departamento" value="" size="25" /></td>
                            </tr>
                            <tr>
                                <td>Observações:</td>
                                <td><textarea name="observacao" rows="4" cols="50"></textarea></td>
                            </tr>
                        <td><input class="button-1" type="submit" value="Salvar" name="salvar" /></td>
                        <td></td>
                        <td></td>
                        <td> <input class="button-1" type="reset" value="Cancelar" name="cancelar" /></td>
                    </tr>
                </table>
                        
            </form>
            </div>
        </div> <!--fecha a divi corpo do texto -->
        <c:import url="rodape.jsp"/> <!--importa a pagina rodape -->
    </body>
</html>
