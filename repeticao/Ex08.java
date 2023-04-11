package repeticao;

import javax.swing.JOptionPane;

public class Ex08 {
	public static void main(String[] args) {

		int somaQtPessoasMaioresDeIdade = 0;

		for (int i = 0; i < 4; i++) {
			int idade = Integer.parseInt(JOptionPane.showInputDialog("Insira sua idade"));
			if (idade >= 18) {
				somaQtPessoasMaioresDeIdade++;
			}
		}
		System.out.println("Soma total de pessoas maiores de idade: " + somaQtPessoasMaioresDeIdade);
	}
}
