<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Inicio</title>
    </head>
    <body>
<!-- Encabezado h1
     Scriplet < % aqui podemos escribir codigo de logica Ejemplo:
                int edad=26;
            out.println("tu edad es:"+edad);
     % >
     Formularios form, action para invocar un servicio
     uri = invoca un servicio
     url = invoca una pagina web
     
     Metodos de envío y recepción de información **Dentro del Form**
     (Si se omite el metodo de envío por default se usa GET)
     -GET -> select (sql) "es inseguro"
     -POST -> insert (sql) "es seguro" *usaremos este metodo por seguridad
     -PUT -> update (sql)
     -DELETE -> delete (sql)
     -HEAD -> No es del todo un metodo

     -Hibernate
-->
    <h1><center>Iniciar Sesión</center></h1>
                                    
    <center><form action="autenticar" method="post">
            Login<br>
            <input type="text" name="login"><br><br>
            Password<br>
            <input type="password" name="password"><br><br>
            <input type="submit" value="ingresar"><br>
                                  
            </center></form>
    </body>
</html>
