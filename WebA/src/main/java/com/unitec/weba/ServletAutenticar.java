/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unitec.weba;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Calendar;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author gatuzo07
 */
public class ServletAutenticar extends HttpServlet {

/**
 *  Aqui se especifica el Metodo de Envío, deben de coincidir ambos, no mezclarlos.
 *  Todos los metodos usan los mismos parametros: 
 *  HttpServletRequest request: Por aqui se pide la información del cliente
 *  HttpServletResponse response: Por aqui se regresa la información al cliente
 *  ServletException: Servidor no habilitado 
 *  IOException: Servidor sin conexión
 *  "text/html;charset=UTF-8" -> (MIME) Identificadores de datos que manejan los 
 *  servidores para identificar la tecnologia usada. Tienen mucho poder, se pude usar JSON
 *  
 */
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
//Pedir los valores de login y password request
        String login=request.getParameter("login");
        String password=request.getParameter("password");
        String ip=request.getRemoteAddr();
        Date fecha=Calendar.getInstance().getTime();
        
//buscar aqui el usuario cuyo login y password se proporcionaron
//una vez buscado, verificar su id, supongamos 1
        Usuario u1=new Usuario();
        u1.setId(1);
//despues de esto guardar sesion con la clase administracion
        Administracion a=new Administracion();
        a.setFecha(fecha);
        a.setId(u1);
        a.setIp(ip);
        DAOAdministracion daoadmon=new DAOAdministracion();
//se encierra en un try porque lanza excepciones        
        try {
            daoadmon.guardar(a);
        } catch (Exception ex) {

        }        
        
//Creamos el model
        Usuario u=new Usuario();
//Ajustamos su login y password
        u.setLogin(login);
        u.setPassword(password);
//Redireccionamos el servlet y creamos el modelo autentica
        ModeloAutenticar modelo=new ModeloAutenticar();
        
        if(modelo.autenticar(u)){
            RequestDispatcher despachador=request.getRequestDispatcher("/Bienvenido.jsp");
            despachador.forward(request, response);
        }
        else{
            RequestDispatcher despachador=request.getRequestDispatcher("/Error.jsp");
            despachador.forward(request, response);
        }
                               
    }
}
        