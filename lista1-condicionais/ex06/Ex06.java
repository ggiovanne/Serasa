package ex06;

import java.util.Scanner;

public class Ex06 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite seu ano de nascimento: ");
		int ano = sc.nextInt();
		
		int idade = 2023 - ano;
		
		if (idade == 18) {
			System.out.println("VOCÊ JÁ PODE SE ALISTAR");
		} else if (idade > 18) {
			System.out.println("VOCÊ JÁ PODE SE ALISTAR E ESTÁ " + (idade - 18) + " ATRASADO");
		} else {
			System.out.println("FALTA " + (18 - idade) + " ANOS PARA SE ALISTAR");
		}
	}

}
