package ex05;

import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite um ano: ");
		int ano = sc.nextInt();
		
		if (ano % 4 == 0) {
			System.out.println("O ANO É BISSEXTO");
		} else {
			System.out.println("O ANO NÃO É BISSEXTO2020");
		}
	}
}
