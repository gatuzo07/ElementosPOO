<%-- 
    Document   : Bienvenido
    Created on : 20-may-2015, 0:15:32
    Author     : gatuzo07
    HTML: Post < instert
    SERVLET: doPost < insert
--%> 

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1><center>Bienvenido a la Administración del Sitio</center></h1>
        <h2><center>Guardar Usuario</center></h2>
        <center><form action="guardar-usuario" method="post">
            <table>
                <tr>
                    <td>Nombre</td><td><input type="text" name="nombre"></td>                   
                </tr>
                <tr>
                    <td>Email</td><td><input type="text" name="email"></td>                   
                </tr>
                <tr>
                    <td>Login</td><td><input type="text" name="login"></td>                    
                </tr>
                <tr>
                    <td>Password</td><td><input type="text" name="password"></td>
                </tr>
                <tr>
                    <td></td><td><center><input type="submit" value="Guardar Usuario"></center></td>
                </tr>
                    
            </table>
        </center></form>
    </body>
</html>
