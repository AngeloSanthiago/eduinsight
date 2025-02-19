package item59;

public class Main {

    public static void main(String[] args) {

        // String original
        String original = "abcde FGHIJ ABC abc DEFG   ";

        // Converte todos os caracteres da string para letras minúsculas
        String s01 = original.toLowerCase();

        // Converte todos os caracteres da string para letras maiúsculas
        String s02 = original.toUpperCase();

        // Remove os espaços em branco no início e no final da string
        String s03 = original.trim();

        // Retorna a substring a partir do índice 2 até o final da string
        String s04 = original.substring(2);

        // Retorna a substring do índice 2 até o índice 9 (exclui o índice 9)
        String s05 = original.substring(2, 9);

        // Substitui todas as ocorrências do caractere 'a' pelo caractere 'x'
        String s06 = original.replace('a', 'x');

        // Substitui todas as ocorrências da sequência "abc" pela sequência "xy"
        String s07 = original.replace("abc", "xy");

        // Retorna o índice da primeira ocorrência da substring "bc"
        int i = original.indexOf("bc");

        // Retorna o índice da última ocorrência da substring "bc"
        int j = original.lastIndexOf("bc");

        // Exibe a string original
        System.out.println("Original: -" + original + "-");

        // Exibe a string convertida para minúsculas
        System.out.println("toLowerCase: -" + s01 + "-");

        // Exibe a string convertida para maiúsculas
        System.out.println("toUpperCase: -" + s02 + "-");

        // Exibe a string sem os espaços em branco no início e no final
        System.out.println("trim: -" + s03 + "-");

        // Exibe a substring a partir do índice 2
        System.out.println("substring(2): -" + s04 + "-");

        // Exibe a substring do índice 2 ao 9
        System.out.println("substring(2, 9): -" + s05 + "-");

        // Exibe a string após substituir 'a' por 'x'
        System.out.println("replace('a', 'x'): -" + s06 + "-");

        // Exibe a string após substituir "abc" por "xy"
        System.out.println("replace('abc', 'xy'): -" + s07 + "-");

        // Exibe o índice da primeira ocorrência de "bc"
        System.out.println("Index of 'bc': " + i);

        // Exibe o índice da última ocorrência de "bc"
        System.out.println("Last index of 'bc': " + j);
    }
}
