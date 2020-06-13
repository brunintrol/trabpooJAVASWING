package view;

import java.util.Scanner;

import controller.AlunoController;
import model.Aluno;



public class AlunoView {

	public void create () {
		try {	
			Scanner sc = new Scanner(System.in);
			
			Aluno aluno = new Aluno();
			AlunoController controller = new AlunoController();
			
			System.out.println("Entre com a matricula: ");
			aluno.setMatricula(sc.nextLine());
			
			System.out.println("Entre com o nome: ");
			aluno.setNome(sc.nextLine());
			
			controller.create(aluno);

		} catch(Exception e) {
			System.out.println("Erro na tela de incluir aluno");

		}
		
	}
	
	public void readAll () {
		AlunoController controller = new AlunoController();
		
		System.out.println("Listagem de alunos");
		System.out.println("*******************");
		
		for (Aluno aluno:controller.readAll()) {
			System.out.println("Matricula:" + aluno.getMatricula());
			System.out.println("Nome:" + aluno.getNome());
			System.out.println("-------------------------");

		}
	}	

	public void update () {
		try {	
			Scanner sc = new Scanner(System.in);
			
			Aluno aluno = new Aluno();
			AlunoController controller = new AlunoController();
			
			System.out.println("Entre com a matricula: ");
			aluno.setMatricula(sc.nextLine());
			
			System.out.println("Entre com o novo nome: ");
			aluno.setNome(sc.nextLine());
			
			controller.update(aluno);

		} catch(Exception e) {
			System.out.println("Erro na tela de atualizar aluno");

		}

	}

	public void delete () {
		try {	
			Scanner sc = new Scanner(System.in);
			
			Aluno aluno = new Aluno();
			AlunoController controller = new AlunoController();
			
			System.out.println("Entre com a matricula que deseja excluir: ");
			aluno.setMatricula(sc.nextLine());
			
			controller.delete(aluno);

		} catch(Exception e) {
			System.out.println("Erro na tela de atualizar aluno");

		}

	}

	public static void main (String[] args) {
		AlunoView crud = new AlunoView();
		
		// create
		crud.create();
		crud.readAll();
		// update
		crud.update();
		crud.readAll();
		// delete
		crud.delete();
		crud.readAll();
		
	}	

}

