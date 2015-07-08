package org.unitec.maven;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;

/**
 * @author gatuzo07
 * 
 * Esta sera la aplicación principal, usaremos la tecnologia de Spring "anotación"
 * la que autoconfigurara la visualización ya sea web o desktop y la configuración
 * de tommcat.
 * @EnableAutoConfiguration - Configura todo el tommcat
 * 
 */

@EnableAutoConfiguration
public class Aplicacion {
    
    public static void main(String[] args) {
        SpringApplication.run(Aplicacion.class, args);
        
    }
}
