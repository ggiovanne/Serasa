package ex08;

import java.util.Scanner;

public class Ex08 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite quantos km percorreu: ");
		double km = sc.nextDouble();
		
		if (km >= 200) {
			System.out.println("Você percorreu " + km + "km e pagará o valor de R$ " + (km * 0.45));
		} else {
			System.out.println("Você percorreu " + km + "km e pagará o valor de R$ " + (km * 0.50));
			
		}
		
		
	}
}
