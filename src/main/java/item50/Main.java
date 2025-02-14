package item50;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		System.out.println("Progama para somar valores!");
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite a quantidade de número a serem somados: ");
		int N = sc.nextInt();
		
		int soma = 0;
		for (int i = 0; i < N; i++) {
			System.out.printf("Digite o %dº numero: ",i+1);
			int x = sc.nextInt(); // este comando já gera quebra de linha
			soma += x;  // soma = soma + x
		}
		
		System.out.println("O valor da soma é: " + soma);
		
		sc.close();
	}

}
