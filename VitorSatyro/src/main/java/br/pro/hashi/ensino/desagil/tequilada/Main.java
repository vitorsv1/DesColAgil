package br.pro.hashi.ensino.desagil.tequilada;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {
	public static void main(String args[]){

		//System.out.println("Projeto 1");
		
		/* O c�digo estava dando erro no arquivo Labitinto.java
		 * Por isso deixei ele no Main para rodar sem aviso de erro
		 */

		String nomeArq = "labirinto.txt";

		try{

			FileReader arquivo = new FileReader(nomeArq);
			BufferedReader lerArq = new BufferedReader(arquivo);

			String primeiraLinha = lerArq.readLine();
			//Pulando a primera linha do arquivo
			primeiraLinha = lerArq.readLine();

			//Criando uma lista de chars para ler cada palavra			
			char[] letras = null;

			//Pulando Linha
			System.out.println();
			
			while(primeiraLinha != null){

				//Adicionando cada palavra da linha em um Array
				letras = primeiraLinha.toCharArray();
				for(int l = 0; l < letras.length;l++){
					if(letras[l] == '#'){
						letras[l] = 'X';
					}
				}
				System.out.println(letras);
				primeiraLinha = lerArq.readLine();

			}

			arquivo.close();

		} catch (IOException e){

			for (int i = 0; i < 100; ++i){
				System.out.println();
			}

			System.out.printf("Erro ao abrir o arquivo", e.getMessage());

		}

		System.out.println();

	  	}
		
	}

