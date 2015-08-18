package br.com.secretaria.DAO;

import org.hibernate.Query;

import br.com.secretaria.modelo.Cidadao;
import br.com.secretaria.modelo.Funcionario;

public class FuncionarioDAO extends Persistencia<Funcionario> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public Funcionario buscarPorFuncionario(String nomeFuncionario) {
		String hql = "From Funcionario funcionario Where funcionario.nome LIKE :nomeFuncionario";
		Funcionario funcionarioEncontrado;
		
			Query query = session.createQuery(hql);
			query.setParameter("nomeFuncionario", nomeFuncionario);
			funcionarioEncontrado = (Funcionario) query.uniqueResult();		
		return funcionarioEncontrado;
	}

}
