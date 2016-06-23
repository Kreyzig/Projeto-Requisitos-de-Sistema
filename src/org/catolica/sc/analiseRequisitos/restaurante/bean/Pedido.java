package org.catolica.sc.analiseRequisitos.restaurante.bean;

import java.security.Timestamp;
import java.util.List;

public class Pedido {
	
	private int id;
	private Timestamp dataHora;
	private float valorTotal;
	List<Ingrediente> ingredientesRetirados;
	private Lanche lanche;
	private Bebida bebida;
	private Acompanhamento acompanhamento;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Timestamp getDataHora() {
		return dataHora;
	}
	public void setDataHora(Timestamp dataHora) {
		this.dataHora = dataHora;
	}
	public float getValorTotal() {
		return valorTotal;
	}
	public void setValorTotal(float valorTotal) {
		this.valorTotal = valorTotal;
	}
	public List<Ingrediente> getIngredientesRetirados() {
		return ingredientesRetirados;
	}
	public void setIngredientesRetirados(List<Ingrediente> ingredientes) {
		ingredientes = ingredientes;
	}
	public Lanche getLanche() {
		return lanche;
	}
	public void setLanche(Lanche lanche) {
		this.lanche = lanche;
	}
	public Bebida getBebida() {
		return bebida;
	}
	public void setBebida(Bebida bebida) {
		this.bebida = bebida;
	}
	public Acompanhamento getAcompanhamento() {
		return acompanhamento;
	}
	public void setAcompanhamento(Acompanhamento acompanhamento) {
		this.acompanhamento = acompanhamento;
	}
	
	public void ConfirmaPedido(){
		
	}
	public void CancelarPedido(){
		
	}
	public int GerarSenha(){
		return 0;	
	}
	
	public void EntregarPedido(){
		
	}
	
	public void VerificaSenha(){
		
	}
	public void ExibirSenha(){
		
	}
	
	
	
}
