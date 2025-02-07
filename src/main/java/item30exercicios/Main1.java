package item30exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Main1 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        
        Scanner sc = new Scanner(System.in);

        // Lê as coordenadas X e Y digitadas pelo usuário
        double x = sc.nextDouble();
        double y = sc.nextDouble();
        
        // Verifica se o ponto está na origem (0,0)
        if (x == 0.0 && y == 0.0) {
            System.out.println("Origem");
        }
        // Verifica se o ponto está sobre o eixo Y (X = 0, mas Y ≠ 0)
        else if (x == 0.0) {
            System.out.println("Eixo Y");
        }
        // Verifica se o ponto está sobre o eixo X (Y = 0, mas X ≠ 0)
        else if (y == 0.0) {
            System.out.println("Eixo X");
        }
        // Verifica se o ponto está no primeiro quadrante (X > 0 e Y > 0)
        else if (x > 0.0 && y > 0.0) {
            System.out.println("Q1");
        }
        // Verifica se o ponto está no segundo quadrante (X < 0 e Y > 0)
        else if (x < 0.0 && y > 0.0) {
            System.out.println("Q2");
        }
        // Verifica se o ponto está no terceiro quadrante (X < 0 e Y < 0)
        else if (x < 0.0 && y < 0.0) {
            System.out.println("Q3");
        }
        // Se nenhuma das condições acima for verdadeira, o ponto está no quarto quadrante (X > 0 e Y < 0)
        else {
            System.out.println("Q4");
        }
        
        // Fecha o Scanner para liberar recursos
        sc.close();
    }
}