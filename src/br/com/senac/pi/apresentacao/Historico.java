package br.com.senac.pi.apresentacao;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JPanel;
import javax.swing.JButton;

public class Historico extends JFrame {
	private JTable tableHistorico;

	public Historico(){
		
		//Dados gerais
		setTitle("Histórico");
		setBounds(100, 100, 550, 350);
		setLocationRelativeTo(null);
		getContentPane().setLayout(null);
		
		JScrollPane scpHistorico = new JScrollPane();
		scpHistorico.setBounds(10, 11, 514, 255);
		getContentPane().add(scpHistorico);
		
		tableHistorico = new JTable();
		scpHistorico.setViewportView(tableHistorico);
		
		JButton btnVoltar = new JButton("Voltar");
		btnVoltar.setBounds(224, 277, 89, 23);
		getContentPane().add(btnVoltar);
		
		
	}
}
