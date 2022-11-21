// Aplicação MVC no Spring

package com.elildes.vendas.model;

public class Item {

	private int num;
	private String nome;
	
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public Item(int num, String nome) {
		super();
		this.num = num;
		this.nome = nome;
	}	
}
