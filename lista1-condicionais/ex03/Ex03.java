package ex03;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Qual a o seu nome? ");
		String nome = sc.nextLine();

		System.out.println("Qual a primeira nota? ");
		double nota1 = sc.nextDouble();

		System.out.println("Qual a  segunda nota? ");
		double nota2 = sc.nextDouble();

		double media = (nota1 + nota2) / 2;

		System.out.println("A media das notas de " + nome + " é: " + media);

		if (media >= 7) {
			System.out.println("APROVADO");
		} else {
			System.out.println("REPROVADO");
		}
	}

}
