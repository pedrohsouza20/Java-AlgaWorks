package primeiraclasse;

public class PrimeiraClasse {

	public static void main(String[] args) {
		Produto produto =  new Produto();
		
		produto.nome = "Celular";
		produto.valorUnitario = 2.400;
		produto.quantidade = 10;
		exibirQuantidadeEmEstoque(produto);
		
		if(necessitaReporEstoque(produto)) {
			System.out.println("Necessita repor estoque");
		} else { 
			System.out.println("Não necessita repor estoque");
		}
		
	}
	
	static void exibirQuantidadeEmEstoque(Produto produto) {
		System.out.println("A quantidade em estoque do produto " + produto.nome + " é " + produto.quantidade);;
	}

	static Boolean necessitaReporEstoque(Produto produto) {
		return produto.quantidade < 10;
	}
	
}
