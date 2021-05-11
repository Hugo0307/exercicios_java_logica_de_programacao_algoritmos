package exercicioslista;

import java.text.DecimalFormat;

import javax.swing.JOptionPane;

public class Exercicio9 {

	public static void main(String[] args) {

		/*
		 * Escreva um algoritmo para ler o sal�rio mensal atual de um funcion�rio e o
		 * percentual de reajuste. Calcular e escrever o valor do novo sal�rio.
		 */
		
		double salario_atual, perc_salario, calc_salario, salario_novo;

		JOptionPane.showMessageDialog(null, "Saiba seu sal�rio com reajuste");
		salario_atual = Double.parseDouble(JOptionPane.showInputDialog("Digite sal�rio atual: "));
		perc_salario = Double.parseDouble(JOptionPane.showInputDialog("Digite qual o percentual de reajuste: "));
		calc_salario = (salario_atual * perc_salario) / 100;
		salario_novo = (salario_atual + calc_salario);
		DecimalFormat df = new DecimalFormat("00.00");
		String s_novo = df.format(salario_novo);
		JOptionPane.showMessageDialog(null, "O sal�rio com reajuste � R$ " + s_novo);
	}

}
