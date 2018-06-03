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

public class CriarOlimpiada implements Command{
	
	@Override
	public void executar(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException{
		String pIdPais = request.getParameter("pais");
		String pIdModalidade = request.getParameter("modalidade");
		String pIdAno = request.getParameter("ano");
		int ouro = Integer.parseInt(request.getParameter("ouro"));
		int prata = Integer.parseInt(request.getParameter("prata"));
		int bronze = Integer.parseInt(request.getParameter("bronze"));
		
		int idPais = -1;
		int idModalidade = -1;
		int idAno = -1;
		try {
			idPais = Integer.parseInt(pIdPais);
			idModalidade = Integer.parseInt(pIdModalidade);
			idAno = Integer.parseInt(pIdAno);
		} catch (NumberFormatException e) {

		}
		
		PaisService ps = new PaisService();
		ModalidadeService ms = new ModalidadeService();
		OlimpiadaService os = new OlimpiadaService(); 
		
		
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
		olimpiada.setAno(idAno);
		
		os.criar(pais, olimpiada, modalidade);
		
		request.setAttribute("pais", pais);
		request.setAttribute("modalidade", modalidade);
		request.setAttribute("olimpiada", olimpiada);
		request.getRequestDispatcher("OlimpiadasMedalhas.jsp").forward(request, response);
		
	}
}
