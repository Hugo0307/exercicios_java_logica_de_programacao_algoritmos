package exercicioslista;

import javax.swing.JOptionPane;

public class Exercicio21 {

	public static void main(String[] args) {
		// Ler a hora de início e a hora de fim de um jogo de Xadrez (considere apenas
		// horas inteiras, sem os minutos) e calcule a duração do jogo em
		// horas,sabendo-se que o tempo máximo de duração do jogo é de 24 horas e que o
		// jogopode iniciar em um dia e terminar no dia seguinte.

		int hInicial;
		int hFinal;
		
		do {
			hInicial = Integer
					.parseInt(JOptionPane.showInputDialog("Digite a hora inicial do jogo: (Desconsiderar minutos)"));
			if (hInicial < 0 || hInicial > 23) {
				JOptionPane.showMessageDialog(null, "Favor digitar um valor entre 0 e 23");
			} else {
			}
		} while (hInicial < 0 || hInicial > 23);
		do {
			hFinal = Integer
					.parseInt(JOptionPane.showInputDialog("Digite a hora final do jogo: (Desconsiderar minutos)"));
			if (hFinal < 0 || hFinal > 23) {
				JOptionPane.showMessageDialog(null, "Favor digitar um valor entre 0 e 23");
			} else {
			}
		} while (hFinal < 0 || hFinal > 23);

		int tempoDeJogo = hFinal - hInicial;

		JOptionPane.showMessageDialog(null, "O tempo de duração do jogo foi de " + tempoDeJogo + "hs.");

	}

}
