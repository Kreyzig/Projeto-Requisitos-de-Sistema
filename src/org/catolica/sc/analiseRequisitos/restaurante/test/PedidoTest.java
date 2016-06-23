package org.catolica.sc.analiseRequisitos.restaurante.test;

import org.catolica.sc.analiseRequisitos.restaurante.bean.Bebida;
import org.catolica.sc.analiseRequisitos.restaurante.bean.Ingrediente;
import org.catolica.sc.analiseRequisitos.restaurante.bean.Lanche;
import org.catolica.sc.analiseRequisitos.restaurante.bean.Pedido;

public class PedidoTest {
	
	public static void main(String[] args) {
		Bebida bebida = new Bebida();
		bebida.setId(1);
		bebida.setNome("Coca");
		bebida.setPreco((float) 2.50);
		
		Ingrediente ingrediente = new Ingrediente();
		ingrediente.setId(1);
		ingrediente.setNome("Pão");
		ingrediente.setPeso((float) 0.300);
		
		Ingrediente ingrediente2 = new Ingrediente();
		ingrediente2.setId(2);
		ingrediente2.setNome("Hamburguer");
		ingrediente2.setPeso((float) 0.180);
		
		Lanche lanche = new Lanche();
		lanche.setId(1);
		lanche.setDescricao("Pão e hamburguer");
		lanche.setNome("X-Burguer");
		lanche.setPeso((float) 0.500);
		lanche.setPreco(10);
		
		Pedido pedido = new Pedido();
		pedido.setId(1);
		pedido.setBebida(bebida);
		pedido.setLanche(lanche);
		pedido.setValorTotal(bebida.getPreco() + lanche.getPreco());
		
		System.out.println("Pedido nr: " + pedido.getId());
		System.out.println("Lanche do pedido: " + pedido.getLanche().getNome() + " (" + pedido.getLanche().getDescricao() + ")");
		System.out.println("Bebida: " + pedido.getBebida().getNome());
		System.out.println("Valor total: " + pedido.getValorTotal());
		
		
	}
	
}
