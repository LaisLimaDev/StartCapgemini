package lista1;

import java.util.Scanner;

public class Exercicio24Operações {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double numero1;
		double numero2;

		System.out.println("Digite o primeiro número: ");
		numero1 = sc.nextDouble();
		System.out.println("Digite o segundo número: ");
		numero2 = sc.nextDouble();
		System.out.println("A soma dos números é: " + (numero1 + numero2));
		System.out.println("A subtração dos números é: " + (numero1 - numero2));
		System.out.println("A multiplicação dos números é: " + (numero1 * numero2));
		System.out.println("A divisão dos números é: " + (numero1 /numero2));




	}

}

