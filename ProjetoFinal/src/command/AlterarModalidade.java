package command;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.Modalidade;
import model.Olimpiada;
import service.ModalidadeService;

public class AlterarModalidade implements Command {

	@Override
	public void executar(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		int pId = Integer.parseInt(request.getParameter("id"));
		String pNome = request.getParameter("nome");
		String pTipo = request.getParameter("tipo");


		Modalidade modalidade = new Modalidade();
		modalidade.setId(pId);
		modalidade.setNome(pNome);
		modalidade.setTipo(pTipo);
		ModalidadeService ms = new ModalidadeService();
		RequestDispatcher view = null;
		HttpSession session = request.getSession();
		
		Olimpiada ol = new Olimpiada();
		
		ms.atualizar(modalidade, ol);
		@SuppressWarnings("unchecked")
		ArrayList<Modalidade> lista = (ArrayList<Modalidade>) session
				.getAttribute("lista");
		int pos = busca(modalidade, lista);
		lista.remove(pos);
		lista.add(pos, modalidade);
		session.setAttribute("lista", lista);
		request.setAttribute("modalidade", modalidade);
		view = request.getRequestDispatcher("VisualizarModalidade.jsp");

		view.forward(request, response);

	}

	public int busca(Modalidade modalidade, ArrayList<Modalidade> lista) {
		Modalidade to;
		for (int i = 0; i < lista.size(); i++) {
			to = lista.get(i);
			if (to.getId() == modalidade.getId()) {
				return i;
			}
		}
		return -1;
	}
}
