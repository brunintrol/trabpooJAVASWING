package view;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import controller.AlunoController;
import model.Aluno;


public class JanelaRead implements ActionListener{

	private JFrame frame = new JFrame();
	private JPanel painel = new JPanel();
	private JLabel lbltitulo = new JLabel("Listagem de Alunos");
	private JButton btnler= new JButton("Abrir lista");
	
	public JanelaRead() {
		
		btnler.addActionListener(this);
		
		painel.setBorder(BorderFactory.createEmptyBorder(00,100,40,100));
		painel.setLayout(new GridLayout(0,1));
		painel.add(lbltitulo);
		painel.add(btnler);
		frame.add(painel,BorderLayout.CENTER);
		frame.pack();
		frame.setVisible(true);
		frame.setTitle("Leitura");
	}
	

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub

		String string="";
		
		AlunoController controller = new AlunoController();
		
		
		for (Aluno aluno:controller.readAll()) {
			string=(string + "Matricula:" + aluno.getMatricula() + "<br/>" + "Nome:" + aluno.getNome() + "<br/><br/>");
		}
		
		String html=("<html>" + string + "</html>");
		
		@SuppressWarnings("unused")
		JanelaPopup pop= new JanelaPopup(html);
		
	}
	
}



		