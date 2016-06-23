package org.catolica.sc.analiseRequisitos.restaurante.bean;

public class Pagamento {
	
	private int id;
	private int nrCartao;
	private Pedido pedido;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getNrCartao() {
		return nrCartao;
	}
	public void setNrCartao(int nrCartao) {
		this.nrCartao = nrCartao;
	}	
	public Pedido getPedido() {
		return pedido;
	}
	public void setPedido(Pedido pedido) {
		this.pedido = pedido;
	}
	public void validarPagamento(){
		
	}
}
