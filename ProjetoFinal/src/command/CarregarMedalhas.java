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

public class CarregarMedalhas implements Command {

	@Override
	public void executar(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		ModalidadeService ms = new ModalidadeService();
		PaisService ps = new PaisService();
		OlimpiadaService os = new OlimpiadaService();
		
		int idPais = Integer.parseInt(request.getParameter("pais"));
		int idModalidade = Integer.parseInt(request.getParameter("modalidade"));
		int ano	=	Integer.parseInt(request.getParameter("ano"));

		
		Modalidade modalidade = new Modalidade();
		Olimpiada olimpiada = new Olimpiada();
		Pais pais = new Pais();
		pais.setId(idPais);
		pais = ps.carregar(pais);	
		modalidade.setId(idModalidade);
		modalidade = ms.carregar(modalidade);
		olimpiada.setAno(ano);

		System.out.println(modalidade.getId());
		
		
		modalidade = os.carregar(pais, olimpiada, modalidade);
		request.setAttribute("pais", pais);
		request.setAttribute("modalidade", modalidade);
		request.setAttribute("olimpiada", olimpiada);
		request.getRequestDispatcher("OlimpiadasMedalhas.jsp").forward(request, response);
	}

}
