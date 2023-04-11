package login;

import javax.swing.JOptionPane;

public class LoginESenha {
	public static void main(String[] args) {

		String loginCorreta = "java8";
		String senhaCorreta = "java8";

		int tentativas = 3;
		while (tentativas > 0) {
			String login = JOptionPane.showInputDialog("Digite o login:");
			String senha = JOptionPane.showInputDialog("Digite o senha:");

			if (login.equals(loginCorreta) && (senha.equals(senhaCorreta))) {
				JOptionPane.showMessageDialog(null, "Acesso liberado!");
				break;
			} else {
				tentativas--;
				JOptionPane.showMessageDialog(null,
						"Dados de login ou senhas incorretos. Tentativas restantes:" + tentativas);
			}
		}
		if (tentativas == 0) {
			JOptionPane.showMessageDialog(null, "Número máximo de tentativas excedido. Acesso negado.");

		}
	}
}
