package campeonato;

import java.util.Scanner;

public class Cameponato {
	public static void main(String[] args) {

		try (Scanner scan = new Scanner(System.in)) {
			System.out.print("Digite quantidade de pontos do lider:");
			int pontosLider = scan.nextInt();

			System.out.print("Digite quantidade de pontos do lanterna:");
			int pontosLanterna = scan.nextInt();

			int diferencaPontos = pontosLider - pontosLanterna;
			int numVitorias = diferencaPontos / 3;

			System.out.println("Número de vitórias necessárias para o lanterna alcançar o líder: " + numVitorias);

		}

	}
}
