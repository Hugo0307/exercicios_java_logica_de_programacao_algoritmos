package exercicioslista;

import javax.swing.JOptionPane;

public class Exercicio14 {

	public static void main(String[] args) {

		/*
		 * Ler um valor e escrever a mensagem É MAIOR QUE 10! se o valor lido for maior
		 * que 10, caso contrário escrever NÃO É MAIOR QUE 10!
		 */

		int valor = Integer.parseInt(JOptionPane.showInputDialog("Digite um número inteiro: "));
		if (valor > 10) {
			JOptionPane.showMessageDialog(null, "É MAIOR QUE 10!");
		} else if (valor < 10) {
			JOptionPane.showMessageDialog(null, "É MENOR QUE 10!");
		}
		if (valor == 10) {
			JOptionPane.showMessageDialog(null, "NÃO É MAIOR NEM MENOR QUE 10!");
		}

	}

}
