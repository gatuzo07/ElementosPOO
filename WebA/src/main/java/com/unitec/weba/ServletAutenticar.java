/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unitec.weba;

import java.io.IOException;
import java.io.PrintWriter;
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
 *  HttpServletRequest request: Por aqui se pide la información dle cliente
 *  HttpServletResponse response: Por aqui se regresa al server
 *  ServletException: Servidor no habilitado 
 *  IOException: Servidor sin conexión
 *  "text/html;charset=UTF-8" -> (MIME) Identificadores de datos que manejan los 
 *  servidores para identificar la tecnologia usada. Tienen mucho poder, se pude usar JSON
 *  
 */
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
    }
}
        