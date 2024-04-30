package leituraarquivos;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class LeituraArquivos {

	public static void main(String[] args) throws IOException{
		Path diretorio = Paths.get("C:\\Users\\Sammer\\Desktop/texto.txt");
		
		List<String> linhas = Files.readAllLines(diretorio);
		
		for(int i = 0; i < linhas.size(); i++) {
			String tarefa = linhas.get(i);
			System.out.println(tarefa);
		}
	}

}
