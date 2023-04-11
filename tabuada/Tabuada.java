package tabuada;

import javax.swing.JOptionPane;

public class Tabuada {
	public static void main(String[] args) {

		String input = JOptionPane.showInputDialog(null, "Insira um número desejado:");
		int number = Integer.parseInt(input);

		String mensagem = "";
		for (int i = 1; i <= 10; i++) {
			int resultado = number * i;
			mensagem += number + " x " + i + " = " + resultado + "\n";
		}

		JOptionPane.showMessageDialog(null, mensagem);
	}
}
