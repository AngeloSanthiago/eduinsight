package item30exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Main4 {
	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o Codigo do Produto: ");
		int cod = sc.nextInt();
		System.out.println("Digite a Quantidade do Produto: ");
		int quant = sc.nextInt();
		double valr;

		if (cod == 1) { // Verifica se o código do produto é 1
		    valr = quant * 4.00; // Se for, o preço unitário do produto é 4.00 e calcula o valor total (quantidade * preço)
		} else if (cod == 2) { // Verifica se o código do produto é 2
		    valr = quant * 4.50; // Se for, o preço unitário do produto é 4.50 e calcula o valor total
		} else if (cod == 3) { // Verifica se o código do produto é 3
		    valr = quant * 5.00; // Se for, o preço unitário do produto é 5.00 e calcula o valor total
		} else if (cod == 4) { // Verifica se o código do produto é 4
		    valr = quant * 2.00; // Se for, o preço unitário do produto é 2.00 e calcula o valor total
		} else // Caso nenhum dos códigos acima seja informado, executa este bloco
		    valr = quant * 1.50; // Define o preço unitário como 1.50 e calcula o valor total
		System.out.printf("O total a pagar: %.2f%n ", valr);
			sc.close();
	}
		
}
