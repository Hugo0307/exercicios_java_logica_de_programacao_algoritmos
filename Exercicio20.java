package exercicioslista;

import javax.swing.JOptionPane;

public class Exercicio20 {

	public static void main(String[] args) {

		// Ler dois valores (considere que não serão lidos valores iguais) e escrevê-los
		// em ordem crescente.

		int x = Integer.parseInt(JOptionPane.showInputDialog("Digite um número:"));
		int y = Integer.parseInt(JOptionPane.showInputDialog("Digite outro número:"));
		if (x < y) {
			JOptionPane.showMessageDialog(null, "Em ordem crescente será: " + x + ", " + y);
		} else {
			JOptionPane.showMessageDialog(null, "Em ordem crescente será: " + y + ", " + x);
		}

	}

}
