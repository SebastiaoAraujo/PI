package br.com.oficina.conexao;
import java.sql.*;
import java.util.*;
import javax.swing.JOptionPane;


/**
 *
 * @author SEBASTYANN
 */
public class conecta {
private String usuario = "root";
private String password = "";
private String servidor = "localhost";
private String porta = "3306";
private String banco = "oficina";
private String drive = "com.mysql.jdbc.Driver";
private String url = "jdbc:mysql://"+servidor+":"+porta+"/"+banco;
private Connection conn;

// Construtor
public conecta(){
    try{
        Class.forName(drive);
        conn = DriverManager.getConnection(url, usuario, password);
        
    }catch (ClassNotFoundException e ){
        System.err.println("ERROR "+e);
    }catch (SQLException e ){
        System.err.println("ERROR "+e);
    }
}
public Connection getConnection(){
    return conn;
}
}
