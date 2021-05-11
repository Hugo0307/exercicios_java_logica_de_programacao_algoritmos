package exercicioslista;

import java.text.DecimalFormat;

import javax.swing.JOptionPane;

public class Exercicio11 {

	public static void main(String[] args) {

		/*
		 * Uma revendedora de carros usados paga a seus funcion�rios vendedores um
		 * sal�rio fixo por m�s, mais uma comiss�o tamb�m fixa para cada carro vendido e
		 * mais 5% do valor das vendas por ele efetuadas. Escrever um algoritmo que leia
		 * o n�mero de carros por ele vendidos, o valor total de suas vendas, o sal�rio
		 * fixo e o valor que ele recebe por carro vendido. Calcule e escreva o sal�rio
		 * final do vendedor.
		 */

		double salario_fixo, comissao_fixa, comissao_variavel, salario_final, valor_vendas;
		int qtd_vendas;

		JOptionPane.showMessageDialog(null, "C�lculo Sal�rio Final Vendedor");

		qtd_vendas = Integer.parseInt(JOptionPane.showInputDialog("Quantidade de carros vendidos no m�s: "));
		comissao_fixa = Double.parseDouble(JOptionPane.showInputDialog("Comiss�o fixa por venda: "));
		valor_vendas = Double.parseDouble(JOptionPane.showInputDialog("Valor total das vendas no m�s: "));
		salario_fixo = Double.parseDouble(JOptionPane.showInputDialog("Valor sal�rio fixo vendedor: "));
		comissao_variavel = (valor_vendas * 5) / 100;
		salario_final = (salario_fixo + comissao_fixa + comissao_variavel);

		DecimalFormat df = new DecimalFormat("0,000.00");
		String salario_f = df.format(salario_final);
		JOptionPane.showMessageDialog(null,
				"O sal�rio final do vendedor � R$ " + salario_f + " por " + qtd_vendas + " venda(s) no m�s.");

	}

}
