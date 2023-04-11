package leituraDeDados;

import javax.swing.JOptionPane;

public class LeituraDados3 {

	public static void main(String[] args) {

		int idade = 0;

		idade = Integer.parseInt(JOptionPane.showInputDialog("Insira sua idade: "));
		System.out.println("Idade digitada foi: " + idade);
	}
}
