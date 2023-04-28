package aplicacao;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entidades.Cliente;
import entidades.ItemPedido;
import entidades.Pedido;
import entidades.Produto;
import entidades.enums.StatusPedido;

public class Programa {

	public static void main(String[] args) throws ParseException {
		Locale.setDefault(Locale.US);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/mm/yyy");

		Scanner sc = new Scanner(System.in);
		System.out.println("Entre com os dados do cliente:");

		System.out.print("Nome: ");
		String nome = sc.nextLine();
		System.out.print("Email: ");
		String email = sc.nextLine();
		System.out.print("Data de nascimento (dd/MM/yyyy): ");
		Date dataNasc = sdf.parse(sc.nextLine());

		Cliente cliente = new Cliente(nome, email, dataNasc);

		System.out.println("Entre com os dados do pedido:");
		System.out.print("Status: ");
		StatusPedido status =  StatusPedido.valueOf(sc.next().toUpperCase()); 

		 

		Pedido pedido = new Pedido(new Date(), status, cliente);

		System.out.print("quantos itens para esse pedido ? ");

		int n = sc.nextInt();
		sc.nextLine();

		for (int i = 0; i < n; i++) {
			sc.nextLine();
			System.out.println("entre com o item numero #" + (i + 1) + ":");
			System.out.print("nome do produto: ");
			String nomeProd = sc.nextLine();
			System.out.print("preco do produto: ");
			double preco = sc.nextDouble();
			System.out.print("quantidade: ");
			int quantidade = sc.nextInt();
			Produto produto = new Produto(nomeProd, preco);
			ItemPedido items = new ItemPedido(quantidade,preco, produto);
			
			pedido.addItem(items);

		}

		System.out.println();
		System.out.println(pedido);
		sc.close();
	}

}
