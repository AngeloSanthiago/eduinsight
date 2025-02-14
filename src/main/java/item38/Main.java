package item38;

import java.util.Locale;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
//		Teste-01: testar com input igual a 20 e resultado deve ser 50
//		Teste-02: testar com input igual a 103 e resultado deve ser 56
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite a quantidade de minutos utilizados: ");
		int minutos = sc.nextInt();
		
		double conta = 50.0;
		
		if(minutos > 100) {
//			conta = conta + (minutos - 100) * 2.0;
			
			// Operador de atribuição cumulativa "+="
			conta += (minutos - 100) * 2.0;
		}
		
		System.out.printf("Valor da conta R$ %.2f%n", conta);
		
		sc.close();
	}

}
