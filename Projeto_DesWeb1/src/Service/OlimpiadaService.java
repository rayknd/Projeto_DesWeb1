package Service;

import java.util.List;

import DAO.OlimpiadaDAO;
import Model.AnoOlimpiada;
import Model.Modalidade;
import Model.Pais;

public class OlimpiadaService {

	OlimpiadaDAO pp = new OlimpiadaDAO();
	public void criarOlimpiada(Pais p, Modalidade m, AnoOlimpiada a) {
		pp.criarOlimpiada(p, m, a);
	}
	public void carregarOlimpiada(Pais p, Modalidade m, AnoOlimpiada a) {
		pp.carregarOlimpiada(p, m, a);
	}
	public void atualizarOlimpiada(Pais p, Modalidade m, AnoOlimpiada a) {
		pp.atualizarOlimpiada(p, m, a);
	}
	public void excluirPais(Pais p, Modalidade m, AnoOlimpiada a) {
		pp.excluirOlimpiada(p, m, a);
	}
	public List<AnoOlimpiada> listarAno(){
		return pp.listarAno();
	}
}
