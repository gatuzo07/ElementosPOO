package org.unitec.maven;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

/*
 * @author gatuzo07
 */
public class DAOProducto {
    //
    public static void guardar(Producto p) throws Exception{
        SessionFactory fac=HibernateUtilidades.getSessionFactory();
        Session ses=fac.openSession();
        Transaction trans=ses.beginTransaction();
        
        ses.save(p);
        ses.close();
    }
}
