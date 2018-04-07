package Test;

import javax.swing.JOptionPane;

import Model.Pais;
import Service.PaisService;

public class TestaPais {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pais p = new Pais();
		p.setNome("Guin� Jamaicana");
		p.setPopulacao(50000);
		p.setArea(5555.00);
		int id = p.getId();
		PaisService pS = new PaisService();
		JOptionPane.showMessageDialog(null, pS.carregarPais(id));
	}

}
