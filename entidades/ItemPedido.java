package entidades;

public class ItemPedido {

	private Integer quantidade;
	private Double preco;
	private Produto produto;
	
	
	public ItemPedido() {
		
	}


	public ItemPedido(Integer quantidade, Double price, Produto produto) {
		
		this.quantidade = quantidade;
		this.preco = price;
		this.produto = produto;
	}


	public Integer getQuantidade() {
		return quantidade;
	}


	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}


	public Double getPrice() {
		return preco;
	}


	public void setPrice(Double price) {
		this.preco = price;
	}


	public Produto getProduto() {
		return produto;
	}


	public void setProduto(Produto produto) {
		this.produto = produto;
	}
	
	public double subTotal() {
		return quantidade * preco;
	}


	@Override
	public String toString() {
		return getProduto().getNome() + ", $" + String.format("%.2f", preco) + ", quantidade: " + quantidade + ", subtotal: $" + String.format("%.2f%n", subTotal());
	}
	
}
