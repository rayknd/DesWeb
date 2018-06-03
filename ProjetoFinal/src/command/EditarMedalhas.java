package command;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Modalidade;
import model.Olimpiada;
import model.Pais;
import service.ModalidadeService;
import service.PaisService;

public class EditarMedalhas implements Command {

	@Override
	public void executar(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		PaisService ps = new PaisService();
		ModalidadeService ms = new ModalidadeService();
		
		int idPais = Integer.parseInt(request.getParameter("pais"));
		int idModalidade = Integer.parseInt(request.getParameter("modalidade"));
		int ano	=	Integer.parseInt(request.getParameter("ano"));
		int ouro = Integer.parseInt(request.getParameter("ouro"));
		int prata = Integer.parseInt(request.getParameter("prata"));
		int bronze = Integer.parseInt(request.getParameter("bronze"));
		
		System.out.println(idPais);
		System.out.println(idModalidade);
		System.out.println(ano);
		
		
		Modalidade modalidade = new Modalidade();
		Olimpiada olimpiada = new Olimpiada();
		Pais pais = new Pais();
		
		pais.setId(idPais);
		pais = ps.carregar(pais);
		
		modalidade.setId(idModalidade);
		modalidade.setOuro(ouro);
		modalidade.setPrata(prata);
		modalidade.setBronze(bronze);
		modalidade = ms.carregar(modalidade);
		
		olimpiada.setAno(ano);
	
		
		request.setAttribute("pais", pais);
		request.setAttribute("modalidade", modalidade);
		request.setAttribute("olimpiada", olimpiada);
		request.getRequestDispatcher("OlimpiadaEditar.jsp").forward(request, response);
	}

}
