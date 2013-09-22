package br.com.senac.pi.livro;

import java.awt.Image;

public class Livro {
	
	private double preco;
	private int peso;
	private String autor;
	private String ano;
	private String descricao;
	private String editora;
	private String estante;
	private String nome;
	private Image imagem;
	

	public Livro(){
		
		nome = "";
		autor = "";
		ano = "";
		editora = "";
		estante = "";
		peso = 0;
		preco = 0.0;
		descricao = "";
		
	}
	
	//Gets and Sets
	public double getPreco() {
		return preco;
	}
	
	public void setPreco(double preco) {
		this.preco = preco;
	}
	public int getPeso() {
		return peso;
	}
	public void setPeso(int peso) {
		this.peso = peso;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public String getAno() {
		return ano;
	}
	public void setAno(String ano) {
		this.ano = ano;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public String getEditora() {
		return editora;
	}
	public void setEditora(String editora) {
		this.editora = editora;
	}
	public String getEstante() {
		return estante;
	}
	public void setEstante(String estante) {
		this.estante = estante;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Image getImagem() {
		return imagem;
	}
	public void setImagem(Image imagem) {
		this.imagem = imagem;
	}

	public Livro AdicionarLivro(String nome, String autor, String ano, String estante, int peso, double preco, String descricao){
		
		Livro novoLivro = new Livro();
		
		novoLivro.setNome(nome);
		novoLivro.setAutor(autor);
		novoLivro.setAno(ano);
		novoLivro.setEstante(estante);
		novoLivro.setPeso(peso);
		novoLivro.setPreco(preco);
		novoLivro.setDescricao(descricao);
		
		return novoLivro;
		
	}
	
	
}
