package br.com.secretaria.DAO;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Database {

	private static Database singleton = new Database();
	private static SessionFactory sf; 
	
	private Database(){
		sf = new Configuration().configure("/br/com/secretaria/hibernate/hibernate.cfg.xml").buildSessionFactory();
	}

	public static Database getInstance(){
	return singleton;
	}
	public Session getSession(){ 
		if( sf == null){
			sf = new Configuration().configure("/br/com/secretaria/hibernate/hibernate.cfg.xml").buildSessionFactory();
			return sf.openSession();
		}
		return sf.openSession();
	}
}
