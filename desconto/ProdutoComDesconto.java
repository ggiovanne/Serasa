package desconto;

import javax.swing.JOptionPane;

public class ProdutoComDesconto {
	public static void main(String[] args) {

		String nomeProduto = JOptionPane.showInputDialog("Digite o nome do produto:");

		String valorProduto = JOptionPane.showInputDialog("Digite o valor do produto:");
		double valor = Double.parseDouble(valorProduto);

		double desconto = 0;

		if (valor >= 50 && valor < 200) {

			desconto = 5;

		} else if (valor >= 200 && valor < 500) {

			desconto = 6;

		} else if (valor >= 500 && valor < 1000) {
			desconto = 8;

		} else if (valor > 1000) {
			desconto = 10;
		}

		if (valor < 0) {
			JOptionPane.showMessageDialog(null, "Valor inválido.");
		} else {
			double valorComDesconto = valor * (100 - desconto) / 100;

			String mensagem = "Produto: " + nomeProduto + "\n" + "Valor original: R$ " + valor + "\n"
					+ "Valor com desconto: R$ " + valorComDesconto;

			JOptionPane.showMessageDialog(null, mensagem);
		}
	}
}
