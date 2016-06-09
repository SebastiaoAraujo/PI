package br.com.oficina.dao;

import br.com.oficina.conexao.conecta;
import br.com.oficina.modelo.Cadastro_fornecedores;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import br.com.oficina.modelo.Cadastro_pecas;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import org.apache.catalina.mbeans.MBeanDumper;

/**
 *
 * @author SEBASTYANN
 */
public class pecas_DAO1 {
    conecta co = new conecta();
    private Connection connection;
    
    public pecas_DAO1(){
        connection = co.getConnection();
    }
    
    public void addpecas (Cadastro_pecas pecas){
        try{
            PreparedStatement preparedStatement =connection.prepareStatement(""
                    + "insert into cadastro_pecas(codigo_peca, nome_peca, quantidade, marca, "
                    + "estq_minimo, observacao, valorcompra, valorvenda) values (?,?,?,?,?,?,?,?)");
            preparedStatement.setInt(1,pecas.getCodigo_peca());
            preparedStatement.setString(2,pecas.getNome_peca());
            preparedStatement.setInt(3,pecas.getQuantidade());
            preparedStatement.setString(4,pecas.getMarca());
            preparedStatement.setInt(5,pecas.getEstq_minimo());
            preparedStatement.setString(6,pecas.getObservacao());
            preparedStatement.setFloat(7,pecas.getValorcompra());
            preparedStatement.setFloat(8,pecas.getValorvenda());
            preparedStatement.executeUpdate();
        }catch (SQLException e){
            e.printStackTrace();
        }
    }
    public List listpecas() throws Exception{
        PreparedStatement ps = null;
        Connection conn = null;
        ResultSet rs = null;
        try {
            conn = this.connection;
            ps = conn.prepareStatement("select * from cadastro_pecas");
            rs = ps.executeQuery();
            List<Cadastro_pecas> list = new ArrayList<Cadastro_pecas>();
            while(rs.next()){
                int id = rs.getInt(1);
                int codigo_pecas = rs.getInt(2);
                String nome_peca = rs.getString(3);
                int quantidade = rs.getInt(4);
                String marca = rs.getString(5);
                int estq_minimo = rs.getInt(6);
                String observacao = rs.getString(7);
                float valorcompra = rs.getFloat(8);
                float valorvenda = rs.getFloat(9);
                list.add(new Cadastro_pecas(id,nome_peca,quantidade,marca,estq_minimo,observacao,
                valorcompra,valorvenda));
            }
            return list;
        } catch (SQLException sqle) {
            throw new Exception(sqle);
        }finally{
            connection.close();
        }
    }
}
