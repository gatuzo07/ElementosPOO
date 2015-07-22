package com.unitec.weba;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author gatuzo07
 */
public class ServletBuscarTodosUsuarios extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
       //Vamos a creaR UN OBJETO QUE NOS SERVIRA PARA MAPEAR UN aRRAYlIST DE
        //JAVA a un objeto JSON
        
        ObjectMapper mapper=new ObjectMapper();
        DAOUsuario du=new DAOUsuario();
        try {
            List<Usuario> usuarios=du.buscarTodos();
            
            out.println(mapper.writeValueAsString(usuarios)); 
            
        } catch (Exception ex) {
        }
    }

}