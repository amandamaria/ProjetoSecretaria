package br.com.secretaria.Main;

import br.com.secretaria.DAO.CidadaoDAO;
import br.com.secretaria.modelo.Cidadao;

public class Main {
	
 public static void main(String[] args) {	 
	 CidadaoDAO daoCidadao = new CidadaoDAO();
	 for (Cidadao cidadao : daoCidadao.buscarPorTrechoDoNome("a")) {
		System.out.println(cidadao.getNome());
	 }	 
 }
 
}
