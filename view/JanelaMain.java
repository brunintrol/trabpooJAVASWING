package view;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JOptionPane;


public class JanelaMain implements ActionListener {
	
	private enum Actions {
	    INSERIR,
	    LER,
	    UPDATE,
	    DELETE
	  }
	
	private JFrame frame = new JFrame();
	private JPanel painel = new JPanel();
	private JLabel lbltitulo = new JLabel("Principal");
	private JButton btninserir = new JButton("Inserir");
	private JButton btnler = new JButton("Ler");
	private JButton btnatualizar = new JButton("Atualizar");
	private JButton btndeletar = new JButton("Deletar");
	
	
	
public JanelaMain() {
		btndeletar.setActionCommand(Actions.DELETE.name());
		btnatualizar.setActionCommand(Actions.UPDATE.name());
		btninserir.setActionCommand(Actions.INSERIR.name());
		btnler.setActionCommand(Actions.LER.name());
		btninserir.addActionListener(this);
		btnler.addActionListener(this);		
		btnatualizar.addActionListener(this);
		btndeletar.addActionListener(this);
		
		painel.setBorder(BorderFactory.createEmptyBorder(0,100,100,100));
		painel.setLayout(new GridLayout(0,1));
		painel.add(lbltitulo);
		painel.add(btninserir);
		painel.add(btnler);
		painel.add(btnatualizar);
		painel.add(btndeletar);
		frame.add(painel,BorderLayout.CENTER);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.pack();
		frame.setVisible(true);
		frame.setTitle("Principal");
	}

public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub

	 if (e.getActionCommand() == Actions.INSERIR.name()) {
			JanelaInsert Insert = new JanelaInsert();
	    }
	 else if (e.getActionCommand() == Actions.LER.name()) {
		 	JanelaRead Read = new JanelaRead();
	    }
	 else if (e.getActionCommand() == Actions.UPDATE.name()) {
		 	JanelaUpdate Update = new JanelaUpdate();
	 }
	 else if (e.getActionCommand() == Actions.DELETE.name()) {
		 	JanelaDelete Delete = new JanelaDelete();
	 }	 
}


public static void main(String[] args) {
	// TODO Auto-generated method stub

	JanelaMain Main = new JanelaMain();

}

}

