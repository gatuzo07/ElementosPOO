package com.unitec.weba;

import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

/**
 *
 * @author gatuzo07
 *
 * Inicializar la sesión
 * throws Exception:  Para lanzar excepciones por si surge algun error
 * Se manejan bloques estaticos y metodos estaticos
 */
public class DAOAdministracion {
    static SessionFactory factory;
    static Session sesion;
    static Transaction tranza; 
    
    public static void abrirSesion(){
        factory= HibernateUtilidades.getSessionFactory();
        sesion= factory.openSession();
        tranza= sesion.beginTransaction();
    }
    
    public static void cerrarTodo(){
        tranza.commit();
        sesion.close();
    }
    
    public DAOAdministracion(){
        
    }
//Creamos el insert
    public void guardar(Administracion u)throws Exception{
//Aqui poner el codigo de tu guardado
//Despues invocar el metodo cerrarTodo
        abrirSesion();
        sesion.save(u);
        cerrarTodo();
    }
//Creamos el update
    public void actualizar(Administracion u)throws Exception{
        abrirSesion();
        sesion.update(u);
        cerrarTodo();
    }
//Creamos el buscarTodos
    public List<Administracion> buscarTodos()throws Exception{
        
        return null;
    }
//Creamos el buscar por Id
    public Administracion buscarPorId(Integer id)throws Exception{
        
        return null;
    }
//Creamos el de autenticar
    public boolean autenticar(Administracion u)throws Exception{
        
        return false;
    }
}

