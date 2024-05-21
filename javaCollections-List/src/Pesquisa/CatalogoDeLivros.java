package Pesquisa;

import java.util.ArrayList;
import java.util.List;

public class CatalogoDeLivros {
	private List<Livro> livroList;

	public CatalogoDeLivros() {
		this.livroList = new ArrayList<>();
	}
	
	public void adicionarLivro(String titulo, String autor, int anoPublicacao) {
		livroList.add(new Livro(titulo, autor, anoPublicacao));
	}
	
	public List<Livro> pesquisarPorAutor(String autor) {
		List<Livro> livrosPorAutor = new ArrayList<>();
		if (!livroList.isEmpty()) {
			for(Livro l : livroList) {
				if(l.getAutor().equalsIgnoreCase(autor)) {
					livrosPorAutor.add(l);
				}
			}
		}
			return livrosPorAutor;
		}	
	
	public List<Livro> pesquisarPorIntervaloDeAnos(int anoInicial, int anoFinal) {
		List<Livro> livrosPorIntervaloDeAnos = new ArrayList<>();
		if (!livroList.isEmpty()) {
			for(Livro l : livroList) {
				if(l.getAnoPublicacao() >= anoInicial && l.getAnoPublicacao() <= anoFinal) {
					livrosPorIntervaloDeAnos.add(l);
				}
			}
		}
		return livrosPorIntervaloDeAnos;

	}

	public Livro pesquisarPorTitulo(String titulo){
		Livro livroPorTitulo = null;
		if(!livroList.isEmpty()) {
			for(Livro l : livroList) {
				if(l.getTitulo().equalsIgnoreCase(titulo)) {
					livroPorTitulo = l;
					break;
				}
			}
		}
		return livroPorTitulo;
	}
}
