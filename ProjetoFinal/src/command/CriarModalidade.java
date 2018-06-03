package command;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Modalidade;
import model.Olimpiada;
import service.ModalidadeService;

public class CriarModalidade implements Command {

	@Override
	public void executar(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		

		ModalidadeService ms = new ModalidadeService();
		
		String pNome = request.getParameter("nome");
		String pTipo = request.getParameter("tipo");
		
		//instanciar o javabean
		Modalidade modalidade = new Modalidade();
		modalidade.setNome(pNome);
		modalidade.setTipo(pTipo);
		System.out.println(pNome);
		System.out.println(pTipo);
		//instanciar o service
		
		Olimpiada ol = new Olimpiada();
		
		ms.criar(modalidade, ol);
		
		modalidade = ms.carregar(modalidade);
		
		
		request.setAttribute("modalidade", modalidade);
        
        RequestDispatcher view = 
        request.getRequestDispatcher("Modalidade.jsp");
        view.forward(request, response);
		
	}

}
