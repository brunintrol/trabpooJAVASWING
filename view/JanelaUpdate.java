package view;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import controller.AlunoController;
import model.Aluno;


public class JanelaUpdate implements ActionListener{

	private JFrame frame = new JFrame();
	private JPanel painel = new JPanel();
	private JLabel lbltitulo = new JLabel("Update");
	private JLabel lblmatricula = new JLabel("Matricula :");
	private JLabel lblnome = new JLabel("Novo Nome :");
	private JTextField txtmatricula = new JTextField(10);
	private JTextField txtnome = new JTextField(30);
	private JButton btnenviar = new JButton("Enviar");
	private JLabel lblstatus = new JLabel("");
	
	public JanelaUpdate() {
		
		btnenviar.addActionListener(this);
		
		painel.setBorder(BorderFactory.createEmptyBorder(30,30,10,30));
		painel.setLayout(new GridLayout(0,1));
		painel.add(lbltitulo);
		painel.add(lblmatricula);
		painel.add(txtmatricula);
		painel.add(lblnome);
		painel.add(txtnome);
		painel.add(btnenviar);
		painel.add(lblstatus);
		frame.add(painel,BorderLayout.CENTER);
		frame.pack();
		frame.setVisible(true);
		frame.setTitle("Update");
	}
	
	

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
		try {
			
			Aluno aluno = new Aluno();
			AlunoController controller = new AlunoController();
			
			aluno.setMatricula(txtmatricula.getText());
			aluno.setNome(txtnome.getText());
			
			txtmatricula.setText("");
			txtnome.setText("");
			
			controller.update(aluno);
			lblstatus.setText("Aluno " + aluno.getNome() + " atualizado com sucesso!!!");

		} catch(Exception e) {
			System.out.println("Erro na tela de atualizar aluno");

		}
		
		
		
		
		
	}
	
}
		