package item30; // Declara o pacote onde a classe está localizada

// Importação de classes da biblioteca padrão do Java
import java.util.Scanner; // Scanner para entrada de dados do usuário
import java.util.Locale;  // Locale para configurar o formato regional (por exemplo, ponto decimal)

public class Main { // Declaração da classe principal chamada "Main"
    
    public static void main(String[] args) { // Método principal, ponto de entrada do programa
        
        // Configura o local padrão para o formato dos números e textos como sendo dos Estados Unidos (ponto decimal, por exemplo)
        Locale.setDefault(Locale.US);
        
        // Criação do objeto Scanner para ler entradas do usuário via console
        Scanner sc = new Scanner(System.in);
        
        // Declaração de uma variável inteira
        int x;
        
        // Declaração de três variáveis do tipo String para armazenar texto
        String s1, s2, s3;

        // Lê um número inteiro do console e o armazena na variável x
        x = sc.nextInt();
        
        // Lê a próxima linha em branco após o número (para evitar problemas com leitura de texto subsequente)
        sc.nextLine();

        // Lê uma linha de texto e a armazena na variável s1
        s1 = sc.nextLine();

        // Lê outra linha de texto e a armazena na variável s2
        s2 = sc.nextLine();

        // Lê mais uma linha de texto e a armazena na variável s3
        s3 = sc.nextLine();

        // Exibe no console uma mensagem indicando que os dados digitados serão apresentados
        System.out.println("DADOS DIGITADOS:");

        // Exibe o valor inteiro armazenado na variável x
        System.out.println(x);

        // Exibe as três Strings armazenadas nas variáveis s1, s2 e s3
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);

        // Fecha o objeto Scanner para liberar os recursos de entrada
        sc.close();
    }
}