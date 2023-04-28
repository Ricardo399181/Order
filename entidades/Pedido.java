package entidades;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import entidades.enums.StatusPedido;

public class Pedido {

	private Date moment;
	private StatusPedido status;
	private Cliente cliente;
	private List<ItemPedido> item = new ArrayList<>();
	
	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/mm/yyy");
	
	public Pedido() {
		
	}
	
	
	public Pedido(Date moment, StatusPedido status, Cliente cliente) {
		
		this.moment = moment;
		this.status = status;
		this.cliente = cliente;
	}

	

	public Date getMoment() {
		
		return moment;
	}


	public void setMoment(Date moment) {
		this.moment = moment;
	}


	public StatusPedido getStatus() {
		return status;
	}


	public void setStatus(StatusPedido status) {
		this.status = status;
	}


	
	public Cliente getCliente() {
		return cliente;
	}


	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}


	public void addItem(ItemPedido item) {
	   this.item.add(item);
	   
	}
	
	public void removeItem(ItemPedido item) {
		this.item.remove(item);
	}
	
	public double total() {
		
		double valorTotal = 0;
		for (ItemPedido itens : item) {
			 valorTotal += itens.subTotal();
			
		}
		return valorTotal;
	}
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("momento do pedido: ");
		sb.append(sdf.format(moment) + "\n");
		sb.append("status do pedido: ");
		sb.append(status + "\n");
		sb.append("cliente : " );
		sb.append(cliente + "\n");
		sb.append("itens do pedido:\n");
		for (ItemPedido item : this.item) {
			sb.append(item + "\n");
		}
		
		sb.append(" preco total: ");
		sb.append(String.format("%.2f", total()));
		return sb.toString();
	}
}
