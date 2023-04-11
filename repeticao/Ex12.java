package repeticao;

import javax.swing.JOptionPane;

public class Ex12 {
	public static void main(String[] args) {

		int somaNumerosPares = 0;
		for (int i = 0; i < 4; i++) {
			int num = Integer.parseInt(JOptionPane.showInputDialog("Insira um número:"));
			if (num % 2 == 0) {
				somaNumerosPares++;
			}
		}
		System.out.println(" Temos " + somaNumerosPares + " números pares");
	}
}
