package lista1;

import java.util.Scanner;

public class Exercício3ConsumoGasolina {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		float distancia;
		float combustivelGasto;
		System.out.println("Digite a distância percorrida: ");
		distancia = sc.nextFloat();
		System.out.println("Digite o combustível gasto: ");
		combustivelGasto = sc.nextFloat();
		System.out.println("Digite a distância percorrida: ");
		System.out.println("O consumo médio do automóvel foi: "+(combustivelGasto/distancia)+" litro(s) por km");


				
		
	}

}
