package exercicioslista;

import javax.swing.JOptionPane;

public class Exercicio12 {

	public static void main(String[] args) {

		/*
		 * Escreva um algoritmo para ler uma temperatura em graus Fahrenheit, calcular e
		 * escrever o valor correspondente em graus Celsius (baseado na f�rmula abaixo):
		 * 		 C			F - 32
		 *   ---------- = -----------  
		 * 		 5			  9
		 * Observa��o: Para testar se a sua resposta est� correta saiba que 100oC = 212F
		 */

		Double fahrenheint, celcius;

		JOptionPane.showMessageDialog(null, "Conversor de Temperatura - F� em C�");
		fahrenheint = Double.parseDouble(JOptionPane.showInputDialog("Graus em Fahrenheint: "));
		celcius = ((fahrenheint - 32) * 5) / 9;
		JOptionPane.showMessageDialog(null, "A temperatura em Celsius � " + celcius + "�.");

	}

}
