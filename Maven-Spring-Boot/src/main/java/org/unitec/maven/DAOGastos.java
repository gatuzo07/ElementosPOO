package org.unitec.maven;

import java.util.ArrayList;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author gatuzo07
 */
public class DAOGastos {
    private SessionFactory fac;
    private Session ses;
    private Transaction tranza;
    
    public DAOGastos(){
        fac=HibernateUtilidades.getSessionFactory();
        ses=fac.openSession();
        tranza=ses.beginTransaction();
    }
    
    public void cerraSession(){
        tranza.commit();
        ses.close();
    }
    
    public void guardar(Gastos g)throws Exception{
        ses.save(g);
        cerraSession();
    }
    
    public ArrayList<Gastos>buscarTodos()throws Exception{
        Criteria cri=ses.createCriteria(Gastos.class);
        ArrayList<Gastos>gasto=(ArrayList<Gastos>)cri.list();
        cerraSession();
        return gasto;
    }
    
    public Gastos buscarPorId(Integer id)throws Exception{
        Criteria cri=ses.createCriteria(Gastos.class);
        Gastos gasto=(Gastos)cri.add(Restrictions.idEq(id)).uniqueResult();
        cerraSession();
        return gasto;
    }
    
    public void actualizar(Gastos g)throws Exception{
        ses.update(g);
        cerraSession();
    }
    
    public void borrar(Gastos g)throws Exception{
    ses.delete(g);
    cerraSession();
    }
}
