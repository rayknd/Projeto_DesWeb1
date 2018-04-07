package Service;

import java.util.List;

import DAO.ModalidadeDAO;
import Model.Modalidade;

public class ModalidadeService {
	
	ModalidadeDAO mm = new ModalidadeDAO();
	public List<Modalidade> carregarModalidade() {
		return mm.carregarModalidade();
	}
}
