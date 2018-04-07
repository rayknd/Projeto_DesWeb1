package TO;

import java.awt.List;
import java.util.ArrayList;

public class OlimpiadaTO {
	private String tipo;
	private int ano;
	
	ArrayList <ModalidadeTO> modalidades = new ArrayList<ModalidadeTO>();
	
	public OlimpiadaTO(String tipo, int ano) {
		setTipo(tipo);
		setAno(ano);
		
	}
	
	
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	public int getAno() {
		return ano;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}
	
}
