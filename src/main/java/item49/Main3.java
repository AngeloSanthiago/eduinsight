package item49;

import java.util.Scanner;

public class Main3 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in); 

		int alcool = 0; // Variável para contar a quantidade de votos para "álcool"
		int gasolina = 0; // Variável para contar a quantidade de votos para "gasolina"
		int diesel = 0; // Variável para contar a quantidade de votos para "diesel"

		int tipo = sc.nextInt(); // Lê o primeiro número digitado pelo usuário

		// Enquanto o usuário não digitar "4", o loop continuará executando
		while (tipo != 4) {
			if (tipo == 1) {
				alcool = alcool + 1; // Se o usuário digitar 1, aumenta a contagem de álcool
			} else if (tipo == 2) {
				gasolina = gasolina + 1; // Se o usuário digitar 2, aumenta a contagem de gasolina
			} else if (tipo == 3) {
				diesel = diesel + 1; // Se o usuário digitar 3, aumenta a contagem de diesel
			}

			tipo = sc.nextInt(); // Lê um novo número para continuar o loop
		}

		// Quando o usuário digitar "4", o loop para e exibe as mensagens abaixo:
		System.out.println("MUITO OBRIGADO");
		System.out.println("Alcool: " + alcool); // Mostra a quantidade de votos para álcool
		System.out.println("Gasolina: " + gasolina); // Mostra a quantidade de votos para gasolina
		System.out.println("Diesel: " + diesel); // Mostra a quantidade de votos para diesel

		sc.close(); // Fecha o Scanner para evitar vazamento de recursos
	}
}