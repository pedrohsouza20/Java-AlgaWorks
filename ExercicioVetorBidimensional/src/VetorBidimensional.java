/*Dados os seguintes vetores, Exercício 02: Encontre a semana de maior faturamento*/

public class VetorBidimensional {
	public static void main(String[] args) {
		Double[] semanaUm = new Double[]{ 1000.0, 1500.0, 1250.0, 2100.0, 1350.0, 970.0, 0.0 };
		Double[] semanaDois = new Double[]{ 1050.0, 2500.0, 3250.0, 1100.0, 1430.0, 900.0, 0.0 };
		Double[] semanaTres = new Double[]{ 1700.0, 1300.0, 1450.0, 2000.0, 1390.0, 800.0, 0.0 };
		Double[] semanaQuatro = new Double[]{ 2100.0, 1600.0, 1850.0, 2100.0, 1220.0, 998.0, 0.0 };

		Double[][] mes = new Double[][] { semanaUm, semanaDois, semanaTres, semanaQuatro };	
		
		Double totalValue = 0.0;
		int semanaIndex = 0;
		
		for(int i = 0; i < mes.length; i++) {
			Double[] semana = mes[i];
			Double auxValue = 0.0;
			
			// Defino a variavel auxValue dentro do escopo do primeiro for,
			// Que representa cada semana. A variavél recebe 0.0 cada vez
			// Que o loop começa a rodar em uma determinada semana
			
			for(int j = 0; j < semana.length; j ++) {
				System.out.println(mes[i][j]);
				auxValue += mes[i][j];
			}
			
			if(auxValue > totalValue) {
				totalValue = auxValue;
				semanaIndex = i;
			}
			
			// Caso o valor total de cada dia de determinada semana
			// Seja maior que a variável de escopo global totalValue,
			// Esta última recebe o valor de faturamento total de tal semana
			// E, além disso, a varável semanaIndex recebe o valor referente
			// A semana do looping atual, e, assim, obtenho o número da
			// Semana atual
			
		}
		
		System.out.println("A semana de maior faturamento foi a semana " + (semanaIndex + 1) +", " + "somando " + totalValue + ".");
		
	}
}
