package desconto;

import javax.swing.JOptionPane;

public class Desconto {

	public static void main(String[] args) {
		double valor = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do produto:"));

		int desconto = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor do desconto:"));

		double total = valor * desconto / 100;
		total = valor - total;

		JOptionPane.showMessageDialog(null, "O valor a pagar é : " + total);

	}
}
