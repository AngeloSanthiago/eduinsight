package item59;

public class Main2 {

	public static void main(String[] args) {

		// Declara uma string contendo uma frase
		String s = "Supere seus proprios limites";

		// Usa a função split() para dividir a string em palavras, separando pelos
		// espaços em branco (" ")
		String[] vect = s.split(" ");

		// Exibe cada palavra separadamente com base no índice do vetor resultante
		System.out.println(vect[0]); // Supere
		System.out.println(vect[1]); // seus
		System.out.println(vect[2]); // proprios
		System.out.println(vect[3]); // limites
	}
}
