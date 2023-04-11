package repeticao;

import javax.swing.JOptionPane;

public class Ex11 {
	public static void main(String[] args) {

		int somaMaioresQue8 = 0;

		for (int i = 1; i <= 3; i++) {
			int num = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero: "));
			if (num > 8) {
				somaMaioresQue8++;
			}
		}
		System.out.println(somaMaioresQue8 + " foram numeros maiores do que 8 ");
	}
}
