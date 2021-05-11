package exercicioslista;

import java.text.DecimalFormat;

import javax.swing.JOptionPane;

public class Exercicio16 {

	public static void main(String[] args) {
		/*
		 * As ma��s custam R$ 1,30 cada se forem compradas menos de uma d�zia, e R$ 1,00
		 * se forem compradas pelo menos 12. Escreva um programa que leia o n�mero de
		 * ma��s compradas, calcule e escreva o custo total da compra.
		 */

		int x = Integer.parseInt(JOptionPane.showInputDialog(" Quantas ma��s foram compradas? "));

		if (x < 12) {
			double v1 = x * 1.30;
			DecimalFormat df = new DecimalFormat("0.00");
			String v01 = df.format(v1);
			JOptionPane.showMessageDialog(null, "O custo total da compra � R$ " + v01);
		} else if (x >= 12) {
			double v2 = x * 1;
			DecimalFormat df = new DecimalFormat("0.00");
			String v02 = df.format(v2);
			JOptionPane.showMessageDialog(null, "O custo total da compra � R$ " + v02);
		}
	}

}