import java.util.Scanner;

public class CalcularValorTroco {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite o valor do produto: ");
		Double valorProduto = scanner.nextDouble();
		
		System.out.println("Digite o valor passado pelo cliente: ");
		Double valorPassadoPeloCliente = scanner.nextDouble();
		
		scanner.close();
		
		Double resultado = valorPassadoPeloCliente - valorProduto;
		
		System.out.println("Troco: " + resultado);
	}
	
}
