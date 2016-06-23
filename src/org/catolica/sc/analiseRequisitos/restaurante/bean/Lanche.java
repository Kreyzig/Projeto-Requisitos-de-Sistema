package org.catolica.sc.analiseRequisitos.restaurante.bean;

public class Lanche {

	private int id;
	private String nome;
	private String descricao;
	private float peso;
	private float preco;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		id = id;
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
	public float getPeso() {
		return peso;
	}
	public void setPeso(float peso) {
		this.peso = peso;
	}
	public float getPreco() {
		return preco;
	}
	public void setPreco(float preco) {
		this.preco = preco;
	}
}
