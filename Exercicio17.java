package exercicioslista;

import javax.swing.JOptionPane;

public class Exercicio17 {

	public static void main(String[] args) {
		/*
		 * Ler as notas da 1a. e 2a. avalia��es de um aluno. Calcular a m�dia aritm�tica
		 * simples e escrever uma mensagem que diga se o aluno foi ou n�o aprovado
		 * (considerar que nota igual ou maior que 6 o aluno � aprovado). Escrever
		 * tamb�m a m�dia calculada.
		 * 
		 */

		double n1 = Double.parseDouble(JOptionPane.showInputDialog("Digite a nota da 1� avalia��o: "));
		double n2 = Double.parseDouble(JOptionPane.showInputDialog("Digite a nota da 2� avalia��o: "));
		double media = (n1 + n2) / 2;
		if (media >= 6) {
			JOptionPane.showMessageDialog(null, "M�dia = " + media + "\n" + "ALUNO APROVADO!");
		} else {
			JOptionPane.showMessageDialog(null, "M�dia = " + media + "\n" + "ALUNO REPROVADO!");
		}

	}

}
