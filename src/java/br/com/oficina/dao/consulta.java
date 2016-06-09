package br.com.oficina.dao;

import br.com.oficina.conexao.conecta;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author SEBASTYANN
 */
public class consulta extends conecta{
    public boolean autentica (String usuario, String senha){
        PreparedStatement pst = null;
        ResultSet rs = null;
        try {
            String consulta = "select * from cadastro_funcionario where login = ? and senha = ?";
            pst = getConnection().prepareStatement(consulta);
            pst.setString(1, usuario);
            pst.setString(2, senha);
            rs = pst.executeQuery();
            
            if(rs.absolute(1)){
                return true;
            }
        } catch (Exception e) {
            System.err.println("Error"+e);
        }finally{
            try {
                if(getConnection() != null) getConnection().close();
                if (pst != null) pst.close();
                if (rs != null) rs.close();
            } catch (Exception e) {
            }
        }
        return false;
    }
}
