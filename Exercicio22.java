package exercicioslista;

import java.text.NumberFormat;
import java.util.Locale;

import javax.swing.JOptionPane;

public class Exercicio22 {

	public static void main(String[] args) {

		/*
		 * A jornada de trabalho semanal de um funcionário é de 40 horas. O funcionário
		 * que trabalhar mais de 40 horas receberá hora extra, cujo cálculo é o valor da
		 * hora regular com um acréscimo de 50%. Escreva um algoritmo que leia o número
		 * de horas trabalhadas em um mês, o salário por hora e escreva o salário total
		 * do funcionário, que deverá ser acrescido das horas extras, caso tenham sido
		 * trabalhadas (considere que o mês possua 4 semanas exatas).
		 */

		Locale localeBR = new Locale("pt", "BR");

		NumberFormat salarioEmReal = NumberFormat.getCurrencyInstance(localeBR);

		double jornadaMensal = 160;
		double hrTrabalhadas = Double
				.parseDouble(JOptionPane.showInputDialog("Digite a quantidade de horas trabalhadas no mês:"));
		double salarioHora = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do salário/hora:"));
		double hrExtras = hrTrabalhadas - jornadaMensal;
		double salarioRegular = (hrTrabalhadas - hrExtras) * salarioHora;

		if (hrTrabalhadas > jornadaMensal) {
			double valorHrExtras = hrExtras * ((salarioHora * 50) / 100);
			JOptionPane.showMessageDialog(null,
					" O total salário é de: " + salarioEmReal.format(salarioRegular + valorHrExtras));
		} else {
			JOptionPane.showMessageDialog(null, "O total salário é de: " + salarioEmReal.format(salarioRegular));
		}

	}

}
