package sequenciais;

import javax.swing.JOptionPane;

public class Ex03 {
	public static void main(String[] args) {

		String nome = JOptionPane.showInputDialog("Qual o seu nome?");

		double salario = Double.parseDouble(JOptionPane.showInputDialog("Qual o seu salário?"));

		JOptionPane.showMessageDialog(null,
				"Olá " + nome + " é um prazer te conhecer!" + "\n O salário digitado foi: " + salario);
	}
}
