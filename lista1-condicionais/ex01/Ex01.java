package ex01;

import java.util.Scanner;

public class Ex01 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Qual a velocidade do carro: ");
		double vel = sc.nextDouble();
		
		if (vel <= 80) {
			System.out.println("Não há multa a pagar");
		} else {
			System.out.println("A multa foi de R$ " + ((vel - 80) * 5));
		}
	}

}
