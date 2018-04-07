package Controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Model.AnoOlimpiada;
import Model.Modalidade;
import Model.Olimpiada;
import Model.Pais;
import Service.OlimpiadaService;
import Service.PaisService;

	
	@WebServlet("/ManterOlimpiada.do")
	public class ManterOlimpiadaController extends HttpServlet {
		private static final long serialVersionUID = 1L;
		protected void doGet(HttpServletRequest request, HttpServletResponse response) throws
		ServletException, IOException {
			doPost(request, response);
		}
		protected void doPost(HttpServletRequest request, HttpServletResponse response) throws
		ServletException, IOException {
			
			String nome = request.getParameter("pais");
			int ano = Integer.parseInt(request.getParameter("ano")); 
			String modalidade = request.getParameter("modalidade");
			int ouro = Integer.parseInt(request.getParameter("ouro"));
			int prata = Integer.parseInt(request.getParameter("prata"));
			int bronze = Integer.parseInt(request.getParameter("bronze"));
			
			
			//instanciar o javabean
			Modalidade m = new Modalidade();
			m.setOuro(ouro);
			m.setPrata(prata);
			m.setBronze(bronze);
			
			//Usar o método atualizar.
			
			Pais p = new Pais();
			p.setNome(nome);
			
			List<Pais> ArrayP = new ArrayList<Pais>();
			
			AnoOlimpiada a = new AnoOlimpiada();
			a.setAno(ano);
			
			Olimpiada olimpiada = new Olimpiada();
			
			//instanciar o service
			OlimpiadaService os = new OlimpiadaService();
			
			os.atualizarOlimpiada(p, m, a);
			
			PaisService pa = new PaisService();
			ArrayP = pa.listarPais();
			
			//Enviar para o jsp
			request.setAttribute("olimpiada", olimpiada);
			request.setAttribute("paises", ArrayP);
			
			RequestDispatcher view = 
			request.getRequestDispatcher("index.jsp");
			view.forward(request, response);
			
		}
		
		
}
