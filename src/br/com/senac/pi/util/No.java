package br.com.senac.pi.util;

import br.com.senac.pi.livro.Livro;

public class No {
	private Livro livro;
	private No prox;

	public Livro getLivro() {
		return livro;
	}

	public void setLivro(Livro livro) {
		this.livro = livro;
	}

	public No getProx() {
		return prox;
	}

	public void setProx(No prox) {
		this.prox = prox;
	}
	
}
