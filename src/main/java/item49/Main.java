package item49; 

import java.util.Scanner; 

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        int senha = 2002; 
        int pin; 

        System.out.println("Digite a senha:"); 

        pin = sc.nextInt(); // Lê o primeiro valor digitado pelo usuário

        // Enquanto o PIN digitado for diferente da senha correta, o programa continua pedindo um novo valor
        while (pin != senha) {
            System.out.println("Acesso negado"); // Informa que o PIN está incorreto
            pin = sc.nextInt(); // Lê um novo PIN do usuário
        }

        // Quando o usuário digitar a senha correta, o loop termina e esta mensagem é exibida
        System.out.println("Acesso permitido");

        sc.close(); // Fecha o Scanner para evitar consumo desnecessário de recursos
    }
}