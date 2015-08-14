package br.com.secretaria.DAO;

import java.io.Serializable;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import br.com.secretaria.modelo.ModeloPersistencia;

public class Persistencia<T extends ModeloPersistencia> implements Serializable {

	private static final long serialVersionUID = 1L;	
		
	private Configuration cfg  = new Configuration();
	private SessionFactory sessionFactory;
	private Session session;
	
	public Persistencia(){
		sessionFactory = cfg.configure("/br/com/secretaria/conf/hibernate.cfg.xml").buildSessionFactory();
        session = sessionFactory.openSession();
	}
	
    public void create(T obj){    	    	
        session.getTransaction().begin();
        session.persist(obj);
        session.getTransaction().commit();
    }
    
    public void edit(T obj){
        session.getTransaction().begin();
        session.merge(obj);
        session.getTransaction().commit();
    }
    
    public void delete(T obj){
        session.getTransaction().begin();
        session.delete(obj);
        session.getTransaction().commit();
    }
    
    @SuppressWarnings("rawtypes")
	public List find(String busca){
        Query q = session.createQuery(busca);
        return q.list();
    }
	
}
