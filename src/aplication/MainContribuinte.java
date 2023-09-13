package aplication;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import entities.Produto;
import entities.ProdutoImportado;
import entities.ProdutoUsado;

public class MainContribuinte {
	public static void main(String[] args) {	
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Informe a quantidade de produtos: ");
		int total = Integer.parseInt(sc.nextLine());
		
		List<Produto> produtos = new ArrayList<>();

		for(int i = 1 ; i <= total; i++) {
			System.out.println("Dados do produto #"+i);
			System.out.print("Comum, usado ou importado (c, u, i)? ");
			String tipo = sc.nextLine();
			
			System.out.print("Nome: ");
			String nome = sc.nextLine();
			System.out.print("Preço: ");
			Double preco = Double.parseDouble(sc.nextLine());
			
			if(tipo.equals("i")) {
				System.out.print("Valor da taxa: ");
				Double taxa = Double.parseDouble(sc.nextLine());
				produtos.add(new ProdutoImportado(nome, preco, taxa));
			}
			else if(tipo.equals("u")) {
				System.out.print("Data de fabricação (dd/MM/yyyy): ");
				String data = sc.nextLine();
				DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
				LocalDate dataFabricacao = LocalDate.parse(data, formatter);
				produtos.add(new ProdutoUsado(nome, preco, dataFabricacao));
			}
			else {
				produtos.add(new Produto(nome, preco));				
			}
		}
		
		System.out.println("ETIQUETAS DE PREÇO:");
		for(Produto p: produtos) {
			System.out.println(p.tagPreco());
		}

		sc.close();
	}
}
