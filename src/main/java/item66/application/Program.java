package item66.application;

import java.util.Locale;
import java.util.Scanner;

import item66.entities.Triangle;


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
				
		double areaX = x.area();
		
		double areaY = y.area();
		
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
