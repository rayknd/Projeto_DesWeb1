package TO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import DAO.ConnectionFactory;

public class PaisTO {
	private int id;
	private String nome;
	private long populacao;
	private double area;
	
	ArrayList<OlimpiadaTO>olimpiada = new ArrayList<OlimpiadaTO>();
	
	public PaisTO() {
		
	}
	
	public PaisTO(int id, String nome, long populacao, double area) {
		setId(id);
		setNome(nome);
		setPopulacao(populacao);
		setArea(area);
	}
	
	public void setId(int id) {
		this.id=id;
	}
	public int getId() {
		return id;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getNome() {
		return nome;
	}
	public void setPopulacao(long populacao) {
		this.populacao = populacao;
	}
	public long getPopulacao() {
		return populacao;
	}
	public void setArea(double area) {
		this.area=area;
	}
	public double getArea() {
		return area;
	}
		
}