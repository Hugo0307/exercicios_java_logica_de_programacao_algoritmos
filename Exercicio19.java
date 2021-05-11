package exercicioslista;

import javax.swing.JOptionPane;

public class Exercicio19 {

	public static void main(String[] args) {

		// Ler dois valores (considere que não serão lidos valores iguais) e escrever o
		// maior deles.

		int a = Integer.parseInt(JOptionPane.showInputDialog("Digite um número:"));
		int b = Integer.parseInt(JOptionPane.showInputDialog("Digite outro número:"));
		int x = Math.max(a, b); // O método Math.max retorna o maior entre dois números, assim como o Math.min
								// retorna o mínimo
		JOptionPane.showMessageDialog(null, "O número MAIOR é: " + x);
	}

}
