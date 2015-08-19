package br.com.secretaria.DAO;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.criterion.Expression;
import org.hibernate.criterion.Restrictions;

import br.com.secretaria.modelo.Cidadao;

@SuppressWarnings({ "unchecked", "deprecation" })
public class CidadaoDAO extends Persistencia<Cidadao> {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public Cidadao buscarPorCidadao(String nomeCidadao) {
		String hql = "From Cidadao cidadao Where cidadao.nome LIKE :nomeCidadao";
		Cidadao cidadaoEncontrado;		
			Query query = iniciarSessao().createQuery(hql);
			query.setParameter("nomeCidadao", nomeCidadao);
			cidadaoEncontrado = (Cidadao) query.uniqueResult();		
		return cidadaoEncontrado;
	}
	
	public List<Cidadao> buscarPorTrechoDoNome(String nome) {
		Criteria c = iniciarSessao().createCriteria(Cidadao.class);
		c.add(Restrictions.like("nome", "%"+nome+"%"));
		return c.list();		
	}
}
