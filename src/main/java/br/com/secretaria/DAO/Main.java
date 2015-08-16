package br.com.secretaria.DAO;

import br.com.secretaria.modelo.Setor;

public class Main {
	
 public static void main(String[] args) {	 
	Persistencia<Setor> setorDAO = new Persistencia<Setor>();
	Setor s = new Setor();	
	s.setNome("TESTE1");
	setorDAO.create(s);	
 }
 
}
