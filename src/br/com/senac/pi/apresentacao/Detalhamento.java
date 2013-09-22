package br.com.senac.pi.apresentacao;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.UIManager;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.Color;
import javax.swing.JButton;

import br.com.senac.pi.livro.Livro;


public class Detalhamento extends JFrame{

	public Detalhamento(Livro livroDetalhado){
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		
		setTitle("Livro");
		getContentPane().setLayout(null);
		setBounds(100, 100, 470, 360);
		setLocationRelativeTo(null);
		
		//Imagem
		JPanel panelImagem = new JPanel();
		panelImagem.setBorder(UIManager.getBorder("FormattedTextField.border"));
		panelImagem.setBounds(22, 11, 120, 122);
		getContentPane().add(panelImagem);
		
		//Titulo do Livro
		JLabel lblTtuloDoLivro = new JLabel("T\u00EDtulo do Livro");
		lblTtuloDoLivro.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblTtuloDoLivro.setBounds(152, 47, 143, 14);
		getContentPane().add(lblTtuloDoLivro);
		lblTtuloDoLivro.setText(livroDetalhado.getNome());
		
		//Autor do Livro
		JLabel lblAutorDoLivro = new JLabel("Autor do livro");
		lblAutorDoLivro.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblAutorDoLivro.setBounds(152, 72, 106, 14);
		getContentPane().add(lblAutorDoLivro);
		lblAutorDoLivro.setText(livroDetalhado.getAutor());
		
		//Ano do livro
		JLabel lblAno = new JLabel("Ano:");
		lblAno.setHorizontalAlignment(SwingConstants.RIGHT);
		lblAno.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblAno.setBounds(22, 144, 63, 14);
		getContentPane().add(lblAno);
		
		JLabel lblAnoDoLivro = new JLabel("Ano do livro");
		lblAnoDoLivro.setBounds(95, 144, 163, 14);
		getContentPane().add(lblAnoDoLivro);
		lblAnoDoLivro.setText(livroDetalhado.getAno());
		
		//Editora do Livro
		JLabel lblEditora = new JLabel("Editora:");
		lblEditora.setHorizontalAlignment(SwingConstants.RIGHT);
		lblEditora.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblEditora.setBounds(22, 169, 63, 14);
		getContentPane().add(lblEditora);
		
		JLabel lblEditoraDoLivro = new JLabel("Editora do livro");
		lblEditoraDoLivro.setBounds(95, 169, 163, 14);
		getContentPane().add(lblEditoraDoLivro);
		lblEditoraDoLivro.setText(livroDetalhado.getEditora());
		
		//Estante do livro
		JLabel lblEstante = new JLabel("Estante:");
		lblEstante.setHorizontalAlignment(SwingConstants.RIGHT);
		lblEstante.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblEstante.setBounds(22, 194, 63, 14);
		getContentPane().add(lblEstante);
		
		JLabel lblEstanteDoLivro = new JLabel("Estante do livro");
		lblEstanteDoLivro.setBounds(95, 194, 163, 14);
		getContentPane().add(lblEstanteDoLivro);
		lblEstanteDoLivro.setText(livroDetalhado.getEstante());
		
		//Peso do livro
		JLabel lblPeso = new JLabel("Peso:");
		lblPeso.setHorizontalAlignment(SwingConstants.RIGHT);
		lblPeso.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblPeso.setBounds(22, 219, 63, 14);
		getContentPane().add(lblPeso);
		
		JLabel lblPesoDoLivro = new JLabel("Peso do livro");
		lblPesoDoLivro.setBounds(95, 219, 163, 14);
		getContentPane().add(lblPesoDoLivro);
		lblPesoDoLivro.setText("" + livroDetalhado.getPeso());
		
		//Preco do livro
		JLabel lblPreo = new JLabel("Pre\u00E7o:");
		lblPreo.setHorizontalAlignment(SwingConstants.RIGHT);
		lblPreo.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblPreo.setBounds(22, 255, 63, 14);
		getContentPane().add(lblPreo);
		
		JLabel lblPrecoDoLivro = new JLabel("Preco do Livro");
		lblPrecoDoLivro.setForeground(Color.RED);
		lblPrecoDoLivro.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblPrecoDoLivro.setBounds(95, 256, 163, 14);
		getContentPane().add(lblPrecoDoLivro);
		lblPrecoDoLivro.setText("R$" + livroDetalhado.getPreco());
		
		
		//Descricao do livro
		JLabel lblDescrio = new JLabel("Descri\u00E7\u00E3o:");
		lblDescrio.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblDescrio.setBounds(268, 144, 66, 14);
		getContentPane().add(lblDescrio);

		//Botão voltar
		JButton btnVoltar = new JButton("Voltar");
		btnVoltar.setBounds(182, 287, 89, 23);
		getContentPane().add(btnVoltar);
		
	}
}
