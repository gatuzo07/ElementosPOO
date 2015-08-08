package org.unitec.maven;

import java.util.ArrayList;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

/**
 * @author gatuzo07
 */
public class DAOTarjeta {
    private SessionFactory fac;
    private Session ses;
    private Transaction tranza;
    
    public DAOTarjeta(){
        fac=HibernateUtilidades.getSessionFactory();
        ses=fac.openSession();
        tranza=ses.beginTransaction();
    }
    
    public void cerraSession(){
        tranza.commit();
        ses.close();
    }
    
    public void guardar(Tarjeta g)throws Exception{
        ses.save(g);
        cerraSession();
    }
    
    public ArrayList<Tarjeta>buscarTodos()throws Exception{
        Criteria cri=ses.createCriteria(Tarjeta.class);
        ArrayList<Tarjeta>tarjetas=(ArrayList<Tarjeta>)cri.list();
        cerraSession();
        return tarjetas;
    }
    
    public Tarjeta buscarPorId(Integer id)throws Exception{
        Criteria cri=ses.createCriteria(Tarjeta.class);
        Tarjeta tarjetas=(Tarjeta)cri.add(Restrictions.idEq(id)).uniqueResult();
        cerraSession();
        return tarjetas;
    }
    
    public void actualizar(Tarjeta g)throws Exception{
        ses.update(g);
        cerraSession();
    }
    
    public void borrar(Tarjeta g)throws Exception{
    ses.delete(g);
    cerraSession();
    }
}
