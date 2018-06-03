package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import model.Modalidade;
import model.Olimpiada;

public class ModalidadeDAO {
	// INSERT
	public Modalidade criar(Modalidade modalidade, Olimpiada olimpiada) {
		String sqlInsert = "INSERT INTO modalidade(nome, tipo) VALUES ( ?, ?)";
		try (Connection conn = ConnectionFactory.obtemConexao();
				PreparedStatement stm = conn.prepareStatement(sqlInsert);) {
			stm.setString(1, modalidade.getNome());
			stm.setString(2, olimpiada.getTipo());
			stm.execute();
			String sqlQuery = "SELECT LAST_INSERT_ID()";
			try (PreparedStatement stm2 = conn.prepareStatement(sqlQuery);
					ResultSet rs = stm2.executeQuery();) {
				if (rs.next()) {
					modalidade.setId(rs.getInt(1));
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return modalidade;
	}
	
	public Modalidade carregar(Modalidade modalidade) {
		String sqlSelect = "SELECT nome FROM modalidade WHERE idmodalidade = ?";
		try (Connection conn = ConnectionFactory.obtemConexao();
				PreparedStatement stm = conn.prepareStatement(sqlSelect);) {
			stm.setInt(1, modalidade.getId());
			try (ResultSet rs = stm.executeQuery();) {
				if (rs.next()) {
					modalidade.setNome(rs.getString("nome"));
				} else {
					modalidade.setId(-1);
					modalidade.setNome(null);
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		} catch (SQLException e1) {
			System.out.print(e1.getStackTrace());
		}
		return modalidade;
	}
	
	public void excluir(int id) {
		String sqlDelete = "DELETE FROM modalidade WHERE idmodalidade = ?";
		try (Connection conn = ConnectionFactory.obtemConexao();
				PreparedStatement stm = conn.prepareStatement(sqlDelete);) {
			stm.setInt(1, id);
			stm.execute();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void atualizar(Modalidade modalidade, Olimpiada olimpiada) {
		String sqlUpdate = "UPDATE modalidade SET nome=?, tipo=?, WHERE idmodalidade=?";
		try (Connection conn = ConnectionFactory.obtemConexao();
				PreparedStatement stm = conn.prepareStatement(sqlUpdate);) {
			stm.setString(1, modalidade.getNome());
			stm.setString(2, olimpiada.getTipo());
			stm.setInt(3, modalidade.getId());
			stm.execute();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public ArrayList<Modalidade> listarModalidade() {
		ArrayList <Modalidade> modalidade = new ArrayList <>();
		String sql = "SELECT * FROM modalidade";
		try (Connection conn = ConnectionFactory.obtemConexao();
				PreparedStatement ps = conn.prepareStatement(sql);
				ResultSet rs = ps.executeQuery()){
				while (rs.next()) {
					int    id   	= rs.getInt("idmodalidade");
					String nome 	= rs.getString("nome");
					String tipo 	= rs.getString("tipo");

					Modalidade mode = new Modalidade();
					mode.setId(id);
					mode.setNome(nome);
					mode.setTipo(tipo);
					modalidade.add(mode);

				}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		return modalidade;
	}
	
	public ArrayList<Modalidade> listarModalidade(String chave) {
		Modalidade modalidade;
		ArrayList<Modalidade> lista = new ArrayList<>();
		String sqlSelect = "SELECT idmodalidade, nome, tipo FROM modalidade where upper(nome) like ?";
		// usando o try with resources do Java 7, que fecha o que abriu
		try (Connection conn = ConnectionFactory.obtemConexao();
				PreparedStatement stm = conn.prepareStatement(sqlSelect);) {
			stm.setString(1, "%" + chave.toUpperCase() + "%");
			try (ResultSet rs = stm.executeQuery();) {
				while (rs.next()) {
					modalidade = new Modalidade();
					modalidade.setId(rs.getInt("idmodalidade"));
					modalidade.setNome(rs.getString("nome"));
					modalidade.setTipo(rs.getString("tipo"));
					lista.add(modalidade);
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		} catch (SQLException e1) {
			System.out.print(e1.getStackTrace());
		}
		return lista;
	}
	
}