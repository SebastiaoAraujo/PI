<%-- 
    Document   : pagina1
    Created on : 27/04/2016, 16:39:49
    Author     : SEBASTYANN
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
    <head>
        <title>Ofician SA</title>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" type="text/css" href="CSS/layout.css" >
        <script type="text/javascript" src="JS/javascript1.js"></script>
    </head>
    <body>
        <c:import url="cabecalho.jsp"/>
        <div class="corpotexto">
            <br/>
            <h1 align="center">Cadastro Fornecedor</h1>
            <form name="cadastro_fornecedor" action="Controle_fornecedores1" method="POST">
                    <br/>
                    <br/>
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
                        
                            <td>Código:
                                <input type="text" readonly="readonly" name="codigo" value="<c:out value="${fornecedor.codigo}"/>" size="5" /></td>
                        <tr>
                            <td>Razão Social:</td>
                            <td><input type="text" name="razaosocial" value="<c:out value="${fornecedor.razaosocial}"/>" size="30" /></td>
                        </tr>
                        <tr>
                            <td>CNPJ:</td>
                            <td><input type="text" name="cnpj" value="<c:out value="${fornecedor.cnpj_cpf}"/>" size="30" /></td>
                            <td>Telefone:</td>
                            <td><input type="text" name="telefone" value="<c:out value="${fornecedor.telefone}"/>" size="25" /></td>
                        </tr>
                        <tr>
                            <td>E-mail:</td>
                            <td><input type="text" name="email" value="<c:out value="${fornecedor.email}"/>" size="30" /></td>
                            <td>Nome de Contato:</td>
                            <td><input type="text" name="contato" value="<c:out value="${fornecedor.contato}"/>" size="25" /></td>
                        </tr>
                        <tr>
                            <td>Endereço:</td>
                            <td><input type="text" name="endereco" value="<c:out value="${fornecedor.endereco}"/>" size="30" /></td>
                            <td>Bairro:</td>
                            <td><input type="text" name="bairro" value="<c:out value="${fornecedor.bairro}"/>" size="25" /></td>
                        </tr>
                        <tr>
                            <td>Cidade:</td>
                            <td><input type="text" name="cidade" value="<c:out value="${fornecedor.cidade}"/>" size="30" /></td>
                            <td>Estado:
                                <select name="estado">
                                    <option></option>
                                    <option value="GO" ${fornecedor.estado == 'GO' ? 'selected' : ''}>GO</option>
                                    <option value="DF" ${fornecedor.estado == 'DF' ? 'selected' : ''}>DF</option>
                                    <option value="SP" ${fornecedor.estado == 'SP' ? 'selected' : ''}>SP</option>
                                    <option value="RJ" ${fornecedor.estado == 'RJ' ? 'selected' : ''}>RJ</option>
                                    <option value="ES" ${fornecedor.estado == 'ES' ? 'selected' : ''}>ES</option>
                                </select></td>
                        </tr>
                        <tr>
                            <td>Observação:</td>
                            <td><textarea name="observacao" rows="4" cols="50"></textarea></td>
                            <td></td>
                            <td></td>
                        </tr>
                        <tr>
                            <td><input class="button-1" type="submit" value="Salvar" name="buttonsalvar"/></td>
                            <td></td>
                            <td><input class="button-1" type="reset" value="Cancelar" name="buttoncancelar" /></td>
                            <td></td>
                        </tr>
                        <tr>
                            <td></td>
                            <td></td>
                            <td></td>
                            <td></td>
                        </tr>
                    </tbody>
                </table>
            </form>
        </div> <!-- nessa parte eu fecho a div geral-->
        <c:import url="rodape.jsp"/>
    </body>
</html>
