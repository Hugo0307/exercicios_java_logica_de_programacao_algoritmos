package exercicioslista;

import java.text.DecimalFormat;

import javax.swing.JOptionPane;

public class Exercicio10 {

	public static void main(String[] args) {

		/*
		 * O custo de um carro novo ao consumidor é a soma do custo de fábrica com a
		 * porcentagem do distribuidor e dos impostos (aplicados ao custo de fábrica).
		 * Supondo que o percentual do distribuidor seja de 28% e os impostos de 45%,
		 * escrever um algoritmo para ler o custo de fábrica de um carro, calcular e
		 * escrever o custo final ao consumidor.
		 */

		double custo_fabrica, perc_distribuidor, impostos, preco_consumidor;

		JOptionPane.showMessageDialog(null, "Preço do Veículo ao Consumidor");
		custo_fabrica = Double.parseDouble(JOptionPane.showInputDialog("Digite o preço de fábrica: "));

		perc_distribuidor = (custo_fabrica * 28) / 100;
		impostos = (custo_fabrica * 45) / 100;
		preco_consumidor = (custo_fabrica + perc_distribuidor + impostos);
		DecimalFormat df = new DecimalFormat("0,000.00");
		String p_consumidor = df.format(preco_consumidor);
		JOptionPane.showMessageDialog(null, "Preço do Veículo ao Consumidor é de " + p_consumidor);

	}

}
