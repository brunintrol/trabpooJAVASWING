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


public class JanelaDelete implements ActionListener{

	private JFrame frame = new JFrame();
	private JPanel painel = new JPanel();
	private JLabel lbltitulo = new JLabel("Delete");
	private JLabel lblmatricula = new JLabel("Matricula :");
	private JTextField txtmatricula = new JTextField(10);
	private JButton btnenviar = new JButton("Deletar");
	private JLabel lblstatus = new JLabel("");
	
	public JanelaDelete() {
		
		btnenviar.addActionListener(this);
		
		painel.setBorder(BorderFactory.createEmptyBorder(30,30,10,30));
		painel.setLayout(new GridLayout(0,1));
		painel.add(lbltitulo);
		painel.add(lblmatricula);
		painel.add(txtmatricula);
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
			txtmatricula.setText("");
			
			controller.delete(aluno);
			lblstatus.setText("Aluno deletado com sucesso");

		} catch(Exception e) {
			lblstatus.setText("Erro na tela de deletar aluno");

		}
		
		
		
		
		
	}
	
}