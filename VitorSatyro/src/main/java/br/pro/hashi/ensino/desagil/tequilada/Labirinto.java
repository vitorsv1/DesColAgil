package br.pro.hashi.ensino.desagil.tequilada;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Labirinto {

	String nomeArq = "labirinto.txt";

	try{

		FileReader arquivo = new FileReader(nomeArq);
		BufferedReader lerArq = new BufferedReader(arquivo);

		String primeiraLinha = lerArq.readLine();
		//Pulando a primera linha do arquivo
		primeiraLinha = lerArq.readLine();

		//Criando uma lista de chars para ler cada palavra			
		char[] letras = null;

		while(primeiraLinha != null){

			//Adicionando cada palavra da linha em um Array
			letras = primeiraLinha.toCharArray();
			for(int l = 0; l < letras.length; l++){
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
