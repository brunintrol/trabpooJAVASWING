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


public class JanelaPopup implements ActionListener{
	
	
	private JFrame frame = new JFrame();
	private JPanel painel = new JPanel();
	private JLabel lbllista = new JLabel();
	
public JanelaPopup(String lista) {
		
		painel.setBorder(BorderFactory.createEmptyBorder(30,30,10,30));
		painel.setLayout(new GridLayout(0,1));
		lbllista.setText(lista);
		painel.add(lbllista);
		frame.add(painel,BorderLayout.CENTER);
		frame.pack();
		frame.setVisible(true);
		frame.setTitle("Lista");
	}

@Override
public void actionPerformed(ActionEvent arg0) {
	// TODO Auto-generated method stub
	
}
	
	

}