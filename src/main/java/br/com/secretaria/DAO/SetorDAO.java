package br.com.secretaria.DAO;

import org.hibernate.Query;

import br.com.secretaria.modelo.Setor;

public class SetorDAO extends Persistencia<Setor> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public Setor buscarPorSetor(String nomeSetor) {
		String hql = "From Setor setor Where setor.nome LIKE :nomeSetor";
		Setor setorEncontrado;
		
			Query query = session.createQuery(hql);
			query.setParameter("nomeSetor", nomeSetor);
			setorEncontrado = (Setor) query.uniqueResult();		
		return setorEncontrado;
	}
	
}
