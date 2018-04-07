package Model;

import java.awt.List;
import java.util.ArrayList;

public class Olimpiada {
	private String tipo;
	private int ano;
	
	
	ArrayList <Modalidade> modalidades = new ArrayList<Modalidade>();
	
	public Olimpiada() {
		
	}
	
	
	public Olimpiada(String tipo, int ano) {
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
