package command;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Modalidade;
import model.Olimpiada;
import model.Pais;
import service.ModalidadeService;
import service.OlimpiadaService;
import service.PaisService;

public class PesquisarOlimpiada implements Command {

	@Override
	public void executar(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		PaisService ps = new PaisService();
		ModalidadeService ms = new ModalidadeService();
		OlimpiadaService os = new OlimpiadaService();
		
		List<Pais> pais = ps.listar();
		List<Modalidade> modalidade = ms.listar();
		List<Olimpiada> olimpiada = os.listar();
		
		request.setAttribute("pais", pais);
		request.setAttribute("modalidade", modalidade);
		request.setAttribute("olimpiada", olimpiada);
		request.getRequestDispatcher("OlimpiadasPesquisar.jsp").forward(request, response);
	}

}
