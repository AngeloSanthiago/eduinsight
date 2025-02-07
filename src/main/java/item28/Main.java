package item28;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);
        double A, B, C, atri, acir, atra, aqua, areta, pi = 3.14159;

        // Leitura dos valores
        A = sc.nextDouble();  // Valor A
        B = sc.nextDouble();  // Valor B
        C = sc.nextDouble();  // Valor C

        // Cálculo das áreas
        atri =  A * C / 2.0;  // Área do Triângulo: (A * C) / 2
        acir = pi * Math.pow(C, 2.0);  // Área do Círculo: π * C²
        atra = ((A + B) * C) / 2.0;  // Área do Trapézio: ((A + B) * C) / 2
        aqua = Math.pow(B, 2.0);  // Área do Quadrado: B²
        areta = A * B;  // Área do Retângulo: A * B

        // Exibição das áreas com 3 casas decimais
        System.out.printf("AREA DO TRIANGULO = %.3f%n", atri);
        System.out.printf("AREA DO CIRCULO = %.3f%n", acir);
        System.out.printf("AREA DO TRAPEZIO = %.3f%n", atra);
        System.out.printf("AREA DO QUADRADO = %.3f%n", aqua);
        System.out.printf("AREA DO RETANGULO = %.3f%n", areta);
        
        sc.close();
    }
}