package command;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Modalidade;
import service.ModalidadeService;

public class VisualizarModalidade implements Command {

	@Override
	public void executar(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		
		String pId = request.getParameter("id");
		String pNome = request.getParameter("nome");
		String pTipo = request.getParameter("tipo");
		int id = -1;
		try {
			id = Integer.parseInt(pId);
		} catch (NumberFormatException e) {

		}

		Modalidade modalidade = new Modalidade();
		modalidade.setId(id);
		modalidade.setNome(pNome);
		modalidade.setTipo(pTipo);
		ModalidadeService ms = new ModalidadeService();
		
		RequestDispatcher view = null;

		modalidade = ms.carregar(modalidade);
		request.setAttribute("modalidade", modalidade);
		view = request.getRequestDispatcher("VisualizarModalidade.jsp");

		view.forward(request, response);

	}

}