package exercicioslista;

import javax.swing.JOptionPane;

public class Exercicio18 {

	public static void main(String[] args) {
		/*
		 * Ler o ano atual e o ano de nascimento de uma pessoa. Escrever uma mensagem
		 * que diga se ela poder� ou n�o votar este ano (n�o � necess�rio considerar o
		 * m�s em que a pessoa nasceu).
		 */

		JOptionPane.showMessageDialog(null, "Saiba se voc� poder� votar neste ano!");
		int anoAtual = Integer.parseInt(JOptionPane.showInputDialog("Digite o ano atual:"));
		int anoNasc = Integer.parseInt(JOptionPane.showInputDialog("Digite o ano de seu nascimento"));
		int idade = anoAtual - anoNasc;
		if (idade >= 16) {
			JOptionPane.showMessageDialog(null, "Voc� pode SIM votar neste ano!");
		} else {
			JOptionPane.showMessageDialog(null, "Voc� N�O pode votar neste ano!");
		}
	}

}
