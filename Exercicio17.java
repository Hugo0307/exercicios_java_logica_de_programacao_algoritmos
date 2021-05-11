package exercicioslista;

import javax.swing.JOptionPane;

public class Exercicio17 {

	public static void main(String[] args) {
		/*
		 * Ler as notas da 1a. e 2a. avaliações de um aluno. Calcular a média aritmética
		 * simples e escrever uma mensagem que diga se o aluno foi ou não aprovado
		 * (considerar que nota igual ou maior que 6 o aluno é aprovado). Escrever
		 * também a média calculada.
		 * 
		 */

		double n1 = Double.parseDouble(JOptionPane.showInputDialog("Digite a nota da 1ª avaliação: "));
		double n2 = Double.parseDouble(JOptionPane.showInputDialog("Digite a nota da 2ª avaliação: "));
		double media = (n1 + n2) / 2;
		if (media >= 6) {
			JOptionPane.showMessageDialog(null, "Média = " + media + "\n" + "ALUNO APROVADO!");
		} else {
			JOptionPane.showMessageDialog(null, "Média = " + media + "\n" + "ALUNO REPROVADO!");
		}

	}

}
