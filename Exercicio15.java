package exercicioslista;

import javax.swing.JOptionPane;

public class Exercicio15 {

	public static void main(String[] args) {
		// Ler um valor e escrever se é positivo ou negativo (considere o valor zero
		// como positivo).

		int x = Integer
				.parseInt(JOptionPane.showInputDialog(" Digite um número positivo ou negativo (Ex negativo: -10). "));
		if (x >= 0) {
			JOptionPane.showMessageDialog(null, " É um número POSITIVO! ");
		} else {
			JOptionPane.showMessageDialog(null, " É um número NEGATIVO! ");
		}
	}

}
