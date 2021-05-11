package exercicioslista;

import java.text.DecimalFormat;//Para importar pressionar ctrl + shift + O 

import javax.swing.JOptionPane;

public class Exercicio13 {

	public static void main(String[] args) {

		/*
		 * Faça um algoritmo que leia três notas de um aluno, calcule e escreva a média
		 * final deste aluno. Considerar que a média é ponderada e que o peso das notas
		 * é 2, 3 e 5. Fórmula para o cálculo da média final é: 
		 * 					n1 * 2 + n2 * 3 + n3 * 5
		 * mediafinal = ----------------------------------- 
		 * 								10
		 */

		double n1, n2, n3, media;

		JOptionPane.showInternalMessageDialog(null, "Calcule a Média Final do aluno");

		n1 = Double.parseDouble(JOptionPane.showInputDialog("Digite a primeira nota: "));

		n2 = Double.parseDouble(JOptionPane.showInputDialog("Digite a segunda nota: "));

		n3 = Double.parseDouble(JOptionPane.showInputDialog("Digite a terceira nota: "));

		media = (n1 * 2 + n2 * 3 + n3 * 5) / 10;
		DecimalFormat df = new DecimalFormat("0.00");// importou a classe DecimalFormat para formatar o decimal com 2
														// casas após a "vírgula"
		String m_final = df.format(media); // criou uma string para receber a formatação decimal e ser concatenada à
											// mensagem de saída

		JOptionPane.showInternalMessageDialog(null, "A Média Final do aluno: " + m_final);// Saída com concatenação da
																							// string formatada por
																							// DecimalFormat

	}

}
