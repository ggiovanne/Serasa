package sequenciais;

import javax.swing.JOptionPane;

public class Ex02 {
	public static void main(String[] args) {

		String nome = JOptionPane.showInputDialog("Qual o seu nome?");
		JOptionPane.showMessageDialog(null, "Olá " + nome + " é um prazer te conhecer!");
	}
}
