package com.unitec.weba;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author gatuzo07
 */
public class ServletGuardarUsuario extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        
        Usuario u=new Usuario();     
        
        u.setNombre(request.getParameter("nombre"));       
        u.setEmail(request.getParameter("email"));
        u.setLogin(request.getParameter("login"));
        u.setPassword(request.getParameter("password"));
        
        DAOUsuario dao=new DAOUsuario();
        try{
            dao.guardar(u);
            RequestDispatcher despachador=request.getRequestDispatcher("/respuesta.jsp");
            despachador.forward(request, response);
        }catch (Exception ex){
            
        }
        }
    }
