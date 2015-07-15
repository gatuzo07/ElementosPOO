package org.unitec.maven;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author gatuzo07
 */

@Configuration
public class ConfiguracionBasica {
    
    @Bean
    Leer Servicioleer(){
        Leer leer=new LeerArchivo();
//      Leer leer2=new LeerMySQL();
        return leer;
    }
}
