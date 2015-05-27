package com.unitec.weba;

/**
 *
 * @author gatuzo07
 */
public class ModeloAutenticar {
    
    public boolean autenticar(Usuario u){
        boolean autenticado=false;
//Autenticamos sin base de datos por el momento        
        if(u.getLogin().equals("gatuzo07")&&u.getPassword().equals("ricardo")){
            autenticado=true;
        }
        return autenticado;
    }
}
