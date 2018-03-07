package br.pro.hashi.ensino.desagil.tequilada;
import java.io.*;

public class Board {
	private boolean[][] isWall;

	public Board(String path) {

		// A instru��o "try" delimita um trecho no qual erros
		// graves, que devem ser tratados, podem acontecer.
		try {
			// Objetos da classe FileReader n�o possuem o m�todo
			// readLine, ent�o constru�mos um objeto da classe
			// BufferedReader "em volta" para dar essa capacidade.
			BufferedReader reader = new BufferedReader(new FileReader(path));

			// L� a primeira linha do arquivo e devolve como String.
			String line = reader.readLine();

			// Usando espa�os em branco como o crit�rio de separa��o,
			// quebra a string em peda�os e devolve um vetor de strings.
			String[] words = line.split(" ");

			// Converte cada um dos dois peda�os em um inteiro.
			int numRows = Integer.parseInt(words[0]);
			int numCols = Integer.parseInt(words[1]);

			// Constr�i uma matriz, de acordo com o n�mero de colunas
			// e n�mero de linhas lidos do arquivo, e atribui a isWall.
			isWall = new boolean[numRows][numCols];

			// Para cada uma das linhas restantes do arquivo...
			for(int i = 0; i < numRows; i++) {
				line = reader.readLine();

				// Para cada um dos caracteres da linha...
				for(int j = 0; j < numCols; j++) {
					boolean value;

					if(line.charAt(j) == '#') {
						value = true;
					}
					else {
						value = false;
					}

					isWall[i][j] = value;
				}
			}

			// Fecha o reader, pois seu uso terminou.
			reader.close();
		}

		// Trata o erro FileNotFoundException, se ele acontecer.
		catch(FileNotFoundException exception) {
			System.out.println(exception);
		}

		// Trata o erro IOException, se ele acontecer.
		catch(IOException exception) {
			System.out.println(exception);
		}
	}
}