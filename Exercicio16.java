package exercicioslista;

import java.text.DecimalFormat;

import javax.swing.JOptionPane;

public class Exercicio16 {

	public static void main(String[] args) {
		/*
		 * As maçãs custam R$ 1,30 cada se forem compradas menos de uma dúzia, e R$ 1,00
		 * se forem compradas pelo menos 12. Escreva um programa que leia o número de
		 * maçãs compradas, calcule e escreva o custo total da compra.
		 */

		int x = Integer.parseInt(JOptionPane.showInputDialog(" Quantas maçãs foram compradas? "));

		if (x < 12) {
			double v1 = x * 1.30;
			DecimalFormat df = new DecimalFormat("0.00");
			String v01 = df.format(v1);
			JOptionPane.showMessageDialog(null, "O custo total da compra é R$ " + v01);
		} else if (x >= 12) {
			double v2 = x * 1;
			DecimalFormat df = new DecimalFormat("0.00");
			String v02 = df.format(v2);
			JOptionPane.showMessageDialog(null, "O custo total da compra é R$ " + v02);
		}
	}

}