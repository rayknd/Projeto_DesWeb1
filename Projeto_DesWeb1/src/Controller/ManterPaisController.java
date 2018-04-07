package Controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Model.Pais;
import Service.PaisService;

@WebServlet("/ManterPais.do")
public class ManterPaisController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws
	ServletException, IOException {
		doPost(request, response);
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws
	ServletException, IOException {
		String pNome = request.getParameter("nome");
		long pPop = Integer.parseInt(request.getParameter("População"));
		double pArea = Double.parseDouble(request.getParameter("area"));
		
		//instanciar o javabean
		Pais pais = new Pais();
		pais.setNome(pNome);
		pais.setPopulacao(pPop);
		pais.setArea(pArea);
		
		//instanciar o service
		PaisService ps = new PaisService();
		ps.criarPais(pais);
		pais = ps.carregarPais(pais.getId());
		
		//Enviar para o jsp
		request.setAttribute("pais", pais);
		
		RequestDispatcher view =
		request.getRequestDispatcher("Pais.jsp");
		view.forward(request, response);
		
	}
}

