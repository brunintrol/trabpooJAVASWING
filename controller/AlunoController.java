package controller;

import java.util.ArrayList;
import java.util.List;

import dao.AlunoDAO;
import model.Aluno;


public class AlunoController {
	
	//regra para incluir um aluno
	public void create (Aluno aluno) {
		try {
			AlunoDAO dao = new AlunoDAO();
			
			dao.create(aluno);
		
		} catch (Exception e) {
			System.out.println("Erro no Controller");
		
		}

		finally {
			System.out.println("Fim inserção");
		
		}
	
	}
	
	public List<Aluno> readAll () {
		List<Aluno> alunos = new ArrayList<Aluno>();
		
		try{
			AlunoDAO dao = new AlunoDAO();
			alunos = dao.readAll();		
		}
		
		finally {
			System.out.println("Fim da leitura!");
		}
		
		return alunos;
	
	}

	public void update (Aluno aluno) {
		try {
			AlunoDAO dao = new AlunoDAO();
			
			dao.update(aluno);
		
		} catch (Exception e) {
			System.out.println("Erro no Controller");
		
		}

		finally {
			System.out.println("Fim da atualização");
		
		}
	
	}

	public void delete (Aluno aluno) {
		try {
			AlunoDAO dao = new AlunoDAO();
			
			dao.delete(aluno);
		
		} catch (Exception e) {
			System.out.println("Erro no Controller");
		
		}

		finally {
			System.out.println("Aluno excluído");
		
		}
	
	}
	
}
