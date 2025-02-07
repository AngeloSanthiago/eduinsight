package item39;

import java.util.Locale;
import java.util.Scanner;

public class Main2 {
	public static void main(String[] args) {
//		Teste-01: informa input 1 e valor deve ser igual a "domingo"
//		Teste-02: informa input 4 e valor deve ser igual a "quarta"
//		Teste-03: 
//		Teste-04: 
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite o numero do dia da semana: ");
		int x = sc.nextInt();
		
		String dia;
		
		switch (x) {
		case 1:
			dia = "domingo";
			break;
		case 2:
			dia = "segunda";
			break;
		case 3:
			dia = "terca";
			break;
		case 4:
			dia = "quarta";
			break;
		case 5:
			dia = "quinta";
			break;
		case 6:
			dia = "sexta";
			break;
		case 7:
			dia = "sabado";
			break;
		default:
			dia = "valor invalido";
			break;
		}
		
		System.out.println("Dia da semana: " + dia);
		
		sc.close();
	}

}
