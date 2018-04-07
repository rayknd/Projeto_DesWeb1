package Model;

public class AnoOlimpiada {
	
	private int ano, id;
	private String tipo;
	
	
	public AnoOlimpiada(int ano, int id, String tipo) {
		setTipo(tipo);
		setId(id);
		setAno(ano);
	}
	
	public AnoOlimpiada() {
		
	}
	
	public void setId(int id) {
		this.id = id;
	}
	public int getId() {
		return id;
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
