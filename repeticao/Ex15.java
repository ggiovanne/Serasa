package repeticao;

import javax.swing.JOptionPane;

public class Ex15 {
	public static void main(String[] args) {

		int controlador = 1;
		int soma = 0;

		do {
			int num = Integer.parseInt(JOptionPane.showInputDialog("Insira um número"));
			soma += num;
			controlador = Integer.parseInt(JOptionPane
					.showInputDialog(" Deseja continuar? +" + "\nDigite 1 para sim  " + "\n  Digite -2 para parar"));

		} while (controlador >= 0);

		JOptionPane.showMessageDialog(null, "Soma: " + soma);
	}
}
