package br.com.casadocodigo.livraria.produtos;

import br.com.casadocodigo.livraria.Autor;
import br.com.casadocodigo.livraria.exception.AutorNuloException;

public abstract class Livro implements Produto {

	private String nome;
	private String descricao;
	private double valor;
	private String isbn;
	private Autor autor;

	public Livro(Autor autor) {

		if (autor == null) {
			throw new AutorNuloException("O Autor do livro não pode ser nulo");
		}

		this.autor = autor;
		this.isbn = "000-00-00000-00-0";
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public Autor getAutor() {
		return autor;
	}

	public void setAutor(Autor autor) {
		this.autor = autor;
	}

	public boolean temAutor() {
		return this.autor != null;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Monstrando detalhes do livro: \n");
		sb.append("Nome: " + nome + "\n");
		sb.append("Descrição: " + descricao + "\n");
		sb.append("Valor: " + valor + "\n");
		sb.append("ISBN: " + isbn + "\n");

		if (this.temAutor()) {
			sb.append(autor.toString());
		}

		sb.append("-------------------");
		return sb.toString();
	}

	@Override
	public int compareTo(Produto outro) {
		if (this.getValor() < outro.getValor()) {
			return -1;
		}

		if (this.getValor() > outro.getValor()) {
			return 1;
		}

		return 0;
	}

}
