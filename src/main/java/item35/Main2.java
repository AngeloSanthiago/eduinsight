package item35;

import java.util.Scanner;

public class Main2 {
	public static void main(String[] argumetos) {
		Scanner sc = new Scanner(System.in);
		int hora;
		
		System.out.print("Quantas horas são? ==>");
		hora = sc.nextInt();
		
		if (hora < 12) {
			System.out.println("Bom dia!");
		}else {
			if (hora < 18) {
				System.out.println("Boa tarde!");
			}else {
				System.out.println("Boa noite!");
			}
		}
		
		sc.close();
	}

}
