package br.com.senac.pi.util;

import br.com.senac.pi.livro.Livro;

public class Lista {
	
	private No primeiro;
	
	public Lista() {
		this.primeiro = null;
	}
	
	
	//Get's & set's
	public No getPrimeiro() {
		return primeiro;
	}

	public void setPrimeiro(No primeiro) {
		this.primeiro = primeiro;
	}
	
	
	//Adicionando objetos
	public void add(Livro livro) {
		
		No novo = new No();
		novo.setLivro(livro);
		novo.setProx(null);
		
		if (primeiro == null) {
			primeiro = novo;
		} 
		else {
			
			No aux = primeiro;
			
			while (aux.getProx() != null) {
				aux = aux.getProx();
			}
			
			aux.setProx(novo);
		}
	}
	
	//Verifica o tamanho da lista
	public int getSize(){
		
		No aux = primeiro;
		int sizeList = 1;
		
		while (aux.getProx() != null){
			
			sizeList ++;
			aux = aux.getProx();
			
		}
		
		return sizeList;
	}
	
	
}
