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
		String tarefa = "";
		
		ArrayList<String> linhas = new ArrayList<String>();
		
		System.out.print("Digite uma tarefa: ");
		tarefa = scanner.nextLine();
		linhas.add(tarefa);
		
		while(!(tarefa.equals("x"))) {
			System.out.print("Digite uma outra tarefa: ");
			tarefa = scanner.nextLine();
			linhas.add(tarefa);
		}

		scanner.close();
		
		Path diretorio = Paths.get("C:\\Users\\Sammer\\Desktop/texto.txt");
		Files.write(diretorio, linhas);
	}

}
