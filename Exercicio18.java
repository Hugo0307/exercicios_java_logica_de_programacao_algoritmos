package exercicioslista;

import javax.swing.JOptionPane;

public class Exercicio18 {

	public static void main(String[] args) {
		/*
		 * Ler o ano atual e o ano de nascimento de uma pessoa. Escrever uma mensagem
		 * que diga se ela poderá ou não votar este ano (não é necessário considerar o
		 * mês em que a pessoa nasceu).
		 */

		JOptionPane.showMessageDialog(null, "Saiba se você poderá votar neste ano!");
		int anoAtual = Integer.parseInt(JOptionPane.showInputDialog("Digite o ano atual:"));
		int anoNasc = Integer.parseInt(JOptionPane.showInputDialog("Digite o ano de seu nascimento"));
		int idade = anoAtual - anoNasc;
		if (idade >= 16) {
			JOptionPane.showMessageDialog(null, "Você pode SIM votar neste ano!");
		} else {
			JOptionPane.showMessageDialog(null, "Você NÃO pode votar neste ano!");
		}
	}

}
