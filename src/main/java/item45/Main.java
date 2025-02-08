package item45;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();

        // Inicializa a variável 'soma' com 0 para armazenar a soma acumulada dos números digitados
        int soma = 0;

        // Estrutura de repetição "while"
        // Enquanto a condição (x != 0) for verdadeira, o bloco de código será executado
        while (x != 0) { 
            // Adiciona o valor de 'x' à variável 'soma'
            soma = soma + x;
            
            // Lê outro número digitado pelo usuário
            x = sc.nextInt(); 
        }

        // Quando o usuário digitar 0, a condição do "while" será falsa, e o laço será encerrado

        // Exibe a soma total dos números digitados
        System.out.println(soma);

        // Fecha o objeto Scanner para liberar recursos
        sc.close();
    }
}

