package desafio;

import java.util.Scanner;

public class Desafio {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite a medida do primeiro lado: ");
		double lado1 = sc.nextDouble();
		
		System.out.println("Digite a medida do segundo lado: ");
		double lado2 = sc.nextDouble();
		
		System.out.println("Digite a medida do terceiro lado: ");
		double lado3 = sc.nextDouble();
		
		if (lado1 < lado2 + lado3 & lado2 < lado1 +lado3 & lado3 < lado1 + lado2 ) {
			System.out.println("É POSSÍVEL FORMAR UM TRIANGULO");
		} else {
			System.out.println("NÃO É POSSÍVEL FORMAR UM TRIANGULO");
		}
	}

}
