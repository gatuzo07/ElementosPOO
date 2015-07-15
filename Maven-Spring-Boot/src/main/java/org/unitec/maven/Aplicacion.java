package org.unitec.maven;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author gatuzo07
 * 
 * Esta sera la aplicación principal, usaremos la tecnologia de Spring "anotación"
 * la que autoconfigurara la visualización ya sea web o desktop y la configuración
 * de tommcat.
 * @EnableAutoConfiguration - Indica al contenerdor de Spring configurar todo:
 *                          -localhost
 *                          -Tommcat
 *                          -Contexto de Spring (http://localhost:8080/)
 *                          -Otras paginas
 */

@EnableAutoConfiguration
public class Aplicacion {
    
    public static void main(String[] args) throws Exception{
        SpringApplication.run(Aplicacion.class, args);
        
        System.out.println("Un mensaje desde spring boot");
        AnnotationConfigApplicationContext ctx=new AnnotationConfigApplicationContext(ConfiguracionBasica.class);
        Leer ServicioLeer=ctx.getBean(Leer.class);
        System.out.println(ServicioLeer.leer());
        /**
         * Leer objeto=new LeerArchivo();
         * System.out.println(objeto.leer());   
         */     
    }
}
