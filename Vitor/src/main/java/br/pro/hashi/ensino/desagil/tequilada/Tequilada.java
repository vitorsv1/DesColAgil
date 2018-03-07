package br.pro.hashi.ensino.desagil.tequilada;

import java.io.IOException;

public class Tequilada {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		Engine engine = new Engine();

		// ADICIONE ESTAS LINHAS
		engine.update();
		System.out.println(engine.getCpuPlayer().getcol() + " " + engine.getCpuPlayer().getrow());
	}

}
