package ex02;

import java.util.Scanner;

public class Ex02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Qual o ano do seu nascimento? ");
		int ano = sc.nextInt();
		
		int idade = (2023 - ano);
		
		if (idade >= 16) {
			System.out.println("A idade é " + idade + " e vc pode votar");
		} else {
			System.out.println("A idade é " + idade + " e vc não pode votar");
		}
	}

}
