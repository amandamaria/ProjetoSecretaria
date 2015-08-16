package br.com.secretaria.DAO;

import java.util.List;

import br.com.secretaria.modelo.Setor;

public class Main {
	
 @SuppressWarnings("unchecked")
public static void main(String[] args) {	 
	Persistencia<Setor> setorDAO = new Persistencia<Setor>();
	List<Setor> setores = setorDAO.find("from Setor");
	System.out.println(setores.size()+"");
 }
 
}
