package aplication;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import entities.Contribuinte;
import entities.PessoaFisica;
import entities.PessoaJuridica;
public class MainImposto {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		List<Contribuinte> lista = new ArrayList<>();
		System.out.print("Informe o número de contribuintes:");
		int n = sc.nextInt();
		
		for(int i = 1; i <= n; i++) {
			sc.nextLine();
			System.out.println("Dados do contribuinte #"+i);
			System.out.print("Pessoa física ou jurídica (f/j)?");
			String opcao = sc.nextLine();
			
			System.out.print("Nome: ");
			String nome = sc.nextLine();
			System.out.print("Renda anual: ");
			Double renda = sc.nextDouble();
			
			if(opcao.equals("f")) {
				System.out.print("Gastos com saúde: ");
				Double gastos = sc.nextDouble();
				lista.add(new PessoaFisica(nome, renda, gastos));
			}
			else {
				System.out.print("Número de funcionários: ");
				int numero = sc.nextInt();
				lista.add(new PessoaJuridica(nome, renda, numero));
			}
		}
		
		System.out.println("IMPOSTOS PAGOS");
		Double total = 0.0;
		for(Contribuinte c: lista) {
			System.out.println(c.getNome()+": $"+c.imposto());
			total += c.imposto();
		}
		System.out.println("Total de impostos: "+total);
	
		sc.close();
	}
	
}
