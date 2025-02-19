package item55; 

import java.util.Locale; 
import java.util.Scanner;

public class Main { 

	public static void main(String[] args) { 

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		char resp; // Declara a variável 'resp' que armazenará a resposta do usuário

		do { // Início do loop "do-while", que garante que o bloco de código será executado
				// pelo menos uma vez

			System.out.print("Digite a temperatura em Celsius: "); // Solicita ao usuário que digite a temperatura em
																	// Celsius
			double C = sc.nextDouble(); // Lê a entrada do usuário e armazena na variável 'C'

			double F = 9.0 * C / 5.0 + 32.0; // Converte a temperatura de Celsius para Fahrenheit usando a fórmula
												// apropriada

			System.out.printf("A temperatura em Fahrenheit é: %.1f%n ", F);
			// Exibe a temperatura convertida em Fahrenheit com uma casa decimal

			System.out.println("Deseja repetir (s/n)?"); // Pergunta ao usuário se deseja repetir a conversão

			resp = sc.next().charAt(0); // Lê a resposta do usuário e armazena o primeiro caractere digitado na variável
										// 'resp'

		} while (resp != 'n'); // O loop continuará enquanto 'resp' for diferente de 'n'

		sc.close(); // Fecha o Scanner para liberar recursos do sistema
	}
}