package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import Model.AnoOlimpiada;
import Model.Modalidade;
import Model.Olimpiada;
import Model.Pais;

public class OlimpiadaDAO {
	
	
	ConnectionFactory c = new ConnectionFactory();
	public void criarOlimpiada(Pais p, Modalidade m, AnoOlimpiada a ) {
		String sqlInsert = "INSERT INTO olimpiada(ouro, prata, bronze, pais_id_pais, modalidade_id_modalidade, ano_id_ano) VALUES (?, ?, ?, ?, ?, ?)";
		
		// usando o try with resources do Java 7, que fecha o que abriu
		try (Connection conn = c.obtemConexao();
				PreparedStatement stm = conn.prepareStatement(sqlInsert);) {
			stm.setInt(1, m.getOuro());
			stm.setInt(2, m.getPrata());
			stm.setInt(3, m.getBronze());
			stm.setInt(4, p.getId());
			stm.setInt(5, m.getId());
			stm.setInt(6, a.getId());
			stm.execute();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	public void carregarOlimpiada(Pais p, Modalidade m, AnoOlimpiada a) {
		String sqlSelect = "SELECT * FROM olimpiada WHERE olimpiada.pais_id_pais = ?, olimpiada.modalidade_id_modalidade = ? and olimpiada.ano_id_ano = ?";
		
		// usando o try with resources do Java 7, que fecha o que abriu
		try (Connection conn = c.obtemConexao();
				PreparedStatement stm = conn.prepareStatement(sqlSelect);) {
			stm.setInt(1, p.getId());
			stm.setInt(2, m.getId());
			stm.setInt(3, a.getId());
			try (ResultSet rs = stm.executeQuery();) {
				if (rs.next()) {
					m.setOuro(Integer.parseInt(rs.getString("ouro")));
					m.setPrata(Integer.parseInt(rs.getString("prata")));
					m.setBronze(Integer.parseInt(rs.getString("bronze")));
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		} catch (SQLException e1) {
			System.out.print(e1.getStackTrace());
		}
	}
	public void atualizarOlimpiada(Pais p, Modalidade m, AnoOlimpiada a) {
		String sqlUpdate = "UPDATE olimpiada SET ouro=?, prata=?, bronze=? WHERE pais_id_pais=?, modalidade_id_modalidade=?,"
				+ "ano_id_ano=?";
		// usando o try with resources do Java 7, que fecha o que abriu
		
		try (Connection conn = c.obtemConexao();
				PreparedStatement stm = conn.prepareStatement(sqlUpdate);) {
			stm.setInt(1, m.getOuro());
			stm.setInt(2, m.getPrata());
			stm.setInt(3, m.getBronze());
			stm.setInt(4, p.getId());
			stm.setInt(5, m.getId());
			stm.setInt(6, a.getId());
			stm.execute();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public void excluirOlimpiada(Pais p, Modalidade m, AnoOlimpiada a) {
		String sqlDelete = "DELETE FROM olimpiada WHERE pais_id_pais = ?, modalidade_id_modalidade=?, ano_id_ano=?";
		// usando o try with resources do Java 7, que fecha o que abriu
		try (Connection conn = c.obtemConexao();
				PreparedStatement stm = conn.prepareStatement(sqlDelete);) {
			stm.setInt(1, p.getId());
			stm.setInt(2, m.getId());
			stm.setInt(3, a.getId());
			stm.execute();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public List<AnoOlimpiada> listarAno(){
		String sqlSelect = "select * from ano";
		List ano = new ArrayList<AnoOlimpiada>();
		
		
		try(Connection conn = c.obtemConexao(); PreparedStatement stm = conn.prepareStatement(sqlSelect);){
			try(ResultSet rs = stm.executeQuery();){
				while(rs.next()) {
					AnoOlimpiada a = new AnoOlimpiada();
					a.setId(rs.getInt("id"));
					a.setAno(rs.getInt("ano"));
					a.setTipo(rs.getString("tipo"));
					ano.add(a);
				}
			}
			catch(Exception e) {
				e.printStackTrace();
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		return ano;
	}

	
	
	
}
