package br.com.senac.pi.livro;

import java.util.ArrayList;
import java.util.List;

public class UtilLivro {

	Livro livroUm = new Livro();
	Livro livroDois = new Livro();
	Livro livroTres = new Livro();
	
	List<Livro> novaListaLivros = new ArrayList<Livro>();
	
	public UtilLivro(){
		
		livroUm.setNome("Mundo Java - Desmistificando a Tecnologia");
		livroUm.setAutor("Mundo Java");
		livroUm.setEditora("Mundo");
		livroUm.setAno("2004");
		livroUm.setEstante("Revista");
		livroUm.setPeso(329);
		livroUm.setPreco(1.05);
		livroUm.setDescricao(" Revista em excelente estado de conservação.");
		
		livroDois.setNome("Java - Desmistificando a Tecnologia");
		livroDois.setAutor("Mundo Java");
		livroDois.setEditora("Mundo");
		livroDois.setAno("2004");
		livroDois.setEstante("Revista");
		livroDois.setPeso(329);
		livroDois.setPreco(1.05);
		livroDois.setDescricao(" Revista em excelente estado de conservação.");
		
		livroTres.setNome("Desmistificando a Tecnologia");
		livroTres.setAutor("Mundo Java");
		livroTres.setEditora("Mundo");
		livroTres.setAno("2004");
		livroTres.setEstante("Revista");
		livroTres.setPeso(329);
		livroTres.setPreco(1.05);
		livroTres.setDescricao(" Revista em excelente estado de conservação.");
		
		novaListaLivros.add(livroUm);
		novaListaLivros.add(livroDois);
		novaListaLivros.add(livroTres);
			
	}
	
	public List<Livro> livrosPreFeitos() {
		
		return novaListaLivros;
		
	}
	
	
	
	
}
