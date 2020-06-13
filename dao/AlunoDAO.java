package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import jdbc.ConnectionFactory;
import model.Aluno;

public class AlunoDAO {
	
	//insere aluno no banco CRUD - Create, Read, Update, Delete
	public void create (Aluno aluno) {
		Connection connect = ConnectionFactory.getConnection();
		PreparedStatement stmt = null;
		String sql = "insert into aluno(matricula, nome) values (?, ?)";
		
		try {
			stmt = connect.prepareStatement(sql);  //instancia uma instrucao sql
			stmt.setString(1, aluno.getMatricula()); //primeiro parametro da query
			stmt.setString(2, aluno.getNome()); //segundo parametro
			
			stmt.executeUpdate();
			//System.out.println("[AlunoDAO] Aluno incluido com sucesso");
			
		} catch (SQLException e) {
			e.printStackTrace();
		}

		finally {
			ConnectionFactory.closeConnection(connect, stmt);
		}	
	}
	
	//ler todos os registros da tabela aluno
	public List<Aluno> readAll () {
		Connection connect = ConnectionFactory.getConnection();
		PreparedStatement stmt = null;
		ResultSet rs = null;
		
		String sql = "select matricula, nome from aluno";
		List<Aluno> alunos = new ArrayList<Aluno>();
		
		try{
			stmt = connect.prepareStatement(sql);
			rs = stmt.executeQuery();
			
			while (rs.next()) {
				Aluno aluno = new Aluno();
				
				aluno.setMatricula(rs.getString("matricula"));
				aluno.setNome(rs.getString("nome"));
				alunos.add(aluno);

			}

		} catch(SQLException e) {
			System.out.println("Erro ao tentar ler tabela aluno");

		}

		finally {
			ConnectionFactory.closeConnection(connect, stmt);
		
		}
		
		return alunos;
	
	}

	// Update
	public void update (Aluno aluno) {
		Connection connect = ConnectionFactory.getConnection();
		PreparedStatement stmt = null;
		String sql = "update aluno set nome = ? where matricula = ?";
		
		try {
			stmt = connect.prepareStatement(sql);  //instancia uma instrucao sql
			stmt.setString(1, aluno.getNome()); //primeiro parametro da query
			stmt.setString(2, aluno.getMatricula()); //segundo parametro
			
			stmt.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}

		finally {
			ConnectionFactory.closeConnection(connect, stmt);
		}	
	}

	// Delete
	public void delete (Aluno aluno) {
		Connection connect = ConnectionFactory.getConnection();
		PreparedStatement stmt = null;
		String sql = "delete from aluno where matricula = ?";
		
		try {
			stmt = connect.prepareStatement(sql);  //instancia uma instrucao sql
			stmt.setString(1, aluno.getMatricula()); //primeiro parametro
			
			stmt.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}

		finally {
			ConnectionFactory.closeConnection(connect, stmt);
		}	
	}

}
