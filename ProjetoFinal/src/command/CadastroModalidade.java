package command;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Modalidade;
import model.Olimpiada;
import service.ModalidadeService;

public class CadastroModalidade implements Command {

	@Override
	public void executar(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		ModalidadeService ms = new ModalidadeService();
		
		String pNome = request.getParameter("modalidade");
		String pTipo = request.getParameter("tipo");
		
		//instanciar o javabean
		Modalidade modalidade = new Modalidade();
		Olimpiada olimpiada = new Olimpiada();
		modalidade.setNome(pNome);
		olimpiada.setTipo(pTipo);
		
		System.out.println(pNome);
		System.out.println(pTipo);

		//instanciar o service
		
		modalidade = ms.criar(modalidade, olimpiada);
		
		
		
		System.out.println(modalidade.getId());
		System.out.println(modalidade.getNome());
		
		request.setAttribute("modalidade", modalidade);
        
        RequestDispatcher view = 
        request.getRequestDispatcher("Modalidade.jsp");
        view.forward(request, response);

	}

}
