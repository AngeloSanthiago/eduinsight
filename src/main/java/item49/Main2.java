package item49;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int x, y;
        
        // Leitura inicial
        x = sc.nextInt();
        y = sc.nextInt();
        
        // Enquanto x e y não forem 0, continuar
        while (x != 0 && y != 0) {
            if (x > 0 && y > 0) {
                System.out.println("Primeiro Quadrante");
            } else if (x < 0 && y > 0) {
                System.out.println("Segundo Quadrante");
            } else if (x < 0 && y < 0) {
                System.out.println("Terceiro Quadrante");
            } else {
                System.out.println("Quarto Quadrante");
            }

            // Ler novos valores para continuar ou encerrar o loop
            x = sc.nextInt();
            y = sc.nextInt();
        }
        
        sc.close();
    }
}