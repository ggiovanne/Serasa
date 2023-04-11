package ex04;

import java.util.Scanner;

public class Ex04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite um número: ");
		int numero = sc.nextInt();
		
		if (numero % 2 == 0) {
			System.out.println("O NÚMERO É PAR");
		} else {
			System.out.println("O NÚMERO É ÍMPAR");
		}
		
	}

}
