package exercicioslista;

import java.text.DecimalFormat;//Para importar pressionar ctrl + shift + O 

import javax.swing.JOptionPane;

public class Exercicio13 {

	public static void main(String[] args) {

		/*
		 * Fa�a um algoritmo que leia tr�s notas de um aluno, calcule e escreva a m�dia
		 * final deste aluno. Considerar que a m�dia � ponderada e que o peso das notas
		 * � 2, 3 e 5. F�rmula para o c�lculo da m�dia final �: 
		 * 					n1 * 2 + n2 * 3 + n3 * 5
		 * mediafinal = ----------------------------------- 
		 * 								10
		 */

		double n1, n2, n3, media;

		JOptionPane.showInternalMessageDialog(null, "Calcule a M�dia Final do aluno");

		n1 = Double.parseDouble(JOptionPane.showInputDialog("Digite a primeira nota: "));

		n2 = Double.parseDouble(JOptionPane.showInputDialog("Digite a segunda nota: "));

		n3 = Double.parseDouble(JOptionPane.showInputDialog("Digite a terceira nota: "));

		media = (n1 * 2 + n2 * 3 + n3 * 5) / 10;
		DecimalFormat df = new DecimalFormat("0.00");// importou a classe DecimalFormat para formatar o decimal com 2
														// casas ap�s a "v�rgula"
		String m_final = df.format(media); // criou uma string para receber a formata��o decimal e ser concatenada �
											// mensagem de sa�da

		JOptionPane.showInternalMessageDialog(null, "A M�dia Final do aluno: " + m_final);// Sa�da com concatena��o da
																							// string formatada por
																							// DecimalFormat

	}

}
