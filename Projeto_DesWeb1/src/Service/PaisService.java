package Service;

import java.util.List;

import DAO.PaisDAO;
import Model.Pais;

public class PaisService {
	
	PaisDAO pp = new PaisDAO();
	
	public void criarPais(Pais p) {
		pp.criarPais(p);
	}
	public Pais carregarPais(int id) {
		return pp.carregar(id);
	}
	public void atualizarPais(Pais p) {
		pp.atualizar(p);
	}
	public void excluirPais(Pais p) {
		pp.excluir(p);
	}
	public List<Pais> listarPais() {
		return pp.listarPais();
	}
	
}
