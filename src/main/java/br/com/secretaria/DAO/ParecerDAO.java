package br.com.secretaria.DAO;

import java.util.List;

import org.hibernate.Query;

import br.com.secretaria.modelo.Parecer;

public class ParecerDAO extends Persistencia<Parecer> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@SuppressWarnings("unchecked")
	public List<Parecer> buscarPeloResultado(String resultadoParecer) {
		String hql = "From Parecer parecer Where parecer.resultado LIKE : resultadoParecer";
		List<Parecer> resultadoEncontrado;
		
			Query query = iniciarSessao().createQuery(hql);
			query.setParameter("resultadoParecer", resultadoParecer);
			query.list();
			resultadoEncontrado = (List<Parecer>) query.list();		
		return resultadoEncontrado;
	}
	
}
