package TO;

public class ModalidadeTO {
	private String nome, medalhas;
	private int id;
	
	public ModalidadeTO(String nome, String medalhas) {
		setNome(nome);
		setMedalhas(medalhas);
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getMedalhas() {
		return medalhas;
	}
	public void setMedalhas(String medalhas) {
		this.medalhas = medalhas;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}

}
