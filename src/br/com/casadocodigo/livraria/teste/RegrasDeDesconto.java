package br.com.casadocodigo.livraria.teste;

import br.com.casadocodigo.livraria.Autor;
import br.com.casadocodigo.livraria.produtos.Ebook;
import br.com.casadocodigo.livraria.produtos.LivroFisico;

public class RegrasDeDesconto {
	public static void main(String[] args) {
		
		Autor autor = new Autor();
		autor.setNome("Rodrigo Turini");
		
		LivroFisico livro = new LivroFisico(autor);
		livro.setValor(59.90);
		
		if(!livro.aplicaDescontoDe(0.3)) {
			System.out.println("Desconto no livro não pode ser maior do que 30% ");
		} else{
			System.out.printf("Valor do livro com desconto é de: %.2f %n", livro.getValor());
		}
		
		Ebook ebook = new Ebook(autor);
		ebook.setValor(29.90);
		
		if(!ebook.aplicaDescontoDe(0.15)) {
			System.out.println("Desconto no livro não pode ser maior do que 30% ");
		} else{
			System.out.printf("Valor do livro com desconto é de: %.2f %n", ebook.getValor());
		}
	}

}
