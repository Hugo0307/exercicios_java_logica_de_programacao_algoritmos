package exercicioslista;

import javax.swing.JOptionPane;

public class Exercicio19 {

	public static void main(String[] args) {

		// Ler dois valores (considere que n�o ser�o lidos valores iguais) e escrever o
		// maior deles.

		int a = Integer.parseInt(JOptionPane.showInputDialog("Digite um n�mero:"));
		int b = Integer.parseInt(JOptionPane.showInputDialog("Digite outro n�mero:"));
		int x = Math.max(a, b); // O m�todo Math.max retorna o maior entre dois n�meros, assim como o Math.min
								// retorna o m�nimo
		JOptionPane.showMessageDialog(null, "O n�mero MAIOR �: " + x);
	}

}
