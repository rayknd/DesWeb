package command;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Modalidade;
import model.Olimpiada;
import model.Pais;
import service.ModalidadeService;
import service.OlimpiadaService;
import service.PaisService;

public class ExcluirOlimpiada implements Command {

	@Override
	public void executar(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		PaisService ps = new PaisService();
		ModalidadeService ms = new ModalidadeService();
		OlimpiadaService os = new OlimpiadaService();
		
		int idPais = Integer.parseInt(request.getParameter("pais"));
		int idModalidade = Integer.parseInt(request.getParameter("modalidade"));
		int ano	=	Integer.parseInt(request.getParameter("ano"));
		
		System.out.println(idPais);
		System.out.println(idModalidade);
		System.out.println(ano);
		
		
		Modalidade modalidade = new Modalidade();
		Olimpiada olimpiada = new Olimpiada();
		Pais pais = new Pais();
		
		pais.setId(idPais);
		pais = ps.carregar(pais);
		
		modalidade.setId(idModalidade);
		modalidade = ms.carregar(modalidade);
		
		olimpiada.setAno(ano);
		
		os.excluir(pais, modalidade, olimpiada);
			
		request.setAttribute("pais", pais);
		request.setAttribute("modalidade", modalidade);
		request.setAttribute("olimpiada", olimpiada);
		request.getRequestDispatcher("excluirOlimpiada.jsp").forward(request, response);
	}

}
