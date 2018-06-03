package command;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Pais;
import service.PaisService;

public class CriarPais implements Command {

	@Override
	public void executar(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		

		PaisService ps = new PaisService();
		
		String pNome = request.getParameter("pais");
		int pPopulacao = Integer.parseInt(request.getParameter("populacao"));
		double pArea= Double.parseDouble(request.getParameter("area"));
		
		//instanciar o javabean
		Pais pais = new Pais();
		pais.setNome(pNome);
		pais.setPopulacao(pPopulacao);
		pais.setArea(pArea);
		System.out.println(pNome);
		System.out.println(pArea);
		System.out.println(pPopulacao);
		//instanciar o service
		
		ps.criar(pais);
		
		pais = ps.carregar(pais);
		
		
		request.setAttribute("pais", pais);
        
        RequestDispatcher view = 
        request.getRequestDispatcher("Pais.jsp");
        view.forward(request, response);
		
	}

}
