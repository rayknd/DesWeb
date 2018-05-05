package service;



import java.util.ArrayList;

import dao.PaisDAO;
import model.Pais;

public class PaisService {
	PaisDAO dao = new PaisDAO();
	
	public Pais criar(Pais pais) {
		return dao.criar(pais);
	}
	public Pais carregar(Pais pais) {
		return dao.carregar(pais);
	}
	public void excluir(int id) {
		dao.excluir(id);
	}
	public void atualizar(Pais pais) {
		dao.atualizar(pais);
	}
	public ArrayList <Pais> listar (){
		return dao.listar();
	}
	public ArrayList<Pais> listarPais(String chave){
		return dao.listarPais(chave);
	}
}
