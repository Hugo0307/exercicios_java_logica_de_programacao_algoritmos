package exercicioslista;

import javax.swing.JOptionPane;

public class Exercicio15 {

	public static void main(String[] args) {
		// Ler um valor e escrever se � positivo ou negativo (considere o valor zero
		// como positivo).

		int x = Integer
				.parseInt(JOptionPane.showInputDialog(" Digite um n�mero positivo ou negativo (Ex negativo: -10). "));
		if (x >= 0) {
			JOptionPane.showMessageDialog(null, " � um n�mero POSITIVO! ");
		} else {
			JOptionPane.showMessageDialog(null, " � um n�mero NEGATIVO! ");
		}
	}

}
