package br.com.secretaria.Main;

import java.util.List;

import br.com.secretaria.DAO.TaxaDAO;
import br.com.secretaria.modelo.Taxa;


public class Main {
	
 public static void main(String[] args) {	 
	
//	 CidadaoDAO cidadaoDAO = new CidadaoDAO();
//	Cidadao cid = cidadaoDAO.find("");
//	System.out.println(cid.getNome());
	
	 TaxaDAO taxaDao = new TaxaDAO();
	 List<Taxa> taxas = taxaDao.find("from Taxa t where t.idprocesso.idcidadao.id = 3");
	 
	 for (Taxa taxa : taxas) {
		System.out.println(taxa.getValortaxa()+"");
	}
			 
	
 }
 
}
