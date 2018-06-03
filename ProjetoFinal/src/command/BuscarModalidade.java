package command;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.Modalidade;
import service.ModalidadeService;

public class BuscarModalidade implements Command {

	@Override
	public void executar(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		ModalidadeService ms = new ModalidadeService();
		HttpSession session = request.getSession();
		String chave = request.getParameter("data[search]");
		ArrayList<Modalidade> lista = null;
		
		if (chave != null && chave.length() > 0) {
			lista = ms.listarModalidade(chave);
		} else {
			lista = ms.listar();
		}
		session.setAttribute("lista", lista);
		
		request.getRequestDispatcher("ListarModalidade.jsp").forward(request, response);
		

	}

}
