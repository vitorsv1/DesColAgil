package br.pro.hashi.ensino.desagil.tequilada;

public class Player {
	private int col, row;
	
	public Player(int col, int row) {
		this.col = col;
		this.row = row;
	}
	
	public void move(int colShift, int rowShift) {
		col += colShift;
		row += rowShift;
	}
	
	public int getcol() {
		return col;
	}
	
	public int getrow() {
		return row;
	}
}
