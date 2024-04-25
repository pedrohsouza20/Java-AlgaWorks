package escritaarquivos;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class EscritaArquivos {

	public static void main(String[] args) throws IOException{
		Scanner scanner = new Scanner(System.in);
		
		ArrayList<String> linhas = new ArrayList<String>();
		
		for(int i = 0; i < 5; i ++) {
			System.out.print("Digite o nome do jogador " + (i+1) + ": ");
			String nome = scanner.nextLine();
			
			linhas.add(nome);
		}

		scanner.close();
		
		Path diretorio = Paths.get("C:\\Users\\Sammer\\Desktop/texto.txt");
		Files.write(diretorio, linhas);
		
	}

}
