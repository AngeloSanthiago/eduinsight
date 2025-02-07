package item24;

import java.util.Locale; // Importa a classe Locale para definir o formato numérico globalmente

public class Main {
	public static void main(String[] args) {

		// Declaração e inicialização de variáveis
		String product1 = "Computer";
		String product2 = "Office desk";

		int age = 30;
		int code = 5290;
		char gender = 'F'; // Variável do tipo caractere

		// Declaração de variáveis do tipo double para preços e medidas
		double price1 = 2100.0;
		double price2 = 650.50;
		double measure = 53.234567;

		// Exibição dos produtos e preços formatados com duas casas decimais
		System.out.printf("Products%n%s, which price is $ %.2f%n", product1, price1);
		System.out.printf("%s, which price is $ %.2f%n", product2, price2);
		System.out.println(); // Quebra de linha para melhor visualização

		// Exibição de informações pessoais
		System.out.printf("Record: %d years old, code %d and gender: %c%n", age, code, gender);
		System.out.println();

		// Exibição da medida com diferentes precisões decimais
		System.out.printf("Measure with eight decimal places: %.8f%n", measure);
		System.out.printf("Rounded (three decimal places): %.3f%n", measure);

		// Configura o formato numérico para o padrão dos EUA (ponto como separador
		// decimal)
		Locale.setDefault(Locale.US);
		System.out.printf("US decimal point: %.3f%n", measure);
	}
}
