package exercicioslista;

import javax.swing.JOptionPane;

public class Exercicio20 {

	public static void main(String[] args) {

		// Ler dois valores (considere que n�o ser�o lidos valores iguais) e escrev�-los
		// em ordem crescente.

		int x = Integer.parseInt(JOptionPane.showInputDialog("Digite um n�mero:"));
		int y = Integer.parseInt(JOptionPane.showInputDialog("Digite outro n�mero:"));
		if (x < y) {
			JOptionPane.showMessageDialog(null, "Em ordem crescente ser�: " + x + ", " + y);
		} else {
			JOptionPane.showMessageDialog(null, "Em ordem crescente ser�: " + y + ", " + x);
		}

	}

}
