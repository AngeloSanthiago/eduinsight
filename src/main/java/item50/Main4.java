package item50;

import java.util.Scanner; 

public class Main4 {
    public static void main(String[] args) {
      
        Scanner sc = new Scanner(System.in);

        // Lê um número inteiro fornecido pelo usuário
        int x = sc.nextInt();

        // Percorre apenas os números ímpares de 1 até X, incrementando de 2 em 2
        for (int i = 1; i <= x; i += 2) {
            // Imprime o número ímpar atual
            System.out.println(i);
        }

        
        sc.close();
    }
}
