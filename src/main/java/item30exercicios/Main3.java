package item30exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite qualquer número: ");
        double n1 = sc.nextDouble();

        // Verifica se o número está fora do intervalo permitido [0,100]
        if (n1 < 0 || n1 > 100) {
            System.out.println("Fora de intervalo"); 
        }
        // Verifica se está no intervalo [0, 25]
        else if (n1 <= 25) { 
            System.out.println("Intervalo [0, 25]");
        }
        // Verifica se está no intervalo (25, 50]
        else if (n1 <= 50) { 
            System.out.println("Intervalo (25, 50]");
        }
        // Verifica se está no intervalo (50, 75]
        else if (n1 <= 75) { 
            System.out.println("Intervalo (50, 75]");
        }
        // Se não entrou nas condições acima, está no intervalo (75, 100]
        else { 
            System.out.println("Intervalo (75, 100]");
            
            
        }
        sc.close();
    }
}