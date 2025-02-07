package item29;

import java.util.Scanner; 
import java.util.Locale; 

public class Main { 

    public static void main(String[] args) { 

        Locale.setDefault(Locale.US); 
        Scanner sc = new Scanner(System.in); 
        
        // Declaração das variáveis
        int caneca1, cafe2;         // Variáveis para armazenar os códigos da caneca e do café
        double qnt1, prec1;         // Quantidade e preço unitário das canecas
        double qnt2, prec2;         // Quantidade e preço unitário do café
        double vlrtotal;            // Variável para armazenar o valor total a ser pago

        // Leitura dos dados do usuário
        System.out.println("Qual o código da caneca? ");
        caneca1 = sc.nextInt(); // Lê o código da caneca
        
        System.out.println("Qual o código do café? ");
        cafe2 = sc.nextInt(); // Lê o código do café
        
        System.out.println("Quantas canecas tem? ");
        qnt1 = sc.nextDouble(); // Lê a quantidade de canecas disponíveis
        
        System.out.println("Qual o preço da caneca? ");
        prec1 = sc.nextDouble(); // Lê o preço unitário da caneca
        
        System.out.println("Qual o estoque do café? ");
        qnt2 = sc.nextDouble(); // Lê a quantidade de café disponível no estoque
        
        System.out.println("Qual o preço do café? ");
        prec2 = sc.nextDouble(); // Lê o preço unitário do café

        // Cálculo do valor total a ser pago
        vlrtotal = (qnt1 * prec1) + (qnt2 * prec2); // Multiplica quantidades pelos preços e soma os valores
        
        // Exibição do valor total no console
        System.out.println("Valor total a ser pago: ");
        System.out.printf("R$ %.2f ", vlrtotal); // Exibe o valor total com duas casas decimais
        
        sc.close(); // Fecha o objeto Scanner para liberar os recursos
    }

}