package item40;

public class Main {
	public static void main(String[] args) {
		double preco = 34.5;
		double desconto = (preco < 20) ? preco * 0.1 : preco * 0.05;
		
//		if (preco == 30) {
//			System.out.println("Preço é menor que R$ 30,00");
//		}
		
//		if (preco < 20.0) {
//			desconto = preco * 0.1; // Desconto de 10%
//		} else {
//			desconto = preco * 0.05; // Desconto de 5%
//		}
		
		System.out.println("Valor do desconto calculado: R$" + desconto);
	}

}
