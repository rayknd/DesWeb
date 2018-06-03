package command;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.Pais;
import service.PaisService;

public class BuscarPais implements Command {

	@Override
	public void executar(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		PaisService ps = new PaisService();
		HttpSession session = request.getSession();
		String chave = request.getParameter("data[search]");
		ArrayList<Pais> lista = null;
		
		if (chave != null && chave.length() > 0) {
			lista = ps.listarPais(chave);
		} else {
			lista = ps.listar();
		}
		session.setAttribute("lista", lista);
		
		request.getRequestDispatcher("ListarPais.jsp").forward(request, response);
		

	}

}
