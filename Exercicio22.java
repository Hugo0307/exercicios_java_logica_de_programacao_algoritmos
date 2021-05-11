package exercicioslista;

import java.text.NumberFormat;
import java.util.Locale;

import javax.swing.JOptionPane;

public class Exercicio22 {

	public static void main(String[] args) {

		/*
		 * A jornada de trabalho semanal de um funcion�rio � de 40 horas. O funcion�rio
		 * que trabalhar mais de 40 horas receber� hora extra, cujo c�lculo � o valor da
		 * hora regular com um acr�scimo de 50%. Escreva um algoritmo que leia o n�mero
		 * de horas trabalhadas em um m�s, o sal�rio por hora e escreva o sal�rio total
		 * do funcion�rio, que dever� ser acrescido das horas extras, caso tenham sido
		 * trabalhadas (considere que o m�s possua 4 semanas exatas).
		 */

		Locale localeBR = new Locale("pt", "BR");

		NumberFormat salarioEmReal = NumberFormat.getCurrencyInstance(localeBR);

		double jornadaMensal = 160;
		double hrTrabalhadas = Double
				.parseDouble(JOptionPane.showInputDialog("Digite a quantidade de horas trabalhadas no m�s:"));
		double salarioHora = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do sal�rio/hora:"));
		double hrExtras = hrTrabalhadas - jornadaMensal;
		double salarioRegular = (hrTrabalhadas - hrExtras) * salarioHora;

		if (hrTrabalhadas > jornadaMensal) {
			double valorHrExtras = hrExtras * ((salarioHora * 50) / 100);
			JOptionPane.showMessageDialog(null,
					" O total sal�rio � de: " + salarioEmReal.format(salarioRegular + valorHrExtras));
		} else {
			JOptionPane.showMessageDialog(null, "O total sal�rio � de: " + salarioEmReal.format(salarioRegular));
		}

	}

}
