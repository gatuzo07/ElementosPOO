package com.unitec.weba;

import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author gatuzo07
 * 
 * 1) Crear el SessionFactory
 * 2) Obtenemos la apertura de sesión actual
 * 3) Creamos la transacción
 * 4) Nos apuramos a hacer una transacción
 * 
 */
public class TestPojos {

    public static void main(String[] args) throws Exception{
/**        
        System.out.println("Probaremos todas las operaciones SQL");
// 1)
        SessionFactory factory= HibernateUtilidades.getSessionFactory();
// 2)        
        Session sesion= factory.openSession();
// 3)        
        Transaction tranza= sesion.beginTransaction();
// 4)
/*        
INSERT
        Usuario u=new Usuario();
                u.setEmail("rmr@gmail.com");
                u.setNombre("Ricardo Mendoza");
                u.setLogin("gatuzo07");
                u.setPassword("gatuzo07");
                
                sesion.save(u);
// Libera la transacción y cerrar la sesión
                tranza.commit();
                sesion.close();
UPDATE                                                    
        Usuario u=new Usuario();
                u.setId(1);
                u.setLogin("gatuzo07");
                u.setNombre("Ricardo Mendoza");
                u.setEmail("rmr@gmail.com");
                u.setPassword("123456");
                sesion.update(u);
                tranza.commit();
                sesion.close();
        System.out.println("Se actualizo correctamente"); 

SELECT por id         
        Usuario u= (Usuario)sesion.createCriteria(Usuario.class).add(Restrictions.idEq(2)).uniqueResult();
                tranza.commit();
                sesion.close();
                
    System.out.println("El usuario buscado tiene nombre "+u.getNombre()); 
*/        
/**        List<Usuario> usuarios= sesion.createCriteria(Usuario.class).list();
                tranza.commit();
                sesion.close();    
                for(Usuario usu:usuarios){
                    System.out.println("Usuario encontrado: "+usu.getNombre());
                }
    
    System.out.println("Total de Registros: "+usuarios.size());
*/
        Usuario u=new Usuario();
//                u.setId(1);
                u.setLogin("Wayat");
                u.setNombre("Wayat Wayaba");
                u.setEmail("ww@gmail.com");
                u.setPassword("123456");

                DAOUsuario daou=new DAOUsuario();
                
    }
    
}
