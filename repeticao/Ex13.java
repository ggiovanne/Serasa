package repeticao;

import javax.swing.JOptionPane;

public class Ex13 {
	public static void main(String[] args) {

		int somaNumerosQueEstaoEntre0E100 = 0;

		for (int i = 0; i < 4; i++) {

			int num = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero"));
			if (num >= 0 && num <= 100) {
				somaNumerosQueEstaoEntre0E100++;
			}
		}
		System.out.println("Temos: " + somaNumerosQueEstaoEntre0E100 + " entre 0 e 100");
	}
}
