package exercicioslista;

import javax.swing.JOptionPane;

public class Exercicio14 {

	public static void main(String[] args) {

		/*
		 * Ler um valor e escrever a mensagem � MAIOR QUE 10! se o valor lido for maior
		 * que 10, caso contr�rio escrever N�O � MAIOR QUE 10!
		 */

		int valor = Integer.parseInt(JOptionPane.showInputDialog("Digite um n�mero inteiro: "));
		if (valor > 10) {
			JOptionPane.showMessageDialog(null, "� MAIOR QUE 10!");
		} else if (valor < 10) {
			JOptionPane.showMessageDialog(null, "� MENOR QUE 10!");
		}
		if (valor == 10) {
			JOptionPane.showMessageDialog(null, "N�O � MAIOR NEM MENOR QUE 10!");
		}

	}

}
