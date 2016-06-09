package br.com.oficina.dao;
import br.com.oficina.conexao.*;
import br.com.oficina.modelo.*;
import java.sql.*;
import java.util.*;


/**
 *
 * @author SEBASTYANN
 */
public class fornecedor_DAO1{
    conecta co = new conecta();
    private Connection connection;
    
    public fornecedor_DAO1(){
        connection = co.getConnection();
    }
    
    public void addfornecedor (Cadastro_fornecedores fornecedor){
        try{
            PreparedStatement preparedStatement = connection.prepareStatement(""
                    + "insert into cadastro_fornecedor( razao_social, cnpj_cpf, endereco, bairro, telefone, cidade, estado, email,"
                    + "contato,observacao) values (?,?,?,?,?,?,?,?,?,?)");
            
          //  preparedStatement.setInt(1, fornecedor.getCodigo());
            preparedStatement.setString(1,fornecedor.getRazaosocial());
            preparedStatement.setString(2,fornecedor.getCnpj_cpf());
            preparedStatement.setString(3,fornecedor.getEndereco());
            preparedStatement.setString(4,fornecedor.getBairro());
            preparedStatement.setString(5,fornecedor.getTelefone());
            preparedStatement.setString(6,fornecedor.getCidade());
            preparedStatement.setString(7, fornecedor.getEstado());
            preparedStatement.setString(8,fornecedor.getEmail());
            preparedStatement.setString(9,fornecedor.getContato());
            preparedStatement.setString(10,fornecedor.getObeservacao());
            preparedStatement.executeUpdate();
        }catch (SQLException e){
            e.printStackTrace();
        }
        
    }
    public List<Cadastro_fornecedores> listfornecedor(){
        List<Cadastro_fornecedores> fornecedor = new ArrayList<Cadastro_fornecedores>();
        try {
            Statement statement = connection.createStatement();
            ResultSet rs = statement.executeQuery("select * from cadastro_fornecedor");
            while(rs.next()){
                Cadastro_fornecedores fornecedores = new Cadastro_fornecedores();
                fornecedores.setCodigo(rs.getInt("codigo"));
                fornecedores.setRazaosocial(rs.getString("razao_social"));
                fornecedores.setCnpj_cpf(rs.getString("cnpj_cpf"));
                fornecedores.setEndereco(rs.getString("endereco"));
                fornecedores.setBairro(rs.getString("bairro"));
                fornecedores.setTelefone(rs.getString("telefone"));
                fornecedores.setCidade(rs.getString("cidade"));
                fornecedores.setEstado(rs.getString("estado"));
                fornecedores.setEmail(rs.getString("email"));
                fornecedores.setContato(rs.getString("contato"));
                fornecedores.setObeservacao(rs.getString("observacao"));
                fornecedor.add( fornecedores);
            }
        } catch (SQLException e) {
        }
        return fornecedor;
        }
     public void editarfornecedor (Cadastro_fornecedores fornecedor){
        try{
            PreparedStatement preparedStatement = connection.prepareStatement(""
                    + "update cadastro_fornecedor set razao_social=?, cnpj_cpf=?, endereco=?, bairro=?, telefone=?, cidade=?, estado=?, email=?,"
                    + "contato=?,observacao=? where codigo=?");
            preparedStatement.setString(1,fornecedor.getRazaosocial());
            preparedStatement.setString(2,fornecedor.getCnpj_cpf());
            preparedStatement.setString(3,fornecedor.getEndereco());
            preparedStatement.setString(4,fornecedor.getBairro());
            preparedStatement.setString(5,fornecedor.getTelefone());
            preparedStatement.setString(6,fornecedor.getCidade());
            preparedStatement.setString(7, fornecedor.getEstado());
            preparedStatement.setString(8,fornecedor.getEmail());
            preparedStatement.setString(9,fornecedor.getContato());
            preparedStatement.setString(10,fornecedor.getObeservacao());
            preparedStatement.setInt(11, fornecedor.getCodigo());
            preparedStatement.executeUpdate();
        }catch (SQLException e){
            e.printStackTrace();
        }
    }
     
     // metodo para deletar fornecedor
     public void deletarfornecedor (int codigo){
        try{
            PreparedStatement preparedStatement = connection.prepareStatement(""
                    + "delete from cadastro_fornecedor where codigo=?");
            preparedStatement.setInt(1, codigo);
            preparedStatement.executeUpdate();
        }catch (SQLException e){
            e.printStackTrace();
        }
    }
     
     public Cadastro_fornecedores consulta (int codigo){
         Cadastro_fornecedores fornecedor = new Cadastro_fornecedores();
         try{
            PreparedStatement preparedStatement = connection.prepareStatement("select * from cadastro_fornecedor "
                    + "where codigo=?");
            preparedStatement.setInt(1,codigo);
            ResultSet rs = preparedStatement.executeQuery();
            if(rs.next()){
            fornecedor.setCodigo(rs.getInt("codigo"));
            fornecedor.setRazaosocial(rs.getString("razao_social"));
            fornecedor.setCnpj_cpf(rs.getString("cnpj_cpf"));
            fornecedor.setEndereco(rs.getString("endereco"));
            fornecedor.setBairro(rs.getString("bairro"));
            fornecedor.setTelefone(rs.getString("telefone"));
            fornecedor.setCidade(rs.getString("cidade"));
            fornecedor.setEstado(rs.getString("estado"));
            fornecedor.setEmail(rs.getString("email"));
            fornecedor.setContato(rs.getString("contato"));
            fornecedor.setObeservacao(rs.getString("observacao"));
            }
        }catch (SQLException e){
            e.printStackTrace();
        }
         return fornecedor;
     }
     
}
