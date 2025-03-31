package item65.application;

import java.util.Locale;
import java.util.Scanner;

import item65.entities.Triangle;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Triangle x, y;
		x = new Triangle();
		y = new Triangle();
		
		System.out.println("Entre the measures of triangle X: ");
		x.a = sc.nextDouble(); // Exemplo: 3.00
		x.b = sc.nextDouble(); // Exemplo: 4.00
		x.c = sc.nextDouble(); // Exemplo: 5.00
		System.out.println("Entre the measures of triangle Y: ");
		y.a = sc.nextDouble(); // Exemplo: 7.50
		y.b = sc.nextDouble(); // Exemplo: 4.50
		y.c = sc.nextDouble(); // Exemplo: 4.02
		
		
		double p = (x.a + x.b + x.c) / 2.0;
		double areaX = Math.sqrt(p * (p-x.a) * (p-x.b) * (p-x.c));
		
		p = (y.a + y.b + y.c) / 2.0;
		double areaY = Math.sqrt(p * (p-y.a) * (p-y.b) * (p-y.c));
		
		System.out.printf("Triangle X area: %.4f%n", areaX);
		System.out.printf("Triangle Y area: %.4f%n", areaY);
		
		if(areaX > areaY) {
			System.out.println("Large area: X");
		}else {
			System.out.println("Large area: Y");
		}
		
		
		sc.close();
		
	}

}
