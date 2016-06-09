/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.oficina.servlet;

import br.com.oficina.dao.pecas_DAO1;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import br.com.oficina.modelo.Cadastro_pecas;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;

@WebServlet("/controle_pecas1")
/**
 *
 * @author SEBASTYANN
 */
public class controle_pecas1 extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    
    pecas_DAO1 cd;
    public controle_pecas1(){
        cd = new pecas_DAO1();
    }
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try {
            List listapecas = cd.listpecas();
            request.setAttribute("servletcontrolepecas", listapecas);
            RequestDispatcher rd = request.getRequestDispatcher("/listar_pecas.jsp");
            rd.forward(request, response);
        } catch (Exception ex) {
            Logger.getLogger(Controle_fornecedores1.class.getName()).log(Level.SEVERE, null, ex);
        }  
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF8");
        
        //int codigo = Integer.parseInt(request.getParameter("codigo"));
        String nome_peca = request.getParameter("nomepeca");
        int quantidade = Integer.parseInt(request.getParameter("quantidade"));
        String marca = request.getParameter("marcapeca");
        int codigopeca = Integer.parseInt(request.getParameter("codigopeca"));
        int estq_minimo = Integer.parseInt(request.getParameter("estoqueminimo"));
        float valocompra = Float.parseFloat(request.getParameter("valocompra"));
        float valorvenda = Float.parseFloat(request.getParameter("valorvenda"));
        String observacao = request.getParameter("observacao");
        
        Cadastro_pecas cp = new Cadastro_pecas();
       // cp.setId(codigo);
        cp.setCodigo_peca(codigopeca);
        cp.setNome_peca(nome_peca);
        cp.setQuantidade(quantidade);
        cp.setMarca(marca);
        cp.setEstq_minimo(estq_minimo);
        cp.setObservacao(observacao);
        cp.setValorcompra(valocompra);
        cp.setValorvenda(valorvenda);
        
        cd.addpecas(cp);
        
       response.sendRedirect("cadastro_pecas.jsp");
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
