package exercicioslista;

import javax.swing.JOptionPane;

public class Exercicio8 {

	public static void main(String[] args) {

		/*
		 * Escreva um algoritmo para ler o n�mero total de eleitores de um munic�pio, o
		 * n�mero de votos brancos, nulos e v�lidos. Calcular e escrever o percentual
		 * que cada um representa em rela��o ao total de eleitores.
		 */

		double eleitores, brancos, nulos, validos, brancos_perc, nulos_perc, validos_perc;

		JOptionPane.showMessageDialog(null,
				" Descubra a porcentagem de votos em rela��o ao total de eleitores do munic�pio. ");
		eleitores = Double
				.parseDouble(JOptionPane.showInputDialog("Digite o n�mero total de eleitores do munic�pio: "));
		brancos = Double.parseDouble(JOptionPane.showInputDialog("Digite a quantidade de votos brancos: "));
		nulos = Double.parseDouble(JOptionPane.showInputDialog("Digite a quantidade de votos nulos: "));
		validos = Double.parseDouble(JOptionPane.showInputDialog("Digite a quantidade de votos validos: "));

		brancos_perc = (eleitores * brancos) / 100;
		nulos_perc = (eleitores * nulos) / 100;
		validos_perc = (eleitores * validos) / 100;

		JOptionPane.showMessageDialog(null,
				" Os votos brancos equivalem a " + brancos_perc + "% do total de eleitores.");
		JOptionPane.showMessageDialog(null, " Os votos nulos equivalem a " + nulos_perc + "% do total de eleitores.");
		JOptionPane.showMessageDialog(null,
				" Os votos validos equivalem a " + validos_perc + "% do total de eleitores.");

	}

}
