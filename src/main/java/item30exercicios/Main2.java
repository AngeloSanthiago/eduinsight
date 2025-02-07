package item30exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Main2 {

    public static void main(String[] args) {

        // Define o padrão de localização para os Estados Unidos (garante que a vírgula seja substituída por ponto)
        Locale.setDefault(Locale.US);

        // Cria um objeto Scanner para capturar entrada do usuário
        Scanner sc = new Scanner(System.in);

        // Lê o salário informado pelo usuário
        double salario = sc.nextDouble();
        
        // Variável para armazenar o valor do imposto calculado
        double imposto;

        // Verifica a faixa salarial para calcular o imposto
        if (salario <= 2000.0) {
            // Salários até R$2000,00 são isentos de imposto
            imposto = 0.0;
        }
        else if (salario <= 3000.0) {
            // Para salários entre R$2000,01 e R$3000,00: aplica-se 8% sobre o valor acima de R$2000,00
            imposto = (salario - 2000.0) * 0.08;
        }
        else if (salario <= 4500.0) {
            // Para salários entre R$3000,01 e R$4500,00:
            // - A parte entre R$2000,01 e R$3000,00 é tributada a 8%
            // - O valor acima de R$3000,00 é tributado a 18%
            imposto = (salario - 3000.0) * 0.18 + 1000.0 * 0.08;
        }
        else {
            // Para salários acima de R$4500,00:
            // - A parte entre R$2000,01 e R$3000,00 é tributada a 8%
            // - A parte entre R$3000,01 e R$4500,00 é tributada a 18%
            // - A parte acima de R$4500,00 é tributada a 28%
            imposto = (salario - 4500.0) * 0.28 + 1500.0 * 0.18 + 1000.0 * 0.08;
        }

        // Exibe o resultado do imposto calculado
        if (imposto == 0.0) {
            // Se o imposto for zero, exibe "Isento"
            System.out.println("Isento");
        }
        else {
            // Caso contrário, imprime o valor do imposto com duas casas decimais
            System.out.printf("R$ %.2f%n", imposto);
        }
        
        // Fecha o Scanner para liberar os recursos
        sc.close();
    }
}