package item40;

import java.util.Locale;
import java.util.Scanner;

public class Main2 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US); // Define o formato de números para o padrão dos EUA
        //Scanner sc = new Scanner(System.in);

        // Expressão condicional ternária
        double preco = 34.5; // Define o preço do produto como 34.5
        
        // A linha abaixo calcula o desconto usando a expressão condicional ternária:
        // (preco < 20) ? preco * 0.1 : preco * 0.05;
        // - Se a condição (preco < 20) for verdadeira, calcula o desconto como preco * 0.1 (10%).
        // - Caso contrário (condição falsa), calcula o desconto como preco * 0.05 (5%).
        double desconto = (preco < 20) ? preco * 0.1 : preco * 0.05;

        // Exibe o valor do desconto calculado
        System.out.println("desconto = " + desconto);

//        sc.close(); // Fecha o objeto Scanner para liberar recursos
    }

}