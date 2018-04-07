package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import Model.Modalidade;

public class ModalidadeDAO {

	public List<Modalidade> carregarModalidade() {
		String sqlSelect = "SELECT * FROM modalidade";
		
		List m = new ArrayList<Modalidade>();
		// usando o try with resources do Java 7, que fecha o que abriu
		try (Connection conn = ConnectionFactory.obtemConexao();
				PreparedStatement stm = conn.prepareStatement(sqlSelect);) {
			
			try (ResultSet rs = stm.executeQuery();) {
				while(rs.next()) {
					
					Modalidade mm = new Modalidade();
					mm.setId(rs.getInt("id"));
					mm.setNome(rs.getString("nome"));
					m.add(mm);
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		} catch (SQLException e1) {
			System.out.print(e1.getStackTrace());
		}
		return m;
	}
}
