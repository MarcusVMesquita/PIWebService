package br.com.senac.pi.apresentacao;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.UIManager;
import javax.swing.JTextField;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;

import br.com.senac.pi.livro.*;
import br.com.senac.pi.util.*;

import java.util.*;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Font;


public class Principal extends JFrame {
	private JTextField txtChave;
	private JTable tableResultado;

	public Principal() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setTitle("Estante Virtual");
		
		//Dados gerais
		setBounds(100, 100, 600, 450);
		setLocationRelativeTo(null);
		getContentPane().setLayout(null);
		
		JPanel panelPesquisa = new JPanel();
		panelPesquisa.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Digite a palavra-chave abaixo:", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panelPesquisa.setBounds(133, 22, 315, 107);
		getContentPane().add(panelPesquisa);
		panelPesquisa.setLayout(null);
		
		JLabel lblPalavrachave = new JLabel("Palavra-Chave:");
		lblPalavrachave.setHorizontalAlignment(SwingConstants.RIGHT);
		lblPalavrachave.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblPalavrachave.setBounds(10, 33, 112, 14);
		panelPesquisa.add(lblPalavrachave);
		
		//text field Palavra-chave
		txtChave = new JTextField();
		txtChave.setBounds(132, 26, 157, 31);
		panelPesquisa.add(txtChave);
		txtChave.setColumns(10);
		
		//Botão pesquisar
		JButton btnPesquisar = new JButton("Pesquisar");
		btnPesquisar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			
				List<Livro> livrosObtidos = new ArrayList<Livro>();
				UtilLivro testadorDePrograma = new UtilLivro();
				
				livrosObtidos = testadorDePrograma.livrosPreFeitos();
			
				prencherTabela(livrosObtidos);

				
				livrosObtidos = testadorDePrograma.livrosPreFeitos();
						
			}
		});
		btnPesquisar.setBounds(68, 68, 89, 23);
		panelPesquisa.add(btnPesquisar);
		
		JButton btnHistrico = new JButton("Hist\u00F3rico");
		btnHistrico.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			
				Historico novaTelaHistotico = new Historico();
				novaTelaHistotico.setVisible(true);
			
			}
		});
		btnHistrico.setBounds(172, 68, 89, 23);
		panelPesquisa.add(btnHistrico);
		
		JScrollPane scpResultado = new JScrollPane();
		scpResultado.setBounds(10, 157, 564, 209);
		getContentPane().add(scpResultado);
		
		tableResultado = new JTable();
		scpResultado.setViewportView(tableResultado);
		
		JLabel lblResultadoDaPesquisa = new JLabel("Resultado da Pesquisa:");
		lblResultadoDaPesquisa.setBounds(10, 132, 134, 14);
		getContentPane().add(lblResultadoDaPesquisa);
		
		JButton btnSair = new JButton("Sair");
		btnSair.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			
				if (JOptionPane.showConfirmDialog(null, "Deseja realmete sair do programa?", "Sair do Programa", JOptionPane.YES_NO_OPTION) == 0){
					
					setVisible(false);
					dispose();
					
				}
			
			}
		});
		btnSair.setBounds(485, 377, 89, 23);
		getContentPane().add(btnSair);
		
		JButton btnDetalhar = new JButton("Detalhar");
		btnDetalhar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				int indice;
				Livro livroDetalhado = new Livro();
				List<Livro> livrosObtidos = new ArrayList<Livro>();
				UtilLivro testadorDePrograma = new UtilLivro();
				
				livrosObtidos = testadorDePrograma.livrosPreFeitos();
				indice = tableResultado.getSelectedRow();
				livroDetalhado = livrosObtidos.get(indice);
				
				Detalhamento novaTelaDetalhamento = new Detalhamento(livroDetalhado);
				novaTelaDetalhamento.setVisible(true);
				
			}
		});
		btnDetalhar.setBounds(386, 377, 89, 23);
		getContentPane().add(btnDetalhar);
		
	}
public void prencherTabela(List<Livro> livrosObtidos){
		
		String[] colunas = new String[4];
		String[][] dados = new String[livrosObtidos.size()][4];
		
		colunas[0] = "Livro";
		colunas[1] = "Autor";
		colunas[2] = "Estante";
		colunas[3] = "Preço";
	
		
		int contador = 0;
			
		for (Livro l: livrosObtidos){
			
			dados[contador][0] = l.getNome();
			dados[contador][1] = l.getAutor();
			dados[contador][2] = l.getEstante();
			dados[contador][3] = "R$" + l.getPreco();
			
			contador++;
		}
		
		tableResultado.setModel(new DefaultTableModel(dados, colunas));
		tableResultado.getColumnModel().getColumn(0).setPreferredWidth(300);
		tableResultado.getColumnModel().getColumn(1).setPreferredWidth(300);
		tableResultado.getColumnModel().getColumn(2).setPreferredWidth(200);
		tableResultado.getColumnModel().getColumn(3).setPreferredWidth(100);
	}
}
