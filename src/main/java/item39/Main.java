package item39;

import java.util.Locale;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
//		Teste-01: 
//		Teste-02: 
//		Teste-03: 
//		Teste-04: 
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite o numero do dia da semana: ");
		int x = sc.nextInt();
		
		String dia;
		
		if (x == 1) {
			dia = "domingo";
		} else if (x == 2) {
			dia = "segunda";
		} else if (x == 3) {
			dia = "terca";
		} else if (x == 4) {
			dia = "quarta";
		} else if (x == 5) {
			dia = "quinta";
		} else if (x == 6) {
			dia = "sexta";
		} else if (x == 7) {
			dia = "sexta";
		} else {
			dia = "valor invalido";
		} 		
		System.out.println("Dia da semana: " + dia);
		
		sc.close();
	}

}
