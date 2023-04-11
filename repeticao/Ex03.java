package repeticao;

import javax.swing.JOptionPane;

public class Ex03 {
	public static void main(String[] args) {

		String nome = JOptionPane.showInputDialog("Digite seu nome");
		for (int i = 0; i < 10; i++) {
			System.out.println("Nome: " + nome);
		}
	}
}
