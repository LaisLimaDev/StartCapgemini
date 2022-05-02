package lista1;

import java.util.Scanner;

public class Exercicio4Vendedor {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String nome;
		float salario;
		int vendas;
		float salarioTotal;
		System.out.println("Digite seu nome: ");
		nome = sc.next();
		System.out.println("Digite seu salário fixo: ");
		salario = sc.nextFloat();
		System.out.println("Digite o total de vendas em dinheiro: ");
		vendas = sc.nextInt();
		salarioTotal = (salario+((vendas*15)/100));
		System.out.println("Seu salário total será: "+salarioTotal);
	}

}
