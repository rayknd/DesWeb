package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import model.Pais;

public class PaisDAO {
	// CRUD
		// INSERT
		public Pais criar(Pais pais) {
			String sqlInsert = "INSERT INTO pais(nome, populacao, area) VALUES (?, ?, ?)";
			try (Connection conn = ConnectionFactory.obtemConexao();
					PreparedStatement stm = conn.prepareStatement(sqlInsert);) {
				stm.setString(1, pais.getNome());
				stm.setInt(2, pais.getPopulacao());
				stm.setDouble(3, pais.getArea());
				stm.execute();
				String sqlQuery = "SELECT LAST_INSERT_ID()";
				try (PreparedStatement stm2 = conn.prepareStatement(sqlQuery);
						ResultSet rs = stm2.executeQuery();) {
					if (rs.next()) {
						pais.setId(rs.getInt(1));
					}
				} catch (SQLException e) {
					e.printStackTrace();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
			return pais;
		}
		
		// DELETE
		public void excluir(int id) {
			String sqlDelete = "DELETE FROM pais WHERE idpais = ?";
			try (Connection conn = ConnectionFactory.obtemConexao();
					PreparedStatement stm = conn.prepareStatement(sqlDelete);) {
				stm.setInt(1, id);
				stm.execute();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		// SELECT
		public Pais carregar(Pais pais) {
			String sqlSelect = "SELECT nome, populacao, area FROM pais WHERE idpais = ?";
			try (Connection conn = ConnectionFactory.obtemConexao();
					PreparedStatement stm = conn.prepareStatement(sqlSelect);) {
				stm.setInt(1, pais.getId());
				try (ResultSet rs = stm.executeQuery();) {
					if (rs.next()) {
						pais.setNome(rs.getString("nome"));
						pais.setPopulacao(rs.getInt("populacao"));
						pais.setArea(rs.getDouble("area"));
					} else {
						pais.setId(-1);
						pais.setNome(null);
						pais.setPopulacao(-1);
						pais.setArea(-1);
					}
				} catch (SQLException e) {
					e.printStackTrace();
				}
			} catch (SQLException e1) {
				System.out.print(e1.getStackTrace());
			}
			
			return pais;
		}
		
		// UPDATE
		public void atualizar(Pais pais) {
			String sqlUpdate = "UPDATE pais SET nome=?, populacao=?, area=? WHERE idpais=?";
			try (Connection conn = ConnectionFactory.obtemConexao();
					PreparedStatement stm = conn.prepareStatement(sqlUpdate);) {
				stm.setString(1, pais.getNome());
				stm.setInt(2, pais.getPopulacao());
				stm.setDouble(3, pais.getArea());
				stm.setInt(4, pais.getId());
				stm.execute();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
}
