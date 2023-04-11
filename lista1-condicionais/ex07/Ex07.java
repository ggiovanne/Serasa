package ex07;

import java.util.Scanner;

public class Ex07 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite seu nome:  ");
		String nome = sc.nextLine();
		
		System.out.println("Digite o sexo: ");
		String sexo = sc.nextLine();
		
		System.out.println("Digite valor da compra: ");
		double valor = sc.nextDouble();
		
		if (sexo.equalsIgnoreCase("m")) {
			System.out.println("A compra de " + nome + " ficou no valor de: " + (valor - (valor * 0.05)));
		} else if (sexo.equalsIgnoreCase("f")) {
			System.out.println("A compra de " + nome + " ficou no valor de: " + (valor - (valor * 0.13)));
		} else {
			System.out.println("Sexo inválido");
		}
	}
}
