package org.unitec.maven;

import java.util.ArrayList;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

/*
 * @author gatuzo07
 */
public class DAOProducto {
    private SessionFactory fac;
    private Session ses;
    private Transaction tranza;
    
    public DAOProducto(){
        fac=HibernateUtilidades.getSessionFactory();
        ses=fac.openSession();
        tranza=ses.beginTransaction();
    }
    
    public void cerraSession(){
        tranza.commit();
        ses.close();
    }
    
    public void guardar(Producto g)throws Exception{
        ses.save(g);
        cerraSession();
    }
    
    public ArrayList<Producto>buscarTodos()throws Exception{
        Criteria cri=ses.createCriteria(Producto.class);
        ArrayList<Producto>gastos=(ArrayList<Producto>)cri.list();
        cerraSession();
        return gastos;
    }
    
    public Producto buscarPorId(Integer id)throws Exception{
        Criteria cri=ses.createCriteria(Producto.class);
        Producto gastos=(Producto)cri.add(Restrictions.idEq(id)).uniqueResult();
        cerraSession();
        return gastos;
    }
    
    public void actualizar(Producto g)throws Exception{
        ses.update(g);
        cerraSession();
    }
}
/*  public static void guardar(Producto p) throws Exception{
        SessionFactory fac=HibernateUtilidades.getSessionFactory();
        Session ses=fac.openSession();
        Transaction trans=ses.beginTransaction();
        
        ses.save(p);
        ses.close();
*/    
        
