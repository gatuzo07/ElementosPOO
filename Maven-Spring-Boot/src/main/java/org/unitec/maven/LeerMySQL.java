package org.unitec.maven;

/**
 * @author gatuzo07
 */
public class LeerMySQL implements Leer{
        
    @Override
    public String leer() throws Exception {
        //  Aqui va lo de Hibernate
        String mensaje="Conectado a MySQL";   
        
        return mensaje;
    }   
}


