package repeticao;

import javax.swing.JOptionPane;

public class Ex09 {
	public static void main(String[] args) {

		int menorIdadeDigitada = 0;
		String menorNome = "";

		for (int i = 1; i <= 3; i++) {
			String nome = JOptionPane.showInputDialog("Digite seu nome: ");
			int idade = Integer.parseInt(JOptionPane.showInputDialog("Insira sua idade: "));

			if (menorIdadeDigitada == 0 || idade < menorIdadeDigitada) {
				menorIdadeDigitada = idade;
				menorNome = nome;
			}
			JOptionPane.showMessageDialog(null,
					"Nome: " + nome + "idade: " + idade + "\nMenor idade digitada: " + menorIdadeDigitada);

		}
		JOptionPane.showMessageDialog(null, "Nome: " + menorNome + " idade: " + menorIdadeDigitada);

	}
}
