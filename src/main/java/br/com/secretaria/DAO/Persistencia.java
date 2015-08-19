//	SESSION!!
package br.com.secretaria.DAO;

import java.io.Serializable;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

import br.com.secretaria.modelo.ModeloPersistencia;

public class Persistencia<T extends ModeloPersistencia> implements Serializable {

	private static final long serialVersionUID = 1L;	
		
	private Database database;
	private Session session;
	
	public Persistencia() {
		database = Database.getInstance();
	}
	
	public Session iniciarSessao() {
		session = database.getSession();
		session.getTransaction().begin();
		return session;
	}
	
	public void encerrarSessao() {
		session.getTransaction().commit();
		session.close();		
	}

    public void create(T obj) { 
    	iniciarSessao();
        session.persist(obj);
        encerrarSessao();
    }
    
    public void edit(T obj) {
    	iniciarSessao();
        session.merge(obj);
        encerrarSessao();
    }
    
    public void delete(T obj) {
    	iniciarSessao();
        session.delete(obj);
        encerrarSessao();
    }
    
    @SuppressWarnings("rawtypes")
	public List buscarComHQL(String busca){
        Query q = iniciarSessao().createQuery(busca);
        return q.list();
    }  
    
    public T buscarPorID(String busca){
        Query q = iniciarSessao().createQuery(busca);
        T uniqueResult = (T) q.uniqueResult();
		return uniqueResult;
    } 
}
