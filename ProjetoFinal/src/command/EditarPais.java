package command;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Pais;
import service.PaisService;

public class EditarPais implements Command {

	@Override
	public void executar(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		int pId = Integer.parseInt(request.getParameter("id"));
		String pNome = request.getParameter("nome");
		int pPopulacao = Integer.parseInt(request.getParameter("populacao"));
		double pArea = Double.parseDouble(request.getParameter("area"));
		
		Pais pais = new Pais();
		pais.setId(pId);
		pais.setNome(pNome);
		pais.setPopulacao(pPopulacao);
		pais.setArea(pArea);
		PaisService ps = new PaisService();
		
		RequestDispatcher view = null;
		
		pais = ps.carregar(pais);
		request.setAttribute("pais", pais);
		view = request.getRequestDispatcher("AlterarPais.jsp");		
		
		view.forward(request, response);

	}

	public int busca(Pais pais, ArrayList<Pais> lista) {
		Pais to;
		for(int i = 0; i < lista.size(); i++){
			to = lista.get(i);
			if(to.getId() == pais.getId()){
				return i;
			}
		}
		return -1;
	}		
		
}