package br.com.oficina.servlet;

import br.com.oficina.dao.fornecedor_DAO1;
import java.io.IOException;
import java.io.PrintWriter;
import javax.jws.WebParam;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import br.com.oficina.modelo.Cadastro_fornecedores;


public class Controle_fornecedores1 extends HttpServlet {
    private static final long serialVersionUID = 1L;
    private static String INSERT_OR_EDIT = "/cadastro_fornecedor.jsp";
    private static String LIST_FORNECEDOR = "/listar_fornecedor.jsp";
    private fornecedor_DAO1 dao;

    public Controle_fornecedores1(){
        super();
        dao = new fornecedor_DAO1();
    }
    
    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest (HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException{ 
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
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
        
        String forward="";
        String action = request.getParameter("action");
        
            if(action.equalsIgnoreCase("delete")){
            int codigo = Integer.parseInt(request.getParameter("codigo"));
            dao.deletarfornecedor(codigo);
            forward = LIST_FORNECEDOR;
            request.setAttribute("fornecedores", dao.listfornecedor());
        }
        else if (action.equalsIgnoreCase("edit")){
            forward = INSERT_OR_EDIT;
            int codigo = Integer.parseInt(request.getParameter("codigo"));
            Cadastro_fornecedores fornecedoR = dao.consulta(codigo);
            request.setAttribute("fornecedor", fornecedoR); // esse "fornecedor" tem que ser igual o fornececedor
            //do campo (var) da pagina listar_fornecedor
        }
        else if (action.equalsIgnoreCase("listForn")){
            forward = LIST_FORNECEDOR;
            request.setAttribute("fornecedores", dao.listfornecedor()); //fornecedores é o mesmo do campo listar_fornecedor.jsp do items{}
        }
        else{
            forward = INSERT_OR_EDIT;
        }
        RequestDispatcher view = request.getRequestDispatcher(forward);
        view.forward(request, response);        
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
        response.setContentType("text/html;charset=UTF-8");
       //int codigo = Integer.parseInt(request.getParameter("codigo"));
       
        String razaosocial = request.getParameter("razaosocial");
        String cnpj_cpf = request.getParameter("cnpj");
        String endereco = request.getParameter("endereco");
        String bairro = request.getParameter("bairro");
        String telefone = request.getParameter("telefone");
        String cidade = request.getParameter("cidade");
        String estado = request.getParameter("estado");
        String email = request.getParameter("email");
        String contato = request.getParameter("contato");
        String observacao = request.getParameter("observacao");
        
        Cadastro_fornecedores cf = new Cadastro_fornecedores();
       //  cf.setCodigo(codigo);
         cf.setRazaosocial(razaosocial);
         cf.setEndereco(endereco);
         cf.setCnpj_cpf(cnpj_cpf);
         cf.setBairro(bairro);
         cf.setTelefone(telefone);
         cf.setCidade(cidade);
         cf.setEstado(estado);
         cf.setEmail(email);
         cf.setContato(contato);
         cf.setObeservacao(observacao);
        
         String codigo = request.getParameter("codigo");
         
         if(codigo == null || codigo.isEmpty()){
             dao.addfornecedor(cf);
         }
         else{
             cf.setCodigo(Integer.parseInt(codigo));
             dao.editarfornecedor(cf);
         }
         RequestDispatcher view = request.getRequestDispatcher(LIST_FORNECEDOR);
         request.setAttribute("fornecedores",dao.listfornecedor());
         view.forward(request, response);
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