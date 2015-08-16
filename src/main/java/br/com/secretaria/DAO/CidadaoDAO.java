package br.com.secretaria.DAO;

import org.hibernate.Query;

import br.com.secretaria.modelo.Cidadao;

public class CidadaoDAO extends Persistencia<Cidadao> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	
	
	public Cidadao buscarPorCidadao(String nomeCidadao) {
		String hql = "From Cidadao cidadao Where cidadao.nome LIKE :nomeCidadao";
		Cidadao cidadaoEncontrado;
		
			Query query = session.createQuery(hql);
			query.setParameter("nomeEquipamento", nomeCidadao);
			cidadaoEncontrado = (Cidadao) query.uniqueResult();		
		return cidadaoEncontrado;
	}
}
